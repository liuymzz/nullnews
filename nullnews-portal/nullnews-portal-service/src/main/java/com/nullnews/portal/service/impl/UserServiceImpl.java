package com.nullnews.portal.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.mapper.UserFollowMapper;
import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserFollowExample;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoExample;
import com.nullnews.pojo.UserInfoExample.Criteria;
import com.nullnews.portal.service.UserService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class UserServiceImpl implements UserService {
	// 阿里云短信相关
	// 产品名称:云通信短信API产品,开发者无需替换
	static final String product = "Dysmsapi";
	// 产品域名,开发者无需替换
	static final String domain = "dysmsapi.aliyuncs.com";
	// TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
	@Value("${aliyunsms_accessKeyId}")
	private String accessKeyId;
	@Value("${aliyunsms_accessKeySecret}")
	private String accessKeySecret;
	@Value("${aliyunsms_signature}")
	private String smsSignature;
	@Value("${aliyunsms_template_code}")
	private String smsTemplateCode;

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private JedisPool jedisPool;
	@Autowired
	private UserFollowMapper userFollowMapper;

	@Override
	public UserInfo login(UserInfo user) {
		UserInfoExample uie = new UserInfoExample();
		uie.createCriteria().andUserPhoneEqualTo(user.getUserPhone()).andUserPasswordEqualTo(user.getUserPassword());
		List<UserInfo> list = userInfoMapper.selectByExample(uie);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public boolean sendsendSecurityCode(String phoneNum) {
		// 先随机生成一段验证码
		String string = "1234567890";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int n = random.nextInt(10);
			sb.append(string.substring(n, n + 1));
		}
		String num = sb.toString();

		// 将验证码存至redis中
		Jedis jedis = null;
		try {

			jedis = jedisPool.getResource();
			jedis.setex(phoneNum + "registCode", 300, num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}

		// 执行发送验证码操作
		// 发短信
		SendSmsResponse response = null;
		try {
			response = sendSms(phoneNum, num);
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ("OK".equals(response.getCode())) {
			return true;
		} else {
			return false;
		}
		// System.out.println("短信接口返回的数据----------------");
		// System.out.println("Code=" + response.getCode());
		// System.out.println("Message=" + response.getMessage());
		// System.out.println("RequestId=" + response.getRequestId());
		// System.out.println("BizId=" + response.getBizId());
	}

	@Override
	public boolean checkSecurityCode(UserInfo userInfo) {
		Jedis jedis = jedisPool.getResource();
		String value = null;
		try {
			value = jedis.get(userInfo.getUserPhone() + "registCode");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jedis.close();
		}
		if (value != null && !"".equals(value) && value.equals(userInfo.getUserSecureCode())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public UserInfo registerUser(UserInfo userInfo) {
		userInfo.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		userInfo.setUserState(0);
		userInfo.setUserType(0);
		userInfo.setUserAddtime(new Date());
		userInfo.setUserSex(0);
		userInfo.setUserPassageNum(0);
		userInfoMapper.insert(userInfo);

		return userInfo;
	}

	@Override
	public boolean checkPhoneNum(String phoneNum) {
		UserInfoExample example = new UserInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserPhoneEqualTo(phoneNum);
		long result = userInfoMapper.countByExample(example);
		if (result > 0) {
			return true;
		}
		return false;
	}

	private SendSmsResponse sendSms(String phoneNum, String securityCode) throws ClientException {

		// 可自助调整超时时间
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");

		// 初始化acsClient,暂不支持region化
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);

		// 组装请求对象-具体描述见控制台-文档部分内容
		SendSmsRequest request = new SendSmsRequest();
		// 必填:待发送手机号
		request.setPhoneNumbers(phoneNum);
		// 必填:短信签名-可在短信控制台中找到
		request.setSignName(smsSignature);
		// 必填:短信模板-可在短信控制台中找到
		request.setTemplateCode(smsTemplateCode);
		// 可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		String value = "{\"code\":\"" + securityCode + "\"}";
		request.setTemplateParam(value);
		// 选填-上行短信扩展码(无特殊需求用户请忽略此字段)
		// request.setSmsUpExtendCode("90997");

		// 可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		request.setOutId("yourOutId");

		// hint 此处可能会抛出异常，注意catch
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

		return sendSmsResponse;
	}

	private QuerySendDetailsResponse querySendDetails(String bizId, String phoneNum) throws ClientException {

		// 可自助调整超时时间
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");

		// 初始化acsClient,暂不支持region化
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		IAcsClient acsClient = new DefaultAcsClient(profile);

		// 组装请求对象
		QuerySendDetailsRequest request = new QuerySendDetailsRequest();
		// 必填-号码
		request.setPhoneNumber(phoneNum);
		// 可选-流水号
		request.setBizId(bizId);
		// 必填-发送日期 支持30天内记录查询，格式yyyyMMdd
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
		request.setSendDate(ft.format(new Date()));
		// 必填-页大小
		request.setPageSize(10L);
		// 必填-当前页码从1开始计数
		request.setCurrentPage(1L);

		// hint 此处可能会抛出异常，注意catch
		QuerySendDetailsResponse querySendDetailsResponse = acsClient.getAcsResponse(request);

		return querySendDetailsResponse;
	}

	@Override
	public PageInfo<UserInfo> getUserByPassageNum(String userType) {
		PageHelper.startPage(1, 16);
		List<UserInfo> list = userInfoMapper.selectAllUserByPassageNum(userType);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public boolean isFollow(UserFollow userFollow) {
		UserFollowExample example = new UserFollowExample();
		com.nullnews.pojo.UserFollowExample.Criteria criteria = example.createCriteria();
		criteria.andFollowIdEqualTo(userFollow.getFollowId()).andUserIdEqualTo(userFollow.getUserId());
		List<UserFollow> list = userFollowMapper.selectByExample(example);
		System.out.println(list.size());
		boolean p = false;
		if (list.size() != 0) {
			p = true;
		}
		return p;
	}

	@Override
	public boolean cancelFollowUser(UserFollow userFollow) {
		UserFollowExample example = new UserFollowExample();
		com.nullnews.pojo.UserFollowExample.Criteria create = example.createCriteria();
		create.andFollowIdEqualTo(userFollow.getFollowId()).andUserIdEqualTo(userFollow.getUserId());
		int p = userFollowMapper.deleteByExample(example);
		if (p > 0) {
			return true;
		}
		return false;
	}

}
