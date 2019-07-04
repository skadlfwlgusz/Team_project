package ct.svc.impl;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ct.dao.impl.MemberMysqlDaoImpl;
import ct.dao.inf.IMemberDao;
import ct.svc.MyFlow;
import ct.svc.inf.IMemberSvc;


public class MemberAddSvcImpl implements IMemberSvc {
	@Override
	public MyFlow doAction(
			HttpServletRequest req,
			HttpServletResponse res)
		throws Exception
		//throws ServletException, IOException
	{
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String birthbefore = req.getParameter("birth");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Date birth= new Date( sdf.parse(birthbefore).getTime() );
		String phone = req.getParameter("phone");
		System.out.println(email);
//		Map<String,String> join
//		   = new HashMap<>();
//		join.put("email", email);
//		join.put("pw", pw);
		IMemberDao mbDao = new MemberMysqlDaoImpl();
		//UserVO user = new UserVO(email,pw);
		//mbDao.insertOneUser(user);
		MyFlow mf = null;
		if( mbDao.insertOneNewUser(email, password,birth, phone)) {
			System.out.println("svc: user insert OK.");
			mf = new MyFlow("default.ct",false); // �����̷�Ʈ
		} else {
			System.out.println("svc: user insert Error.");
			mf = new MyFlow("index.jsp",true); // ������
		}
		// �Ӽ��� ���ؼ� UI �� jsp ��������� ������ ����
		//req.setAttribute("msg", "insert OK!");
		//req.setAttribute("join", join);
//		MyFlow mf 
//		 //= new MyFlow("/MyBlog",false); // �����̷�Ʈ
//		 = new MyFlow("default.jsp",true); // ������
		return  mf;
	}
}


