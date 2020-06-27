package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import action.Action;
import action.LoginAction;
import action.ServiceException;
import action_add.AddMemberAction;
import action_add.AddReviewAction;
import action_add.MyCountryAddAction;
import action_add.MyTravelAddAction;
import action_delete.DeleteReviewAction;
import action_delete.MyCountryDeleteAction;
import action_delete.MyTravelDeleteAction;
import action_edit.EditMemberAction;
import action_edit.EditReviewAction;
import action_find.FindLocationAction;
import action_find.FindMemberAction;
import action_find.FindReviewAction;
import action_find.FindTravelAction;
import action_list.ListLocationAction;
import action_list.ListReviewAction;
import action_list.ListTravelAction;
import dao.ReviewTableDAO;
import jdbc.ConnectionProvider;

import java.io.File;
import java.io.IOException;

//파일이 중복될 경우 저절로 이름을 바꿔주는 import
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;


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
		if (command.equals("/EnglandInformationListViewAction.do")) {
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
		else if (command.equals("/FranceInformationListViewAction.do")) {
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
		else if (command.equals("/KoreaInformationListViewAction.do")) {
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
		else if (command.equals("/SwissInformationListViewAction.do")) {
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
		else if (command.equals("/GermanyInformationListViewAction.do")) {
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
		else if (command.equals("/HungaryInformationListViewAction.do")) {
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
		else if (command.equals("/CzechInformationListViewAction.do")) {
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
		else if (command.equals("/ItalyInformationListViewAction.do")) {
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
		else if(command.equals("/ReviewSelect.do")) {
			String kind = request.getParameter("kind");
			System.out.println(kind);
			action = new ListReviewAction(kind + "select");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("ListView.jsp?mode="+kind+"select");
			rd.forward(request, response);
		} 
		
		//Find
		else if (command.equals("/DetailViewAction.do")) {
			action = new FindReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("DetailView.jsp");
			rd.forward(request, response);
		}  else if (command.equals("/MemberDetailViewAction.do")) {
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
		}  else if (command.equals("/EditViewAction.do")) {
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
			String directory = request.getServletContext().getRealPath("/upload/");
			MultipartRequest multi = null;

			int maxSize= 10* 1024 * 1024;
			String encoding = "UTF-8";
		
			Connection conn = null;
			
			try {
				conn = ConnectionProvider.getConnection();
				ReviewTableDAO dao = ReviewTableDAO.getInstance();
				multi = new MultipartRequest(request,directory,maxSize,encoding, new DefaultFileRenamePolicy());
				String country = multi.getParameter("country");
				String cate1 = multi.getParameter("cate1");
				String name = multi.getParameter("name");
				String title = multi.getParameter("title");
				String detail = multi.getParameter("detail");
				String fileName = multi.getOriginalFileName("file");
				String fileRealName = multi.getFilesystemName("file");
				dao.insert(conn, country, cate1, name, title, detail,fileName,fileRealName);
				
				System.out.println(fileName);	
				System.out.println(fileRealName);	
				RequestDispatcher rd = request.getRequestDispatcher("/"+country+cate1+"ListViewAction.do");
				rd.forward(request, response);	
			} catch(SQLException e){
				throw new ServiceException("AddReviewAction Error " + e.getMessage());
			} catch(IOException e1) {
				e1.printStackTrace();
			}
			finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}	
		}
		
		//Edit
		else if (command.equals("/EditAction.do")) {
			String directory = request.getServletContext().getRealPath("/upload/");
			MultipartRequest multi = null;
			int maxSize= 10* 1024 * 1024;
			String encoding = "UTF-8";
			
			Connection conn = null;
			try {
				multi = new MultipartRequest(request,directory,maxSize,encoding, new DefaultFileRenamePolicy());
				conn = ConnectionProvider.getConnection();
				ReviewTableDAO dao = ReviewTableDAO.getInstance();
				
				int number = Integer.parseInt(multi.getParameter("number"));
				String country = multi.getParameter("country");
				String cate1 = multi.getParameter("cate1");
				String title = multi.getParameter("title");
				String detail = multi.getParameter("detail");
				String exfileName = multi.getOriginalFileName("existfile_name");
				String exfileRealName = multi.getFilesystemName("existfile_real");
				
				Enumeration<String> fileNames = multi.getFileNames();
				if(fileNames.hasMoreElements())
				{
					String file_name = fileNames.nextElement();
					String fileName = multi.getOriginalFileName(file_name);
					String fileRealName = multi.getFilesystemName(file_name);
					
					if(fileRealName == null) {
						dao.edit(conn, number, country, cate1, title, detail,exfileName,exfileRealName);
					}
					else {
						dao.edit(conn, number, country, cate1, title, detail,fileName,fileRealName);
					}
				}
				
				System.out.println("Success Edit ReviewElement");
				
				RequestDispatcher rd = request.getRequestDispatcher("/DetailViewAction.do?number="+number);
				rd.forward(request, response);
			} catch(SQLException e){
				throw new ServiceException("EditReviewAction Error " + e.getMessage());
			} catch(IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}
		} else if (command.equals("/MemberEditAction.do")) {
			action = new EditMemberAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/MemberDetailViewAction.do");
			rd.forward(request, response);
		}
		
		//Delete
		else if (command.equals("/DeleteAction.do")) {
			String country = request.getParameter("country");
			String category = request.getParameter("cate1");
			action = new DeleteReviewAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/"+country+category+"ListViewAction.do");
			rd.forward(request, response);	
		}
		else if (command.equals("/DeleteLocationAction.do")) {
			int number = Integer.parseInt(request.getParameter("number"));
			action = new MyCountryDeleteAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ListLocationAction.do");
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
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
		else if(command.contentEquals("/ListTravelAction.do")) {
			String userid = request.getParameter("userid");
			action = new ListTravelAction();
			action.execute(request, response);
			RequestDispatcher rd= request.getRequestDispatcher("MyTravel.jsp?userid="+userid);
			rd.forward(request, response);
		}
		else if(command.contentEquals("/ListLocationAction.do")) {
			String number = request.getParameter("countryNumber");
			action = new ListLocationAction();
			action.execute(request, response);
			RequestDispatcher rd= request.getRequestDispatcher("CountryTravel.jsp?countryNumber="+number);
			rd.forward(request, response);
		}
		else if(command.contentEquals("/MyTravelAddAction.do")) {
			action = new MyTravelAddAction();
			action.execute(request, response);
			RequestDispatcher rd= request.getRequestDispatcher("/ListTravelAction.do");
			rd.forward(request, response);
		}
		else if (command.equals("/DetailTravelAction.do")) {
			action = new FindTravelAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("CountryTravel.jsp");
			rd.forward(request, response);
		}
		else if(command.contentEquals("/MyCountryAddAction.do")) {	// 장소 추가
			action = new MyCountryAddAction();
			action.execute(request, response);
			RequestDispatcher rd= request.getRequestDispatcher("/ListLocationAction.do");
			rd.forward(request, response);
		}
		else if (command.equals("/CountryTravelAction.do")) {	// countryTravel -> countryTravelAdd
			action = new FindTravelAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("CountryTravelAdd.jsp");
			rd.forward(request, response);
		}
		else if (command.contentEquals("/DetailLocationAction.do")) {
			action = new FindLocationAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("CountryTravel.jsp");
			rd.forward(request, response);
		}
	}

}
