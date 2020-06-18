package action_edit;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.CommentDAO;
import dto.CommentElementBean;

public class CommentUpdateAction implements Action2
{
    @Override
    public ActionForward execute(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        // 파라미터를 가져온다.
        int comment_num = Integer.parseInt(request.getParameter("comment_num"));
        String comment_content = request.getParameter("comment_content");
        
        CommentDAO dao = CommentDAO.getInstance();
        
        CommentElementBean comment = new CommentElementBean();
        comment.setNum(comment_num);
        comment.setContent(comment_content);
        
        boolean result = dao.updateComment(comment);
        
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        
        // 정상적으로 댓글을 수정했을경우 1을 전달한다.
        if(result) out.println("1");
        
        out.close();
        
        return null;
    }
}