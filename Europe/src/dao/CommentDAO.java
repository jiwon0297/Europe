package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CommentElementBean;
import dto.MemberElementBean;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;

public class CommentDAO {
	 private Connection conn;
	    private PreparedStatement pstmt;
	    private ResultSet rs;
	    
	    private static CommentDAO instance;
	    
	    private CommentDAO(){}
	    public static CommentDAO getInstance(){
	        if(instance==null)
	            instance=new CommentDAO();
	        return instance;
	    }
	    
	    // �������� �����´�.
	    public int getSeq() 
	    {
	        int result = 1;
	        try {
	            conn = ConnectionProvider.getConnection();
	            
	            // ������ ���� �����´�. (DUAL : ������ ���� ������������ �ӽ� ���̺�)
	            StringBuffer sql = new StringBuffer();
	            sql.append("SELECT COMMENT_SEQ.NEXTVAL FROM DUAL");
	 
	            pstmt = conn.prepareStatement(sql.toString());
	            rs = pstmt.executeQuery(); // ���� ����
	 
	            if (rs.next())    result = rs.getInt(1);
	 
	        } catch (Exception e) {
	            throw new RuntimeException(e.getMessage());
	        }
	 
	        close();
	        return result;
	    } // end getSeq
	    
	    
	    // ��� ���
	    public boolean insertComment(CommentElementBean comment)
	    {
	        boolean result = false;
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	 
	            // �ڵ� Ŀ���� false�� �Ѵ�.
	            conn.setAutoCommit(false);
	            
	            String sql = "insert into comment(num,id,content,ref) values (?,?,?,?)";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, comment.getNum());
	            pstmt.setString(2, comment.getId());
	            pstmt.setString(3, comment.getContent());
	            pstmt.setInt(4, comment.getRef());
	            
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
	    
	    // ��� ��� ��������
	    public ArrayList<CommentElementBean> getCommentList(int boardNum)
	    {
	        ArrayList<CommentElementBean> list = new ArrayList<CommentElementBean>();
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	            
	            /* ����� ������ ó���� �ϰ�ʹٸ� �� ������ ����ϸ� �ȴ�.
	             * SELECT * FROM
	             *            (SELECT  ROWNUM AS rnum,
	             *                   data.*
	             *             FROM
	             *                   (SELECT LEVEL,
	             *                           COMMENT_NUM,
	             *                             COMMENT_BOARD,
	             *                           COMMENT_ID,
	             *                           COMMENT_DATE,
	             *                           COMMENT_PARENT,
	             *                           COMMENT_CONTENT
	             *                    FROM BOARD_COMMENT
	             *                    WHERE COMMENT_BOARD = ?
	             *                   START WITH COMMENT_PARENT = 0
	             *                   CONNECT BY PRIOR COMMENT_NUM = COMMENT_PARENT) 
	             *              data)
	             *    WHERE rnum>=? and rnum<=? ;
	             */
	            
	            
	            String sql = "select * from comment where ref = ?";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, boardNum);
	            
	            rs = pstmt.executeQuery();
	            while(rs.next())
	            {
	                CommentElementBean comment = new CommentElementBean();
	                comment.setNum(rs.getInt("num"));
	                comment.setRef(rs.getInt("ref"));
	                comment.setId(rs.getString("id"));
	                comment.setReg(rs.getDate("reg"));
	                comment.setContent(rs.getString("content"));
	                list.add(comment);
	            }
	                
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	        
	        close();
	        return list;
	    } // end getCommentList
	    
	    
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
