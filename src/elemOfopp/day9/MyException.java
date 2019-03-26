package elemOfopp.day9;
//如何自定义一个异常类
//1.自定义的异常类继承现有的异常类
//2.提供一个序列号，提供几个重载的构造器

//子类重写的父类的方法，其抛出的异常类型只能是被重写的方法的异常类的子类或异常类型一样。
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
