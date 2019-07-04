package ct.svc;
// FrontController���� url ������ �б� ��
// �� case���� viewPath�� redirect Ȥ�� 
// foward�� �ϴ� ���¸� ��� ��ü
// => �帧��� ����
public class MyFlow {
	private String viewPath;
	 // �̵� ��� ���ڿ�
	private boolean isForward;
	 // ������ ���� , false��� �����̷�Ʈ
	
	public MyFlow() {}
	public MyFlow(String viewPath, boolean isForward) {
		super();
		this.viewPath = viewPath;
		this.isForward = isForward;
	}	
	
	@Override
	public String toString() {
		return "MyFlow [viewPath=" + viewPath + ", isForward=" + isForward + "]";
	}
	
	public String getViewPath() {
		return viewPath;
	}
	public void setViewPath(String viewPath) {
		this.viewPath = viewPath;
	}
	public boolean isForward() {
		return isForward;
	}
	public void setForward(boolean isForward) {
		this.isForward = isForward;
	}
	
	
}

