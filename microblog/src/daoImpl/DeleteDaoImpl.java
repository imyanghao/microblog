package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DeleteDao;
import db.BaseDao;

public class DeleteDaoImpl extends BaseDao implements DeleteDao {

	public void deleteTopic(int topicId) {
		
		Connection conn  = null;
		PreparedStatement pst = null; 
		ResultSet rs = null; 
		int count = 0;
		
		try {
			conn = super.getConn();
			
			pst = conn.prepareStatement("select like_id from likeMe where like_topicId = ?");
			pst.setInt(1, topicId);
			rs = pst.executeQuery();
			if(rs.next()){
				count = rs.getInt(1);
			}
			
			if(count != 0){
				pst = conn.prepareStatement("delete from likeMe where like_topicId = ?");
				pst.setInt(1, topicId);
				pst.executeUpdate(); 
			}
			pst = conn.prepareStatement("delete from topic where topic_id = ?");
			pst.setInt(1, topicId);
			pst.executeUpdate();
			 
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally{
			super.close(conn, pst, null);
		}
		

	}

}
