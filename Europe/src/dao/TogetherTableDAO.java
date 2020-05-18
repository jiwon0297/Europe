package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.TogetherElementBean;

public class TogetherTableDAO {
	private TogetherTableDAO() { 
	}
	
	private static TogetherTableDAO instance = new TogetherTableDAO();
	public static TogetherTableDAO getInstance(){
		return instance;
	}
	
	// insert
		public int insert(Connection conn, TogetherElementBean re) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "insert into together values (?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, re.getNumber());
				pstmt.setString(2, re.getCountry());
				pstmt.setString(3, re.getName());
				pstmt.setString(4, re.getTitle());
				pstmt.setString(5, re.getDetail());	
				return pstmt.executeUpdate();
			} finally {
				if (pstmt != null) {
					pstmt.close();
				}
			}
		}

	// delete
		public int delete(Connection conn, String number) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "delete from together where number=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, number);
				return pstmt.executeUpdate();
			} finally {
				if (pstmt != null) {
					pstmt.close();
				}
			}
		}

	// update
	public int edit(Connection conn, TogetherElementBean re) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "update together set country=?,name=?, title=?, detail=? where number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, re.getCountry());
			pstmt.setString(2, re.getName());
			pstmt.setString(3, re.getTitle());
			pstmt.setString(4, re.getDetail());
			pstmt.setInt(5, re.getNumber());
			return pstmt.executeUpdate();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}
	
	// select(find/get) 제목 검색?
			public TogetherElementBean select(Connection conn, String title) throws SQLException {
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					String sql = "select * from together where title like'" + title + "%'";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, title);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						return createFromResultSet(rs);
					}
					else {
						return null;
					}
				} finally {
					if (rs != null) {
						rs.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
				}
			}
		
		public TogetherElementBean createFromResultSet(ResultSet rs) throws SQLException {
			int number = rs.getInt("number");
			String country = rs.getString("country");
			String name = rs.getString("name");
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			TogetherElementBean re = new TogetherElementBean(number,country,name,title,detail);
			return re;
		}
		
		// selectList
		public List<TogetherElementBean> selectList(Connection conn) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from together";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				List<TogetherElementBean> mList = new ArrayList<>();
				while (rs.next()) {
					mList.add(createFromResultSet(rs));
				}
				return mList;
			} finally {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}
		}
}