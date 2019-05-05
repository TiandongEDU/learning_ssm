package cn.java.safecar.service;

import java.util.List;

import cn.java.safecar.entity.User;

public interface UserService {

	List<User> getUserList();

	User getUser(User user);

}
