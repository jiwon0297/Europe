package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.LocationElementBean;
import dto.MemberElementBean;
import dto.TravelElementBean;
import jdbc.ConnectionProvider;

public class LocationTableDAO {
	 private Connection conn;
	    private PreparedStatement pstmt;
	    private ResultSet rs;
	    
	    private static LocationTableDAO instance;
	    
	    private LocationTableDAO(){}
	    public static LocationTableDAO getInstance(){
	        if(instance==null)
	            instance=new LocationTableDAO();
	        return instance;
	    }
	    
	    // ��� ���
	    public boolean insertLocation(LocationElementBean location)
	    {
	        boolean result = false;
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	 
	            // �ڵ� Ŀ���� false�� �Ѵ�.
	            conn.setAutoCommit(false);
	            
	            String sql = "insert into location(countryNumber,location) values (?,?)";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, location.getCountryNumber());
	            pstmt.setString(2, location.getLocation());
	            
	            int flag = pstmt.executeUpdate();
	            if(flag > 0){
	                result = true;
	                conn.commit(); // �Ϸ�� Ŀ��
	            }
	            
	        } catch (Exception e) {
	            try {
	                conn.rollback(); // ������ �ѹ�
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            } 
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	        
	        close();
	        return result;    
	    } // end boardInsert();    
	    
	    //��� ��� ��������
	    public ArrayList<LocationElementBean> getLocationList(int boardNum)
	    {
	        ArrayList<LocationElementBean> list = new ArrayList<LocationElementBean>();
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	            
	            String sql = "select location from location where countryNumber = ?";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, boardNum);
	            
	            rs = pstmt.executeQuery();
	            while(rs.next())
	            {
	            	LocationElementBean location = new LocationElementBean();
	                location.setNumber(rs.getInt("number"));
	                location.setCountryNumber(rs.getInt("countryNumber"));
	                location.setLocation(rs.getString("location"));
	                list.add(location);
	            }
	                
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	        
	        close();
	        return list;
	    } // end getCommentList
	    
	 // ��� ����
	    public boolean deleteLocation(int number) 
	    {
	        boolean result = false;
	 
	        try {
	            conn = ConnectionProvider.getConnection();
	            conn.setAutoCommit(false); // �ڵ� Ŀ���� false�� �Ѵ�.
	            
	            String sql = "delete from location where number=?";
	            
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, number);
	            
	            int flag = pstmt.executeUpdate();
	            if(flag > 0){
	                result = true;
	                conn.commit(); // �Ϸ�� Ŀ��
	            }    
	            
	        } catch (Exception e) {
	            try {
	                conn.rollback(); // ������ �ѹ�
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            }
	            throw new RuntimeException(e.getMessage());
	        }
	 
	        close();
	        return result;
	    } // end deleteComment
	    

	    
	    // DB �ڿ�����
	    private void close()
	    {
	        try {
	            if ( pstmt != null ){ pstmt.close(); pstmt=null; }
	            if ( conn != null ){ conn.close(); conn=null;    }
	        } catch (Exception e) {
	            throw new RuntimeException(e.getMessage());
	        }
	    } // end close() 
}

