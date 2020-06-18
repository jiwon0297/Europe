package action_delete;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.CommentDAO;

public class CommentDeleteAction implements Action2 {
	 @Override
	    public ActionForward execute(HttpServletRequest request,
	            HttpServletResponse response) throws Exception {
	    
	        int comment_num = Integer.parseInt(request.getParameter("comment_num"));
	        
	        CommentDAO dao = CommentDAO.getInstance();
	        boolean result = dao.deleteComment(comment_num);
	        
	        response.setContentType("text/html;charset=utf-8");
	        PrintWriter out = response.getWriter();
	 
	        // ���������� ����� ����������� 1�� �����Ѵ�.
	        if(result) out.println("1");
	        
	        out.close();
	        return null;
	    }
}
