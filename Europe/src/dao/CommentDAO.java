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
	    
	    // 댓글 등록
	    public boolean insertComment(CommentElementBean comment)
	    {
	        boolean result = false;
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	 
	            // 자동 커밋을 false로 한다.
	            conn.setAutoCommit(false);
	            
	            String sql = "insert into comment(id,content,ref) values (?,?,?)";
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, comment.getId());
	            pstmt.setString(2, comment.getContent());
	            pstmt.setInt(3, comment.getRef());
	            
	            int flag = pstmt.executeUpdate();
	            if(flag > 0){
	                result = true;
	                conn.commit(); // 완료시 커밋
	            }
	            
	        } catch (Exception e) {
	            try {
	                conn.rollback(); // 오류시 롤백
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            } 
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	        
	        close();
	        return result;    
	    } // end boardInsert();    
	    
	    // 댓글 목록 가져오기
	    public ArrayList<CommentElementBean> getCommentList(int boardNum)
	    {
	        ArrayList<CommentElementBean> list = new ArrayList<CommentElementBean>();
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	            
	            /* 댓글의 페이지 처리를 하고싶다면 이 쿼리를 사용하면 된다.
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
	    
	 // 댓글 삭제
	    public boolean deleteComment(int comment_num) 
	    {
	        boolean result = false;
	 
	        try {
	            conn = ConnectionProvider.getConnection();
	            conn.setAutoCommit(false); // 자동 커밋을 false로 한다.
	            
	            String sql = "delete from comment where num=?";
	            
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, comment_num);
	            
	            int flag = pstmt.executeUpdate();
	            if(flag > 0){
	                result = true;
	                conn.commit(); // 완료시 커밋
	            }    
	            
	        } catch (Exception e) {
	            try {
	                conn.rollback(); // 오류시 롤백
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            }
	            throw new RuntimeException(e.getMessage());
	        }
	 
	        close();
	        return result;
	    } // end deleteComment
	    
	 // 댓글 1개의 정보를 가져온다.
	    public CommentElementBean getComment(int comment_num)
	    {
	        CommentElementBean comment = null;
	        
	        try {
	            conn = ConnectionProvider.getConnection();
	            
	            String sql = "select * from comment where num = ?";
	           
	            pstmt = conn.prepareStatement(sql.toString());
	            pstmt.setInt(1, comment_num);
	            
	            rs = pstmt.executeQuery();
	            while(rs.next())
	            {
	                comment = new CommentElementBean();
	                comment.setNum(rs.getInt("num"));
	                comment.setRef(rs.getInt("ref"));
	                comment.setId(rs.getString("id"));
	                comment.setReg(rs.getDate("reg"));
	                comment.setContent(rs.getString("content"));
	            }
	        } catch (Exception e) {
	            throw new RuntimeException(e.getMessage());
	        }
	        
	        close();
	        return comment; 
	    } // end getComment
	    
	 // 댓글 수정
	    public boolean updateComment(CommentElementBean comment) 
	    {
	        boolean result = false;
	        
	        try{
	            conn = ConnectionProvider.getConnection();
	            conn.setAutoCommit(false); // 자동 커밋을 false로 한다.
	            
	            String sql = "update comment set content=? where num=?";
	 
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, comment.getContent());
	            pstmt.setInt(2, comment.getNum());
	 
	            int flag = pstmt.executeUpdate();
	            if(flag > 0){
	                result = true;
	                conn.commit(); // 완료시 커밋
	            }
	            
	        } catch (Exception e) {
	            try {
	                conn.rollback(); // 오류시 롤백
	            } catch (SQLException sqle) {
	                sqle.printStackTrace();
	            }
	            e.printStackTrace();
	            throw new RuntimeException(e.getMessage());
	        }
	    
	        close();
	        return result;
	    } // end updateComment
	    
	    // DB 자원해제
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
