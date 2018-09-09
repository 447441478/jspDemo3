<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>JSP的第3.1代开发技术(MVC):JSP+servlet+EJB(Model1)</title>
  </head>
  
  <body>
    <h2>JSP的第3.1代开发技术(MVC):JSP+servlet+EJB(Model1)</h2>
    <form action="<%=request.getContextPath()%>/LoginServlet" method="post">
    	Name:<input type="text" name="name"/><br/>
    	Pwd:<input type="password" name="pwd"/> <br/>
    	<input type="submit" value="登录"/>
    </form>
    
    
  </body>
</html>
