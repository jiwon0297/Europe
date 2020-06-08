package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.LoginAction;
import action_add.AddMemberAction;
import action_add.AddReviewAction;
import action_delete.DeleteReviewAction;
import action_edit.EditMemberAction;
import action_edit.EditReviewAction;
import action_find.FindMemberAction;
import action_find.FindNewsAction;
import action_find.FindReviewAction;
import action_list.ListNewsAction;
import action_list.ListReviewAction;


@WebServlet("/EuropeController")
public class EuropeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EuropeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html, charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		Action action = null;
		
		//ENGLAND
		if (command.equals("/EnglandInfoListViewAction.do")) {
			action = new ListReviewAction("englandinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=englandinfo");
			rd.forward(request, response);
		} else if(command.equals("/EnglandMarketListViewAction.do")) {
			action = new ListReviewAction("englandmarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=englandmarket");
			rd.forward(request, response);
		} else if(command.equals("/EnglandTogetherListViewAction.do")) {
			action = new ListReviewAction("englandtogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=englandtogether");
			rd.forward(request, response);
		} 
		
		//FRANCE
		else if (command.equals("/FranceInfoListViewAction.do")) {
			action = new ListReviewAction("franceinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=franceinfo");
			rd.forward(request, response);
		} else if(command.equals("/FranceMarketListViewAction.do")) {
			action = new ListReviewAction("francemarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=francemarket");
			rd.forward(request, response);
		} else if(command.equals("/FranceTogetherListViewAction.do")) {
			action = new ListReviewAction("francetogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=francetogether");
			rd.forward(request, response);
		} 
		
		//KOREA
		else if (command.equals("/KoreaInfoListViewAction.do")) {
			action = new ListReviewAction("koreainfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=koreainfo");
			rd.forward(request, response);
		} else if(command.equals("/KoreaMarketListViewAction.do")) {
			action = new ListReviewAction("koreamarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=koreamarket");
			rd.forward(request, response);
		} else if(command.equals("/KoreaTogetherListViewAction.do")) {
			action = new ListReviewAction("koreatogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=koreatogether");
			rd.forward(request, response);
		} 
		
		//SWISS
		else if (command.equals("/SwissInfoListViewAction.do")) {
			action = new ListReviewAction("swissinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=swissinfo");
			rd.forward(request, response);
		} else if(command.equals("/SwissMarketListViewAction.do")) {
			action = new ListReviewAction("swissmarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=swissmarket");
			rd.forward(request, response);
		} else if(command.equals("/SwissTogetherListViewAction.do")) {
			action = new ListReviewAction("swisstogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=swisstogether");
			rd.forward(request, response);
		} 
		
		//GERMANY
		else if (command.equals("/GermanyInfoListViewAction.do")) {
			action = new ListReviewAction("germanyinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=germanyinfo");
			rd.forward(request, response);
		} else if(command.equals("/GermanyMarketListViewAction.do")) {
			action = new ListReviewAction("germanymarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=germanymarket");
			rd.forward(request, response);
		} else if(command.equals("/GermanyTogetherListViewAction.do")) {
			action = new ListReviewAction("germanytogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=germanytogether");
			rd.forward(request, response);
		} 
		
		//HUNGARY
		else if (command.equals("/HungaryInfoListViewAction.do")) {
			action = new ListReviewAction("hungaryinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=hungaryinfo");
			rd.forward(request, response);
		} else if(command.equals("/HungaryMarketListViewAction.do")) {
			action = new ListReviewAction("hungarymarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=hungarymarket");
			rd.forward(request, response);
		} else if(command.equals("/HungaryTogetherListViewAction.do")) {
			action = new ListReviewAction("hungarytogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=hungarytogether");
			rd.forward(request, response);
		} 
		
		//CZECH
		else if (command.equals("/CzechInfoListViewAction.do")) {
			action = new ListReviewAction("czechinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=czechinfo");
			rd.forward(request, response);
		} else if(command.equals("/CzechMarketListViewAction.do")) {
			action = new ListReviewAction("czechmarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=czechmarket");
			rd.forward(request, response);
		} else if(command.equals("/CzechTogetherListViewAction.do")) {
			action = new ListReviewAction("czechtogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=czechtogether");
			rd.forward(request, response);
		} 
		
		//ITALY
		else if (command.equals("/ItalyInfoListViewAction.do")) {
			action = new ListReviewAction("italyinfo");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=italyinfo");
			rd.forward(request, response);
		} else if(command.equals("/ItalyMarketListViewAction.do")) {
			action = new ListReviewAction("italymarket");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=italymarket");
			rd.forward(request, response);
		} else if(command.equals("/ItalyTogetherListViewAction.do")) {
			action = new ListReviewAction("italytogether");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode=italytogether");
			rd.forward(request, response);
		} 
		
		
		//search
		else if(command.equals("/ReviewSelectTitle.do")) {
			action = new ListReviewAction("titleselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("review.jsp?mode=titleselect");
			rd.forward(request, response);
		} else if(command.equals("/ReviewSelectWriter.do")) {
			action = new ListReviewAction("writerselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("review.jsp?mode=writerselect");
			rd.forward(request, response);
		} else if (command.equals("/NewsListViewAction.do")) {
			action = new ListNewsAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("news.jsp");
			rd.forward(request, response);
		} else if(command.equals("/NewsSelectTitle.do")) {
			action = new ListNewsAction("titleselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("news.jsp?mode=titleselect");
			rd.forward(request, response);
		} else if(command.equals("/NewsSelectWriter.do")) {
			action = new ListNewsAction("writerselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("news.jsp?mode=writerselect");
			rd.forward(request, response);
		}
		
		//Find
		else if (command.equals("/DetailViewAction.do")) {
			action = new FindReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("DetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/NewsDetailViewAction.do")) {
			action = new FindNewsAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("NewsdetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/MemberDetailViewAction.do")) {
			action = new FindMemberAction("select");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("myinfo.jsp");
			rd.forward(request, response);
		} else if (command.equals("/FindIdAction.do")) {
			action = new FindMemberAction("findid");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("findid.jsp");
			rd.forward(request, response);
		} else if (command.equals("/FindPwAction.do")) {
			action = new FindMemberAction("findpassword");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("findpw.jsp");
			rd.forward(request, response);
		} else if (command.equals("/NewsEditViewAction.do")) {
			action = new FindNewsAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("NewseditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/EditViewAction.do")) {
			action = new FindReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("EditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/MemberEditViewAction.do")) {
			action = new FindMemberAction("select");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("editmyinfo.jsp");
			rd.forward(request, response);
		} 
		
		//Add
		else if (command.equals("/AddviewAction.do")) {
			action = new FindMemberAction("select");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("Write.jsp");
			rd.forward(request, response);
		}  else if (command.equals("/AddAction.do")) {
			action = new AddReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}
		
		//Edit
		else if (command.equals("/EditAction.do")) {
			action = new EditReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		} else if (command.equals("/MemberEditAction.do")) {
			action = new EditMemberAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/MemberDetailViewAction.do");
			rd.forward(request, response);
		}
		
		//Delete
		else if (command.equals("/DeleteAction.do")) {
			action = new DeleteReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
			rd.forward(request, response);
		}

		
		//Login
		else if (command.equals("/LoginAction.do")) {
			action = new LoginAction("login");
			action.execute(request, response);
			HttpSession session = request.getSession(true);
			int member = (int)session.getAttribute("member");
			if (member == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("loginfail.jsp");
				rd.forward(request, response);
			}
		} else if (command.equals("/LogoutAction.do")) {
			action = new LoginAction("logout");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		} else if (command.equals("/JoinMemberAction.do")) {
			action = new AddMemberAction("join");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}
	}

}
