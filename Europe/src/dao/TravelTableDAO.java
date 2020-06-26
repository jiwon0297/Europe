package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CommentElementBean;
import dto.LocationElementBean;
import dto.MemberElementBean;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;
import dto.TravelElementBean;

public class TravelTableDAO {
	private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    private static TravelTableDAO instance;
    
    private TravelTableDAO(){}
    public static TravelTableDAO getInstance(){
        if(instance==null)
            instance=new TravelTableDAO();
        return instance;
    }
    
	
 // ��� ���
    public boolean insertTravel(TravelElementBean travel)
    {
        boolean result = false;
        
        try {
            conn = ConnectionProvider.getConnection();
 
            // �ڵ� Ŀ���� false�� �Ѵ�.
            conn.setAutoCommit(false);
            
            String sql = "insert into travel(userId, country, nights, days,startDate) values (?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, travel.getUserId());
            pstmt.setString(2, travel.getCountry());
            pstmt.setInt(3, travel.getNights());
            pstmt.setInt(4, travel.getDays());
            pstmt.setString(5,  travel.getStartDate());
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
    } 
 // ���� ��� ��������
    public ArrayList<TravelElementBean> getCommentList(String userId)
    {
        ArrayList<TravelElementBean> list = new ArrayList<TravelElementBean>();
        
        try {
            conn = ConnectionProvider.getConnection();
            
            
            String sql = "select * from travel where userId=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userId);
            
            rs = pstmt.executeQuery();
            while(rs.next())
            {	
        		TravelElementBean re = new TravelElementBean();
                re.setNumber(rs.getInt("number"));
                re.setUserId(rs.getString("userId"));
                re.setCountry(rs.getString("country"));
                re.setNights(rs.getInt("nights"));
                re.setDays(rs.getInt("days"));
                re.setStartDate(rs.getString("startDate"));
                list.add(re);
            }
                
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        
        close();
        return list;
    } // end getCommentList
    
 // ���� ����
    public boolean deleteTravel(int number) 
    {
        boolean result = false;
 
        try {
            conn = ConnectionProvider.getConnection();
            conn.setAutoCommit(false); // �ڵ� Ŀ���� false�� �Ѵ�.
            
            String sql = "delete from travel where number=?";
            
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
    
 // ����  1���� ���������� �����´�.
    public TravelElementBean getTravel(String country, String userId)
    {
        TravelElementBean travel = null;
        
        try {
            conn = ConnectionProvider.getConnection();
            
            String sql = "select * from travel where country = ? and userId = ?";
           
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, country);
            pstmt.setString(2, userId);
            
            rs = pstmt.executeQuery();
            while(rs.next())
            {
            	TravelElementBean re = new TravelElementBean();
                re.setNumber(rs.getInt("number"));
                re.setUserId(rs.getString("userId"));
                re.setCountry(rs.getString("country"));
                re.setNights(rs.getInt("nights"));
                re.setDays(rs.getInt("days"));
                re.setStartDate(rs.getString("startDate"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        
        close();
        return travel; 
    } // end getComment
    
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
