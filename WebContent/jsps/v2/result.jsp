<%@page import="cn.hncu.domain.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>JSP的第2代开发技术:JSP+EJB</title>
  </head>
  
  <body>
    <h2>登录结果页面</h2>
    <%
        Person p =(Person) request.getAttribute("p");
	    if(p!=null){
        	String name = p.getName();
	    	out.println("欢迎你,"+name);
	    	out.println("<br/>显示登录用户的操作界面");
	    }else{
	    	//out.println("登录失败...");//
	    	response.sendRedirect(request.getContextPath()+"/jsps/index2.jsp");//踢到登录界面
	    }
    %>
    
  </body>
</html>
