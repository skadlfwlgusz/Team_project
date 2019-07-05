package ct.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ct.svc.MyFlow;
import ct.svc.impl.MemberAddSvcImpl;
import ct.svc.impl.MemberLoginSvcImpl;
import ct.svc.inf.IMemberSvc;


/**
Servlet implementation class FrontController
0:0:0:0:0:0:0:1, /MyBlog/hello.my
0:0:0:0:0:0:0:1, /MyBlog/hello43433443.my
0:0:0:0:0:0:0:1, /MyBlog/hello/343433443.my
0:0:0:0:0:0:0:1, /MyBlog/hello/yolgil.my
 */
@WebServlet(description = "Url mapping, flow control, security, logging..", 
	urlPatterns = { "*.ct" }) //, "/myblog/mm/*" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doWWW(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doWWW(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException  
	{
		// get, post ��û ��� ���� ó��
		String addr = request.getRemoteAddr();
		String uri = request.getRequestURI();
		
		String ctxPath = request.getContextPath();
		System.out.println("ctxPath = " + ctxPath);
		System.out.println("uri = " + uri);
		
		String action = null;
		// .my�� endsWith? ����, uri "/" ����?
		if( uri.equals(ctxPath+"/") ) {
			//action = "default";
			action = "/";
		} else {
			System.out.println("Action = " +
			 uri.substring(ctxPath.length()+1, // "/??"
					 uri.length()-3) // ".my"
					//uri.substring(ctxPath.length())
					);
			action = uri.substring(
				ctxPath.length()+1, uri.length()-3);
		}
		
		response.setContentType
				("text/html; charset=UTF-8");
		//PrintWriter pw = response.getWriter();
		//pw.append(addr + ", " + uri);
		System.out.println(addr + ", " + uri);
		MyFlow mf = null;
		IMemberSvc svc = null;
		//String viewPath = "/";
		
		// ���� �б� ó�� (URL ����) ---------
		switch(action) {
			// 0. ���� ������ /MyBlog/default.my
			// 	   		    /MyBlog  (web.xml)
			case "/":				
				//request.setAttribute("msg",
				//		"���� /��û���� �Ծ��!");
			case "default": 
				mf = 
				 new MyFlow("index.jsp", true);
				 //new MyFlow("view/member/new_mb.jsp", true);
				break;
			//1. ȸ���� ������ �� �ִ�. (�ߺ�..)
			// new_member.my <<FORWARD>>
			case "new_member": // (������ �غ�)
				System.out.println(">> new_member.jsp!!!");
				mf = new MyFlow();
				mf.setViewPath("join/join2.jsp");
				mf.setForward(true);
				break;
			// member_add_proc.my <<REDIRECT>>
			case "member_add_proc": //  (DAO ����)	
				System.out.println(">> !!!");
		 
				svc = new MemberLoginSvcImpl();
				try {
					mf = svc.doAction(request, response);
				} catch (Exception e) {					
					e.printStackTrace();
				}

				break;
				
			//2. ȸ���� �α���/�α׾ƿ� �� �� �ִ�.
			//member_login_proc.ct
			
			case "member_login_proc": //<<REDIRECT>>

				HttpSession ses = request.getSession();

				ses.setAttribute("msg",

						"�α��� �õ�");

				System.out.println("�α��� �õ�");

				//UserLoginSvcImpl svc2 =

				svc = new MemberLoginSvcImpl();				

			try {

				mf = svc.doAction(request, response);

			} catch (Exception e) {

				e.printStackTrace();

			}				

//				mf = new MyFlow();

//				mf.setViewPath("default.jsp");

//				mf.setForward(false);

				break;
				
				
				

			default:
			   response
			   	.sendError(
			   	 HttpServletResponse.SC_NOT_FOUND);
				//.sendError(404);
			   System.out.println("error 404!");
			   return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// -------------------------
		if( mf != null ) {
			if(	mf.isForward() == true ) {
				RequestDispatcher rd = 
				request
				   .getRequestDispatcher(mf.getViewPath());
				rd.forward(request, response);// ������
			}
			else
				response.sendRedirect(mf.getViewPath());
		} else {
			response.sendError(
					HttpServletResponse
					.SC_INTERNAL_SERVER_ERROR 
					);  // 500
			System.out.println("mf null!!");
		}
		
		/* ���� Ȥ�� �̵��� ó���ϴ� ���...
		 *  1. �����ڵ� ������ res.sendError(code)
		 *  2. rd.forward, <jsp:forward ����url>
		 *  3. rd.include, <jsp:include>
		 *  4. res.sendRedirect(��/�ܺ�url)
		 */  
		
		
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		doWWW(request, response);
		//doGet(request, response);
	}
}




