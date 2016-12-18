package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.TopicDao;
import db.BaseDao;
import entity.Topic;

public class TopicDaoImpl extends BaseDao implements TopicDao{

	public void insertTopic(Topic topic) {
		
		Connection conn  = null;
		PreparedStatement pst = null;
		ResultSet rs = null;  
		
		try {
			conn = super.getConn();
			pst = conn.prepareStatement("insert into topic values(null,?,?)");
			
			pst.setString(1, topic.getWebtext());
			pst.setInt(2, topic.getUserId());
			
			pst.executeUpdate(); 
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally{
			super.close(conn, pst, rs);
		}
		
		
	}

}
