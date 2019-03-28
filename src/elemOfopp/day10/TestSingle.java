package elemOfopp.day10;

public class TestSingle {

}
//饿汉式:提前创建好对象
class Single{
	private Single(){
		
	}
	private static Single instance=new Single();
	public static Single getInstance() {
		return instance;
	}
}

//懒汉式：调用时才创建
class Single2{
	private static Single2 instance=null;
	private Single2() {
		
	}
	
	public static Single2 getInstance() {
		if(instance==null) {
			instance=new Single2();
		}
		return instance;
	}
}