package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.MarketElementBean;
import dto.ReviewElementBean;

public class ReviewTableDAO {
	private ReviewTableDAO() { 
	}
	
	private static ReviewTableDAO instance = new ReviewTableDAO();
	public static ReviewTableDAO getInstance(){
		return instance;
	}
	
	// insert
	public int insert(Connection conn, ReviewElementBean re) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into review values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, re.getNumber());
			pstmt.setString(2, re.getCountry());
			pstmt.setString(3, re.getCate1());
			pstmt.setString(4, re.getName());
			pstmt.setString(5, re.getTitle());
			pstmt.setString(6, re.getDetail());	
			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}

	// delete
	public int delete(Connection conn, int number) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from review where number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}

	// update
		public int edit(Connection conn, ReviewElementBean re) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "update review set country=?, cate1=?, name=?, title=?, detail=? where number=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, re.getCountry());
				pstmt.setString(2, re.getCate1());
				pstmt.setString(3, re.getName());
				pstmt.setString(4, re.getTitle());
				pstmt.setString(5, re.getDetail());
				pstmt.setInt(6, re.getNumber());
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
	

	// select(find/get) number 검색(글 불러오기)
		public ReviewElementBean select(Connection conn, int number) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from review where number=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, number);
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
	
	public ReviewElementBean createFromResultSet(ResultSet rs) throws SQLException {
		int number = rs.getInt("number");
		String country = rs.getString("country");
		String cate1 = rs.getString("cate1");
		String name = rs.getString("name");
		String title = rs.getString("title");
		String detail = rs.getString("detail");
		ReviewElementBean re = new ReviewElementBean(number,country,cate1,name,title,detail);
		return re;
	}
	
	// selectList
	public List<ReviewElementBean> selectList(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from review";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<ReviewElementBean> mList = new ArrayList<>();
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
	
	// selectListByCategory,Country
	public List<ReviewElementBean> selectListByCategory(Connection conn, String category, String country) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from review where cate1=?, country=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, category);
			pstmt.setString(2, country);
			rs = pstmt.executeQuery();
			List<ReviewElementBean> rList = new ArrayList<>();
			while (rs.next()) {
				rList.add(createFromResultSet(rs));
			}
			return rList;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}
	
	
	public List<ReviewElementBean> titleselect(Connection conn, String title) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from review where title like'" + title + "%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			List<ReviewElementBean> mList = new ArrayList<>();
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
	
	public List<ReviewElementBean> writerselect(Connection conn, String name) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from review where name like'" + name + "%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			List<ReviewElementBean> mList = new ArrayList<>();
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