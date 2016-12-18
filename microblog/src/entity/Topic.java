package entity;

import java.util.List;

public class Topic { 
	
	private int topicId;
	private String webtext;
	private int userId; 
	private int praisecount;  
	private Users users;
	private List<Users> list;
	
	public Topic(int topicId, String webtext, int userId, int praisecount,
			Users users, List<Users> list) {
		super();
		this.topicId = topicId;
		this.webtext = webtext;
		this.userId = userId;
		this.praisecount = praisecount;
		this.users = users;
		this.list = list;
	}


	public List<Users> getList() {
		return list;
	}


	public void setList(List<Users> list) {
		this.list = list;
	}


	public Topic() { 
	}
	 
	
	public int getPraisecount() {
		return praisecount;
	}
	public void setPraisecount(int praisecount) {
		this.praisecount = praisecount;
	}
	
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getWebtext() {
		return webtext;
	}
	public void setWebtext(String webtext) {
		this.webtext = webtext;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
