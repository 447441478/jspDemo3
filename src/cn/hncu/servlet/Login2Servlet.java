package cn.hncu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.hncu.domain.User;
import cn.hncu.service.ILoginService;
import cn.hncu.service.LoginService;

@SuppressWarnings("serial")
@WebServlet("/Login2Servlet")
public class Login2Servlet extends HttpServlet {

	//注入service---以后我们可以通过Spring实现依赖xml注入。暂时我们都是手动进行new对象注入
	private ILoginService service = new LoginService(); 
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1收集参数: id(要到dao层补), name, pwd
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		//2组织参数---JavaBean ---POJO
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		
		//3调用逻辑层---service层
		user = service.login(user);
		
		//4导向结果页面
		if(user!=null){
			request.setAttribute("user", user);
			request.getRequestDispatcher("/jsps/v4/result.jsp").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/jsps/index4.jsp");
		}
		
	}

}
