package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeleteDao;
import daoImpl.DeleteDaoImpl;

/**
 * 
 * @author 张翔
 * 
 * 删除用户自己发的微博
 *
 */

public class DeleteAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		this.doPost(request, response);
	} 
	
	/**
	 * 删除用户自己发的微博
	 * 
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String topicId = request.getParameter("topicId");
		
		DeleteDao deleteDao = new DeleteDaoImpl();
		deleteDao.deleteTopic(Integer.parseInt(topicId));
		
		request.getRequestDispatcher("/servlet/TopicListAction").forward(request, response);
		 
	}

}
