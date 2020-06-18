package action_edit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.CommentDAO;
import dto.CommentElementBean;

public class CommentUpdateFormAction implements Action2
{
 
    @Override
    public ActionForward execute(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        ActionForward forward = new ActionForward();
        
        // 수정할 댓글의 글번호를 가져온다.
        int comment_num = Integer.parseInt(request.getParameter("num"));
 
        CommentDAO dao = CommentDAO.getInstance();
        CommentElementBean comment = dao.getComment(comment_num);
        
        // 댓글 정보를 request에 세팅한다.
        request.setAttribute("comment", comment);
        
        forward.setRedirect(false);
        forward.setNextPath("CommentUpdateForm.jsp");
        
        return forward;
    }
}