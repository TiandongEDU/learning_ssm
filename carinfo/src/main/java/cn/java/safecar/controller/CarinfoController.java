 package cn.java.safecar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarinfoController{
	@RequestMapping("/cartest")
	public String cartest(HttpServletRequest request) {
		System.out.println("carinfo......");
		request.setAttribute("hello", "hello safecar!!!");
		return "/hello";
	}
}
