package cn.hncu.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String name;
	private String pwd;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pwd=" + pwd + "]";
	}
	
	
	/////////////在普通JavaBean基础上增加业务方法---EJB//////////////////
	public boolean create(){
		//把this-bean中的信息存入数据库---可以自己写dao层代码，也可以调用独立dao层
		return true;
	}
	
	public Person login(){
		//按理这里应该访问数据库(直接或间接)，进行登录校验，这里模拟了
	    if(name!=null && name.trim().startsWith("hncu")  &&
	         pwd!=null && pwd.length()>4  ){
	    	//登录成功，还可以为this对象封装从数据库中获得的新信息
	    	return this;
	    }else{
	    	return null;
	    }
	}
	
}
