package com.nullnews.portal.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.PublishService;

@Controller
@RequestMapping("/publishPassage")
public class PublishPassage {

	@Value("${ftpServerIP}")
	private String ftpServerIP;
	@Value("${ftpAccount}")
	private String ftpAccount;
	@Value("${ftpPassword}")
	private String ftpPassword;
	@Value("${pictureNginx}")
	private String pictureNginx;

	@Autowired
	private PublishService publishService;

	@RequestMapping("")
	public String index() {
		return "publishPassage";
	}

	/**
	 * 发布文章时异步上传图片
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping("/uploadPicture")
	public @ResponseBody Map uploadPicture(MultipartFile file) {
		FTPClient ftpClient = null;
		String fileName = null; // 存放在服务器中的图片名字
		String datePath = null; // 按时间分类存放图片，路径
		Map<Object, Object> result = new HashMap(); // 返回给浏览器的数据集合

		List data = new ArrayList<>();

		try {

			ftpClient = new FTPClient();
			ftpClient.connect(ftpServerIP, 21);
			ftpClient.login(ftpAccount, ftpPassword);
			// 按照日期分类存放文件
			Date date = new Date();
			SimpleDateFormat sdFormat = new SimpleDateFormat("/yyyy/MM/dd/");
			datePath = sdFormat.format(date);

			// 存放之前需要先判断有没有当前日期对应的目录，如果没有则先建立
			if (!ftpClient.changeWorkingDirectory(datePath)) {
				String[] dirs = datePath.split("/");
				for (String dir : dirs) {
					ftpClient.makeDirectory(dir);
					ftpClient.changeWorkingDirectory(dir);
				}
			}

			// 设置上传文件为二进制类型，设置为其他可能会损坏文件
			fileName = UUID.randomUUID() + file.getOriginalFilename();
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			ftpClient.storeFile(fileName, file.getInputStream());
			data.add("http://" + pictureNginx + datePath + fileName);
			result.put("errno", 0);
			result.put("data", data);
		} catch (Exception e) {
			result.put("errno", 1);
			e.printStackTrace();
		} finally {
			try {
				ftpClient.logout();
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * 发布文章
	 * 
	 * @param passage
	 * @return
	 */
	@RequestMapping("/publish")
	@ResponseBody
	public Map publish(@RequestBody Passage passage, HttpServletRequest request) {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("LOGIN_YES");
		System.out.println(userInfo);
		Map<Object, Object> result = new HashMap<>();
		passage.setUserId(userInfo.getUserId());
		boolean p = publishService.addPublish(passage, userInfo.getUserId());
		if (p) {
			result.put("state", "文章发布成功");
		} else {
			result.put("state", "文章发布失败，请稍候再试");
		}
		return result;
	}

}
