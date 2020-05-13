package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dto.MemberElementBean;

public class MemberTableDAO {
	private MemberTableDAO() { 
	}
	
	private static MemberTableDAO instance = new MemberTableDAO();
	public static MemberTableDAO getInstance(){
		return instance;
	}
	
	// insert
	public int insert(Connection conn, MemberElementBean me) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into member values (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me.getId());
			pstmt.setString(2, me.getPassword());
			pstmt.setString(3, me.getName());
			pstmt.setString(4, me.getEmail());
			pstmt.setString(5, me.getPhone());
			pstmt.setString(6, me.getAddress());
			pstmt.setString(7, me.getNickname());
			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}

	// delete
	public int delete(Connection conn, String id) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from member where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			return pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}
	}

	// edit
	public int edit(Connection conn, MemberElementBean me) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "update member set password=?, name=?, email=?, phone=?, address=? nickname=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me.getPassword());
			pstmt.setString(2, me.getName());
			pstmt.setString(3, me.getEmail());
			pstmt.setString(4, me.getPhone());
			pstmt.setString(5, me.getAddress());
			pstmt.setString(6, me.getNickname());
			pstmt.setString(7, me.getId());
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
	
	// select(find/get)
		public MemberElementBean select(Connection conn, String id, String pw) throws SQLException {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from member where id=?, password=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
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
	
	public MemberElementBean createFromResultSet(ResultSet rs) throws SQLException {
		String id = rs.getString("id");
		String password = rs.getString("password");
		String name = rs.getString("name");
		String email = rs.getString("email");
		String phone = rs.getString("phone");
		String address = rs.getString("address");
		String nickname = rs.getString("nickname");
		MemberElementBean me = new MemberElementBean(id, password, name, email, phone, address, nickname);
		return me;
	}
	
	// selectList
	public List<MemberElementBean> selectList(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<MemberElementBean> mList = new ArrayList<>();
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
