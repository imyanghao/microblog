package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.RegisterDao;
import db.BaseDao;
import entity.Users;

public class RegisterDaoImpl extends BaseDao implements RegisterDao {

	public boolean isRegister(Users users) {
		
		Connection conn  = null;
		PreparedStatement pst = null;
		ResultSet rs = null; 
		
		try {
			conn = super.getConn();
			pst = conn.prepareStatement("insert into user values(null,?,?,?)");
			pst.setString(1, users.getUserName());
			pst.setString(2, users.getPassWord());
			pst.setString(3, users.getNiceName());
			
			pst.executeUpdate();
			
			return true;
			
		} catch (SQLException e) { 
			e.printStackTrace();
			return false;
		}finally{
			super.close(conn, pst, rs);
		} 
		
		
	}

}
