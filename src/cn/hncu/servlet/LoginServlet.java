package cn.hncu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.hncu.domain.Person;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1收集
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		//2组织--封装EJB
		Person p = new Person();
		p.setName(name);
		p.setPwd(pwd);
		
		//3调用EJB中的业务逻辑方法
		p = p.login();
		
		//4导向结果页面
		if(p!=null){
			request.setAttribute("p", p);
			request.getRequestDispatcher("/jsps/v3/result.jsp").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/jsps/index3.jsp");
		}
	}

}
