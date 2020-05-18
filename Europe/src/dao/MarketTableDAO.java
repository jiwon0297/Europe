package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.MarketElementBean;

public class MarketTableDAO {
	private MarketTableDAO() { 
	}
	
	private static MarketTableDAO instance = new MarketTableDAO();
	public static MarketTableDAO getInstance(){
		return instance;
	}
	
	// insert
		public int insert(Connection conn, MarketElementBean re) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "insert into market values (?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, re.getNumber());
				pstmt.setString(2, re.getCountry());
				pstmt.setString(3, re.getCate3());
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
		public int delete(Connection conn, String number) throws SQLException {
			PreparedStatement pstmt = null;
			try {
				String sql = "delete from market where number=?";
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
	public int edit(Connection conn, MarketElementBean re) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "update market set country=?, cate2=?, name=?, title=?, detail=? where number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, re.getCountry());
			pstmt.setString(2, re.getCate3());
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
	
	// select(find/get) 제목 검색?
			public MarketElementBean select(Connection conn, String title) throws SQLException {
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					String sql = "select * from market where title like'" + title + "%'";
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
		
		public MarketElementBean createFromResultSet(ResultSet rs) throws SQLException {
			int number = rs.getInt("number");
			String country = rs.getString("country");
			String cate3 = rs.getString("cate3");
			String name = rs.getString("name");
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			MarketElementBean re = new MarketElementBean(number,country,cate3,name,title,detail);
			return re;
		}
		
		// selectList
		public List<MarketElementBean> selectList(Connection conn) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from market";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				List<MarketElementBean> mList = new ArrayList<>();
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