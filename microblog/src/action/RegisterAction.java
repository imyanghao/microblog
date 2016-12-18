package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import daoImpl.RegisterDaoImpl;
import entity.Users;

/**
 * 页面点击 注册按钮 跳转到这个servlet
 * @author 张翔
 *
 */
public class RegisterAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
 
	
	/**
	 * 注册功能的实现
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String niceName = request.getParameter("nicename");
		
		Users users = new Users();
		users.setNiceName(niceName);
		users.setPassWord(passWord);
		users.setUserName(userName);
		
		RegisterDao registerDao = new RegisterDaoImpl();
		
		boolean register = registerDao.isRegister(users);
		
		if(register == true){
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}else{
			response.sendRedirect(request.getContextPath() + "/register.jsp");
		}
		
		
	}

}
