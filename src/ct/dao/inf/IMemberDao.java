package ct.dao.inf;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import ct.model.MemberVO;

public interface IMemberDao {
	
	// �α��� ���� ���� ����� loginProcess()
		public static final int MB_LOGIN_ERROR = 0;
		public static final int MB_LOGIN_SUCCESS = 1;
		public static final int MB_LOGIN_NO_USER = 11;
		public static final int MB_LOGIN_PASSWORD_MISMATCH = 21;
		public static final int MB_LOGIN_PARAM_ID_NULL = 31;
		public static final int MB_LOGIN_PARAM_ID_EMPTY = 33;
		public static final int MB_LOGIN_PARAM_PW_NULL = 35;
		public static final int MB_LOGIN_PARAM_PW_EMPTY = 37;
		public static final int MB_LOGIN_PARAM_LIMIT = 41;	
//		1. ȸ���� ������ �� �ִ�. (�ߺ�..)
		boolean insertOneNewUser(String email,String password,Date birth,String phone);
		boolean insertOneNewUser(MemberVO member);
//		2. ȸ���� �α���/�α׾ƿ� �� �� �ִ�.
		int loginProcess(String email, String pw);
//		10. ������ ȸ�� ����Ʈ ��ȸ�ϱ�
		List<MemberVO> selectAllUsers();

}
