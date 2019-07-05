package ct.svc.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ct.dao.impl.MemberMysqlDaoImpl;
import ct.dao.inf.IMemberDao;
import ct.svc.MyFlow;
import ct.svc.inf.IMemberSvc;


//abstract public class UserLoginSvcImpl
public class MemberLoginSvcImpl
	implements IMemberSvc {
	private IMemberDao memberDao;
	public MemberLoginSvcImpl() {
		this.memberDao = new MemberMysqlDaoImpl();
	}
	
	@Override
	public MyFlow doAction(HttpServletRequest req, 
			HttpServletResponse res) throws Exception {
		// 1. ��û�� ó��(�Ķ�/�Ӽ� �м�)
		String email = req.getParameter("email");
		String pw = req.getParameter("pw");	
		
		// 2. ���� ���� ���� (VO?)
		//    �����Ͻ� ���� ����, ���� DB���� ����� 
		//    �����Ͱ� �ʿ��ϸ� DAO�� ����
		int r = this.memberDao.loginProcess(email, pw);
		// 3. DAO�� ���� �ش� ������ sql ���� ó��
		// 4. ����� �Ǵ��Ͽ� ��Ʈ�ѷ��� ������
		//	    ��, �������� ǥ���� UI view�� �����ϰ�,
		//    �̵����(forward,redirect)�� ����
		MyFlow mf = null;
		HttpSession ses = req.getSession(); 
		switch (r) {
		case IMemberDao.MB_LOGIN_SUCCESS:
			// ���� ó��
			System.out.println("svc: �α��� ���� ���� - " + email);
			ses.setAttribute("login", email);
			// ������ �̵� ó��
			mf = new MyFlow("blog_show_list.my", false);
			break;
		case IMemberDao.MB_LOGIN_ERROR:			
		case IMemberDao.MB_LOGIN_NO_USER:
		case IMemberDao.MB_LOGIN_PARAM_ID_EMPTY:
		case IMemberDao.MB_LOGIN_PARAM_ID_NULL:
		case IMemberDao.MB_LOGIN_PARAM_LIMIT:
		case IMemberDao.MB_LOGIN_PARAM_PW_EMPTY:
		case IMemberDao.MB_LOGIN_PARAM_PW_NULL:
		case IMemberDao.MB_LOGIN_PASSWORD_MISMATCH:
			ses.setAttribute("msg", 
					"�α��� ���� - CODE: " + r);
			mf = new MyFlow("/MyBlog", false);
			break;			
		default:
			ses.setAttribute("msg", 
					"ó�� �� �� ���� �α��� ���� - CODE: " + r);
			mf = new MyFlow("/MyBlog", false);
						// default.my(web.xml) 
						// => default.jsp
						// => _mb_login.jsp
			break;
		}
		
		return mf;
	}	
}

