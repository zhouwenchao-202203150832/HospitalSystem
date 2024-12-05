package cn.edu.zjut.service;

import org.hibernate.Session;

import cn.edu.zjut.pojo.User;

public interface IUserService {
	public Session getSession();
	public boolean login(User loginUser);
}
