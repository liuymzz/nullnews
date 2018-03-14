package com.nullnews.portal.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.UserFollowService;
import com.nullnews.portal.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserFollowService userFollowService;

	@RequestMapping("login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("regist")
	public String showRegust() {

		return "regist";
	}

	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public String login(UserInfo user, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(user);
		UserInfo userInfo = userService.login(user);
		if (userInfo == null) {
			request.setAttribute("errorTip", "账户密码错误或账号不存在");
			return "login";
		} else {
			session.setAttribute("LOGIN_YES", userInfo);
			return "redirect:/index";
		}
	}

	/**
	 * 发送手机短信验证码
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "sendSecurityCode", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> snedSecurityCode(@RequestBody UserInfo userInfo) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userService.sendsendSecurityCode(userInfo.getUserPhone());
		if (p) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}
		return result;
	}

	/**
	 * 检查短信验证码
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "checkSecurityCode", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> checkSecurityCode(@RequestBody UserInfo userInfo) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userService.checkSecurityCode(userInfo);
		if (p) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}
		return result;
	}

	/**
	 * 检查普通验证码
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "checkAuthCode", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> checkAuthCode(HttpServletRequest request) {
		Map<Object, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		String sessionRegistCode = (String) session.getAttribute("registCode");
		String requestRegistCode = request.getParameter("authCode");
		if (sessionRegistCode.equals(requestRegistCode)) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}
		return result;
	}

	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/index";
	}

	/**
	 * 注册用户
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> registerUser(@RequestBody UserInfo userInfo, HttpServletRequest request) {
		Map<Object, Object> result = new HashMap<>();
		userInfo.setUserUri("http://119.29.216.209:81/zhemeshuai.png");
		UserInfo user = userService.registerUser(userInfo);
		if (user != null) {
			request.getSession().setAttribute("LOGIN_YES", user);
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}

		return result;
	}

	@RequestMapping(value = "checkPhoneNum", method = RequestMethod.POST)
	@ResponseBody
	public Map<Object, Object> checkPhoneNum(HttpServletRequest request) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userService.checkPhoneNum(request.getParameter("phoneNum"));
		if (p) {
			result.put("error", 1);
		} else {
			result.put("error", 0);
		}
		return result;
	}

	/**
	 * 用户的关注列表
	 * 
	 * @return
	 */
	@RequestMapping("follow")
	public String follow(Model model, String userId) {
		PageInfo<UserInfo> pageInfo = userFollowService.getFollowUserByUserId(userId);
		model.addAttribute("pageInfo", pageInfo);
		return "follow";
	}

	/**
	 * 关注某一个用户的操作
	 * 
	 * @param userFollow
	 * @return
	 */
	@RequestMapping("followUser")
	@ResponseBody
	public Map<Object, Object> followUser(@RequestBody UserFollow userFollow) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userFollowService.followUser(userFollow);
		if (p) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}
		return result;
	}

	/**
	 * 判断某用户是否发生关注
	 * 
	 * @param userFollow
	 * @return
	 */
	@RequestMapping("isFollow")
	@ResponseBody
	public Map<Object, Object> isFollow(@RequestBody UserFollow userFollow) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userService.isFollow(userFollow);
		if (p) {
			result.put("error", 1);
		} else {
			result.put("error", 0);
		}
		return result;

	}

	@RequestMapping("cancelFollowUser")
	@ResponseBody
	public Map<Object, Object> cancelFollowUser(@RequestBody UserFollow userFollow) {
		Map<Object, Object> result = new HashMap<>();
		boolean p = userService.cancelFollowUser(userFollow);
		if (p) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}
		return result;
	}

	/**
	 * 生成图片验证码
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("registCode")
	public void registCode(HttpServletRequest request, HttpServletResponse response) {
		String arr = "23456789abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
		Random random = new Random();

		// 用于绘制图片，设置图片的长宽和图片类型（RGB)
		BufferedImage bi = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		// 获取绘图工具
		Graphics graphics = bi.getGraphics();
		graphics.setColor(new Color(255, 255, 255)); // 使用RGB设置背景颜色
		graphics.fillRect(0, 0, 100, 30); // 填充矩形区域
		Font font = new Font(Font.SERIF, Font.ITALIC, 18);
		graphics.setFont(font);

		String captcha = ""; // 存放生成的验证码
		for (int i = 0; i < 4; i++) { // 循环将每个验证码字符绘制到图片上
			int index = random.nextInt(arr.length());
			// 随机生成验证码颜色
			graphics.setColor(new Color(random.nextInt(150), random.nextInt(200), random.nextInt(255)));
			// 将一个字符绘制到图片上，并制定位置（设置x,y坐标）
			String s = arr.substring(index, index + 1);
			graphics.drawString(s + "", (i * 20) + 15, 20);
			captcha += s;
		}
		request.getSession().setAttribute("registCode", captcha.toLowerCase());
		try {
			ImageIO.write(bi, "JPG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
