package elemOfopp.day8.exception;

public class TestFinally {
public static void main(String[] args) {
	int i=test();
	System.out.println(i);
}
public static int test() {
	try {
		
		return 1;//
	}catch (Exception e) {
		// TODO: handle exception
	}finally {
		System.out.println(2);
		return 0;
	}
	
}
}
