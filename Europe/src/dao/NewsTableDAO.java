package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.NewsElementBean;

public class NewsTableDAO {
	private NewsTableDAO() { 
	}
	
	private static NewsTableDAO instance = new NewsTableDAO();
	public static NewsTableDAO getInstance(){
		return instance;
	}
	
	// insert
		public int insert(Connection conn, NewsElementBean re) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "insert into news values (?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, re.getNumber());
				pstmt.setString(2, re.getTitle());
				pstmt.setString(3, re.getDetail());	
				pstmt.setString(4, re.getWriter());	
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
				String sql = "delete from news where number=?";
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
	public int edit(Connection conn, NewsElementBean re) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "update news set title=?, detail=?, writer=? where number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, re.getTitle());
			pstmt.setString(2, re.getDetail());
			pstmt.setString(3, re.getWriter());
			pstmt.setInt(4, re.getNumber());
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
			public NewsElementBean select(Connection conn, String title) throws SQLException {
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					String sql = "select * from news where title like'" + title + "%'";
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
		
		public NewsElementBean createFromResultSet(ResultSet rs) throws SQLException {
			int number = rs.getInt("number");
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			String writer = rs.getString("writer");
			NewsElementBean re = new NewsElementBean(number,title,detail,writer);
			return re;
		}
		
		// selectList
		public List<NewsElementBean> selectList(Connection conn) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from news";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				List<NewsElementBean> mList = new ArrayList<>();
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
