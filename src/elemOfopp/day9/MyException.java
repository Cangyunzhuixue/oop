package elemOfopp.day9;
//����Զ���һ���쳣��
//1.�Զ�����쳣��̳����е��쳣��
//2.�ṩһ�����кţ��ṩ�������صĹ�����

//������д�ĸ���ķ��������׳����쳣����ֻ���Ǳ���д�ķ������쳣���������쳣����һ����
public class MyException extends RuntimeException{
	static final long serialVersionUID = -7034897190745766939L;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
