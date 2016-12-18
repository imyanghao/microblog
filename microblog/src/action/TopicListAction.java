package action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TopicListDao;
import daoImpl.TopicListDaoImpl;
import entity.Topic;
import entity.Users;


/**
 * 登录之后跳转到微博主页面用于所有微博查询的servlet
 * @author 张翔
 *
 */
public class TopicListAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
 
	/**
	 * 微博主页面的所有值查询的方法
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		  
		TopicListDao topicListDao = new TopicListDaoImpl(); 
		List<Topic> meAndAllFriendTopic = topicListDao.getMeAndAllFriendTopic(); 
		
		request.setAttribute("meAndAllFriendTopic", meAndAllFriendTopic);
		
		request.getRequestDispatcher("/main.jsp").forward(request, response);
		
			 
	}

}
