package cn.java.safecar.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.java.safecar.entity.User;
import cn.java.safecar.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletResponse response;
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/requestLogin", method = RequestMethod.GET)
	public String requestLogin() {
		return "/user/login_form";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user) {
		System.out.println(user.getCellphone() + "\t" + user.getPassword());
		User loginUser = userService.getUser(user);
		if (loginUser != null) {
			List<User> userList = userService.getUserList();
			request.setAttribute("userList", userList);
			return "/user/list";
		}
		return "/user/login_form";

	}
}
