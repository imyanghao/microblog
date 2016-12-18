package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	private final static String url = "jdbc:mysql://localhost:3306/microblog";
	private final static String user = "root";
	private final static String pw = "123";
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() throws SQLException{
		return DriverManager.getConnection(url,user,pw);
	}
	
	public void close(Connection conn,PreparedStatement pst,ResultSet rs){
		
		try {
			if(conn != null){
				conn.close();
			}
			if(pst != null){
				pst.close();
			}
			if(rs != null){
				rs.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
