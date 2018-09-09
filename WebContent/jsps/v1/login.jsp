<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>JSP的第1代开发技术:纯JSP技术</title>
  </head>
  
  <body>
 
    <%
       request.setCharacterEncoding("utf-8");
       String name = request.getParameter("name");
       String pwd = request.getParameter("pwd");
       //按理这里应该访问数据库，进行登录校验，这里模拟了
       if(name!=null && name.trim().startsWith("hncu")  &&
           pwd!=null && pwd.length()>4  ){
    	   request.setAttribute("name", name);
    	   request.setAttribute("pwd", pwd);
       }
      	request.getRequestDispatcher("/jsps/v1/result.jsp").forward(request, response);
    %>
  </body>
</html>
