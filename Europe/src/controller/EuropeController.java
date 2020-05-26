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
import action_add.AddMarketAction;
import action_add.AddMemberAction;
import action_add.AddReviewAction;
import action_add.AddTipAction;
import action_add.AddTogetherAction;
import action_delete.DeleteMarketAction;
import action_delete.DeleteReviewAction;
import action_delete.DeleteTipAction;
import action_delete.DeleteTogetherAction;
import action_edit.EditMarketAction;
import action_edit.EditReviewAction;
import action_edit.EditTipAction;
import action_edit.EditTogetherAction;
import action_find.FindMarketAction;
import action_find.FindMemberAction;
import action_find.FindNewsAction;
import action_find.FindReviewAction;
import action_find.FindTipAction;
import action_find.FindTogetherAction;
import action_list.ListMarketAction;
import action_list.ListNewsAction;
import action_list.ListReviewAction;
import action_list.ListTipAction;
import action_list.ListTogetherAction;


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
		
		//List
		if (command.equals("/MarketListViewAction.do")) {
			action = new ListMarketAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("market.jsp");
			rd.forward(request, response);
		} else if(command.equals("/MarketListByCategory.do")) {
			action = new ListMarketAction("listbycategory");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("market.jsp?mode=listbycategory");
			rd.forward(request, response);
		} else if(command.equals("/MarketListByCountry.do")) {
			action = new ListMarketAction("listbycountry");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("market.jsp?mode=listbycountry");
			rd.forward(request, response);
		} else if(command.equals("/MarketSelectTitle.do")) {
			action = new ListMarketAction("titleselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("market.jsp?mode=titleselect");
			rd.forward(request, response);
		} else if(command.equals("/MarketSelectWriter.do")) {
			action = new ListMarketAction("writerselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("market.jsp?mode=writerselect");
			rd.forward(request, response);
		} else if (command.equals("/ReviewListViewAction.do")) {
			action = new ListReviewAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("review.jsp");
			rd.forward(request, response);
		} else if(command.equals("/ReviewListByCategory.do")) {
			action = new ListReviewAction("listbycategory");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("review.jsp?mode=category");
			rd.forward(request, response);
		} else if(command.equals("/ReviewListByCountry.do")) {
			action = new ListReviewAction("listbycountry");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("review.jsp?mode=country");
			rd.forward(request, response);
		} else if(command.equals("/ReviewSelectTitle.do")) {
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
		} else if (command.equals("/TipListViewAction.do")) {
			action = new ListTipAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("tip.jsp");
			rd.forward(request, response);
		} else if(command.equals("/TipListByCategory.do")) {
			action = new ListTipAction("listbycategory");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("tip.jsp?mode=category");
			rd.forward(request, response);
		} else if(command.equals("/TipListByCountry.do")) {
			action = new ListTipAction("listbycountry");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("tip.jsp?mode=country");
			rd.forward(request, response);
		} else if(command.equals("/TipSelectTitle.do")) {
			action = new ListTipAction("titleselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("tip.jsp?mode=titleselect");
			rd.forward(request, response);
		} else if(command.equals("/TipSelectWriter.do")) {
			action = new ListTipAction("writerselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("tip.jsp?mode=writerselect");
			rd.forward(request, response);
		}  else if (command.equals("/TogetherListViewAction.do")) {
			action = new ListTogetherAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("together.jsp");
			rd.forward(request, response);
		} else if(command.equals("/TogetherListByCountry.do")) {
			action = new ListTogetherAction("listbycountry");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("together.jsp?mode=country");
			rd.forward(request, response);
		} else if(command.equals("/TogetherSelectTitle.do")) {
			action = new ListTogetherAction("titleselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("together.jsp?mode=titleselect");
			rd.forward(request, response);
		} else if(command.equals("/TogetherSelectWriter.do")) {
			action = new ListTogetherAction("writerselect");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("together.jsp?mode=writerselect");
			rd.forward(request, response);
		}
		
		//Find
		else if (command.equals("/MarketDetailViewAction.do")) {
			action = new FindMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("MarketdetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/ReviewDetailViewAction.do")) {
			action = new FindReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("ReviewdetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/NewsDetailViewAction.do")) {
			action = new FindNewsAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("NewsdetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TipDetailViewAction.do")) {
			action = new FindTipAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("TipdetailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TogetherDetailViewAction.do")) {
			action = new FindTogetherAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("TogetherdetailView.jsp");
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
		}  else if (command.equals("/MarketEditViewAction.do")) {
			action = new FindMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("MarketeditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/NewsEditViewAction.do")) {
			action = new FindNewsAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("NewseditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/ReviewEditViewAction.do")) {
			action = new FindReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("RevieweditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TipEditViewAction.do")) {
			action = new FindTipAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("TipeditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TogetherEditViewAction.do")) {
			action = new FindMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("TogethereditView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/MemberEditViewAction.do")) {
			action = new FindMemberAction("select");
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("editmyinfo.jsp");
			rd.forward(request, response);
		} 
		
		//Add
		else if (command.equals("/MarketAddviewAction.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("marketwrite.jsp");
			rd.forward(request, response);
		} else if (command.equals("/ReviewAddviewAction.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("reviewwrite.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TipAddviewAction.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("tipwrite.jsp");
			rd.forward(request, response);
		} else if (command.equals("/TogetherAddviewAction.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("togetherwrite.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AddMarketAction.do")) {
			action = new AddMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/MarketListViewAction.do");
			rd.forward(request, response);
		}  else if (command.equals("/AddReviewAction.do")) {
			action = new AddReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ReviewListViewAction.do");
			rd.forward(request, response);
		}  else if (command.equals("/AddTipAction.do")) {
			action = new AddTipAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TipListViewAction.do");
			rd.forward(request, response);
		}  else if (command.equals("/AddTogetherAction.do")) {
			action = new AddTogetherAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TogetherListViewAction.do");
			rd.forward(request, response);
		} 
		
		//Edit
		else if (command.equals("/EditMarketAction.do")) {
			action = new EditMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/MarketListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/EditReviewAction.do")) {
			action = new EditReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ReviewListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/EditTipAction.do")) {
			action = new EditTipAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TipListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/EditTogetherAction.do")) {
			action = new EditTogetherAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TogetherListViewAction.do");
			rd.forward(request, response);
		} 
		
		//Delete
		else if (command.equals("/DeleteMarketAction.do")) {
			action = new DeleteMarketAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/MarketListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/DeleteReviewAction.do")) {
			action = new DeleteReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ReviewListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/DeleteTipAction.do")) {
			action = new DeleteTipAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TipListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/DeleteTogetherAction.do")) {
			action = new DeleteTogetherAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/TogetherListViewAction.do");
			rd.forward(request, response);
		} 
		
		//Login
		else if (command.equals("/LoginAction.do")) {
			action = new LoginAction("login");
			action.execute(request, response);
			HttpSession session = request.getSession(true);
			int member = (int)session.getAttribute("member");
			if (member == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("loginfail.jsp");
				rd.forward(request, response);
			}
		} else if (command.equals("/LogoutAction.do")) {
			action = new LoginAction("logout");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else if (command.equals("/JoinMemberAction.do")) {
			action = new AddMemberAction("join");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
