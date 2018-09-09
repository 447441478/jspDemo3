package cn.hncu.service;

import cn.hncu.dao.LoginDAO;
import cn.hncu.dao.LoginDaoImpl;
import cn.hncu.domain.User;

public class LoginService implements ILoginService{
	//注入dao
	private LoginDAO dao = new LoginDaoImpl();
	
	@Override
	public User login(User user) {
		return dao.login(user);
	}
	
}
