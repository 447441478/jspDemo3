<%@page import="cn.hncu.domain.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>JSP的第2代开发技术:JSP+EJB</title>
  </head>
  
  <body>
 
    <%
       request.setCharacterEncoding("utf-8");
       //1收集参数
       String name = request.getParameter("name");
       String pwd = request.getParameter("pwd");
       
       //2封装成JavaBean ---EJB: Enterprise Java Bean ,加入业务逻辑方法的JavaBean
       Person p = new Person();
       p.setName(name);
       p.setPwd(pwd);
       
       p= p.login();
       request.setAttribute("p", p);
       request.getRequestDispatcher("/jsps/v2/result.jsp").forward(request, response);
    %>
    
    <!-- 在第2代技术中，还可使用jsp:useBean,jsp:setProperty这些标签 -->
    
  </body>
</html>
