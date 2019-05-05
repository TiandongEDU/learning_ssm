package cn.java.safecar.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.java.safecar.entity.User;
import cn.java.safecar.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUserList() {
		return null;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		// 对cellphone和password进行判断
		if (user.getCellphone() != null && !"".equals(user.getCellphone().trim()) && user.getPassword() != null
				&& !"".equals(user.getPassword().trim())) {
			
		}
		return null;
	}

}
