package cn.hncu.dao;

import cn.hncu.domain.User;

public class LoginDaoImpl implements LoginDAO {
	@Override
	public User login(User user) {
		//按理应该访问真正的数据库，这里直接模拟了
		if(user!=null){
			if(user.getName().startsWith("hncu") &&
					user.getPwd().length()>4 ){
				//登录成功，把从数据库中读取出来的数据全部封装到user中
				user.setId("U007"); //模拟从从数据库中读取出来的数据封装
				return user;
			}
		}
		
		return null;
	}
}
