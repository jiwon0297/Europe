package action_add;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.CommentDAO;
import dto.CommentElementBean;

public class CommentWriteAction implements Action2{
	 @Override
	    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        
	        CommentDAO dao = CommentDAO.getInstance();
	        CommentElementBean comment = new CommentElementBean();
	        
	        // 파리미터 값을 가져온다.
	        int comment_board = Integer.parseInt(request.getParameter("number"));
	        String comment_id = request.getParameter("comment_id");
	        String comment_content = request.getParameter("comment_content");

	        comment.setNum(dao.getSeq());
	        comment.setRef(comment_board);
	        comment.setId(comment_id);
	        comment.setContent(comment_content);
	        
	        boolean result = dao.insertComment(comment);
	 
	        if(result){
	            response.setContentType("text/html;charset=euc-kr");
	            PrintWriter out = response.getWriter();
	            out.println("1");
	            out.close();
	        }
	            
	        return null;
	    }
}
