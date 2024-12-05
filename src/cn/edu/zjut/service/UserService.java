package cn.edu.zjut.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zjut.dao.UserDao;
import cn.edu.zjut.pojo.User;
import cn.edu.zjut.util.HibernateUtil;

@Service
public class UserService implements IUserService{
	@Autowired
	private UserDao userdao;
	public Session getSession() {
		return HibernateUtil.getSession();
	}

	public boolean login(User loginUser) {
		String username = loginUser.getUsername();
		String password = loginUser.getPassword();
		String hql = "from User as user where username='" + username + "' and password='" + password + "'";
		Session session = this.getSession();
		userdao.setSession(session);
		List list = userdao.findByHql(hql);
		HibernateUtil.closeSession();
		if (list.isEmpty())
			return false;
		else
			return true;
	}
}
