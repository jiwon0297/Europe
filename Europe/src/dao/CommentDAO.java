package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.CommentDTO;
import jdbc.ConnectionProvider;

public class CommentDAO {
	private CommentDAO() { 
	}
	
	private static CommentDAO instance = new CommentDAO();
	public static CommentDAO getInstance(){
		return instance;
	}
	
	// insert
		public void insertComment(CommentDTO dto) throws SQLException {
			int num = dto.getNum();
			int number = 0;
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				conn = ConnectionProvider.getConnection();
				pstmt = conn.prepareStatement("select max(num) from comment");
				rs = pstmt.executeQuery();
				if(rs.next()) {
					number = rs.getInt(1)+1;
				} else {
					number = 1;
				}
				String sql = "insert into comment(id, content, ref) values (?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getContent());
				pstmt.setInt(3, dto.getRef());
				pstmt.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {rs.close();} catch(SQLException s) {}
				try {pstmt.close();}catch(SQLException s) {}
				try {conn.close();}catch(SQLException s) {}
			}
		}
}
