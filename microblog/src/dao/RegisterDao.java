package dao;

import entity.Users;

public interface RegisterDao {
	
	/**
	 * 注册功能的实现 
	 * @return
	 */
	
	boolean isRegister(Users users);

}
