package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.TipElementBean;

public class TipTableDAO {
	private TipTableDAO() { 
	}
	
	private static TipTableDAO instance = new TipTableDAO();
	public static TipTableDAO getInstance(){
		return instance;
	}
	
	// insert
		public int insert(Connection conn, TipElementBean re) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "insert into tip values (?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, re.getNumber());
				pstmt.setString(2, re.getCountry());
				pstmt.setString(3, re.getCate2());
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
				String sql = "delete from tip where number=?";
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
	public int edit(Connection conn, TipElementBean re) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "update tip set country=?, cate2=?, name=?, title=?, detail=? where number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, re.getCountry());
			pstmt.setString(2, re.getCate2());
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
	
	// select(find/get) 제목 검색
	public TipElementBean titleselect(Connection conn, String title) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from tip where title like'" + title + "%'";
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

// select(find/get) 작성자 검색
	public TipElementBean writerselect(Connection conn, String name) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from tip where name like'" + name + "%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
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

// select(find/get) number 검색(글 불러오기)
	public TipElementBean select(Connection conn, int number) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from tip where number=?";
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
		
		public TipElementBean createFromResultSet(ResultSet rs) throws SQLException {
			int number = rs.getInt("number");
			String country = rs.getString("country");
			String cate2 = rs.getString("cate2");
			String name = rs.getString("name");
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			TipElementBean re = new TipElementBean(number,country,cate2,name,title,detail);
			return re;
		}
		
		// selectList
		public List<TipElementBean> selectList(Connection conn) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from tip";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				List<TipElementBean> mList = new ArrayList<>();
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
		
		// selectListByCategory
		public List<TipElementBean> selectListByCategory(Connection conn, String cate2) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from tip where cate2=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, cate2);
				rs = pstmt.executeQuery();
				List<TipElementBean> tiList = new ArrayList<>();
				while (rs.next()) {
					tiList.add(createFromResultSet(rs));
				}
				return tiList;
			} finally {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}
		}
		
		// selectListByCountry
		public List<TipElementBean> selectListByCountry(Connection conn, String country) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from tip where country=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, country);
				rs = pstmt.executeQuery();
				List<TipElementBean> tiList = new ArrayList<>();
				while (rs.next()) {
					tiList.add(createFromResultSet(rs));
				}
				return tiList;
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