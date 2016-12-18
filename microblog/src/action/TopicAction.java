package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TopicDao;
import daoImpl.TopicDaoImpl;
import entity.Topic;
import entity.Users;


/**
 * 页面写好微博后点击 提交按钮  后跳转到这个servlet
 * @author 张翔
 *
 */
public class TopicAction extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		this.doPost(request, response);
	}
 
	/**
	 * 实现微博提交功能
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String webtext = request.getParameter("webtext"); 
		HttpSession session = request.getSession(false);
		
		Topic topic = new Topic();
		Users users = new Users();
		
		if(session != null){
			users = (Users)session.getAttribute("loginUser"); 
			
			topic.setWebtext(webtext);
			topic.setUserId(users.getUserId());
			
			TopicDao topicDao = new TopicDaoImpl();
			topicDao.insertTopic(topic);
			
			request.getRequestDispatcher("/servlet/TopicListAction").forward(request, response);
			
		}
		
	}

}
