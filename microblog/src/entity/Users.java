package entity;

public class Users {
	
	private int userId;
	
	private String userName;
	
	private String passWord;
	
	private String niceName; 
	
	public Users() { 
	}

	public Users(int userId, String userName, String passWord, String niceName) {
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.niceName = niceName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNiceName() {
		return niceName;
	}

	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}
	
	

	

}
