package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.ReviewElementBean;

public class ReviewTableDAO {
	private ReviewTableDAO() { 
	}
	
	private static ReviewTableDAO instance = new ReviewTableDAO();
	public static ReviewTableDAO getInstance(){
		return instance;
	}
	
	// insert
	public int insert(Connection conn, String country, String cate1, String name, String title, String detail,String fileName, String fileRealName) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into review(country, cate1, name,  title, detail, fileName, fileRealName) values (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, country);
			pstmt.setString(2, cate1);
			pstmt.setString(3, name);
			pstmt.setString(4, title);
			pstmt.setString(5, detail);
			pstmt.setString(6, fileName);
			pstmt.setString(7, fileRealName);
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
		public int edit(Connection conn, int number, String country, String cate1, String title, String detail, String fileName, String fileRealName) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "update review set country=?, cate1=?, title=?, detail=?,fileName=?,fileRealName=? where number=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, country);
				pstmt.setString(2, cate1);
				pstmt.setString(3, title);
				pstmt.setString(4, detail);
				pstmt.setInt(5, number);
				pstmt.setString(6, fileName);
				pstmt.setString(7, fileRealName);
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
		String fileName = rs.getString("fileName");
		String fileRealName = rs.getString("fileName");
		
		ReviewElementBean re = new ReviewElementBean(number,country,cate1,name,title,detail,fileName,fileRealName);
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
			String sql = "select * from review where cate1=? and country=? order by number desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, category);
			pstmt.setString(2, country);
			System.out.println(category);
			System.out.println(country);
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
	
	public int cate(Connection conn, String category, String country) throws SQLException {
				if(category.equals("Information") && country.equals("England")) {
					return 1;
				} else if(category.equals("Market") && country.equals("England")) {
					return 2;
				} else if(category.equals("Together") && country.equals("England")) {
					return 3;
				} 
				
				else if(category.equals("Information") && country.equals("Korea")) {
					return 4;
				} else if(category.equals("Market") && country.equals("Korea")) {
					return 5;
				} else if(category.equals("Together") && country.equals("Korea")) {
					return 6;
				}
				
				else if(category.equals("Information") && country.equals("Swiss")) {
					return 7;
				} else if(category.equals("Market") && country.equals("Swiss")) {
					return 8;
				} else if(category.equals("Together") && country.equals("Swiss")) {
					return 9;
				}
				
				else if(category.equals("Information") && country.equals("Czech")) {
					return 10;
				} else if(category.equals("Market") && country.equals("Czech")) {
					return 11;
				} else if(category.equals("Together") && country.equals("Czech")) {
					return 12;
				}
				
				else if(category.equals("Information") && country.equals("Hungary")) {
					return 13;
				} else if(category.equals("Market") && country.equals("Hungary")) {
					return 14;
				} else if(category.equals("Together") && country.equals("Hungary")) {
					return 15;
				}
				
				else if(category.equals("Information") && country.equals("Italy")) {
					return 16;
				} else if(category.equals("Market") && country.equals("Italy")) {
					return 17;
				} else if(category.equals("Together") && country.equals("Italy")) {
					return 18;
				}
				
				else if(category.equals("Information") && country.equals("Germany")) {
					return 19;
				} else if(category.equals("Market") && country.equals("Germany")) {
					return 20;
				} else if(category.equals("Together") && country.equals("Germany")) {
					return 21;
				}
				
				else if(category.equals("Information") && country.equals("France")) {
					return 22;
				} else if(category.equals("Market") && country.equals("France")) {
					return 23;
				} else if(category.equals("Together") && country.equals("France")) {
					return 24;
				}
				
				return 25;
				
	}
}