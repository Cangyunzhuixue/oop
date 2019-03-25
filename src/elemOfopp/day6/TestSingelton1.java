package elemOfopp.day6;
/*
 * 懒汉式
 * 可能存在线程安全问题
 */
public class TestSingelton1 {
	public static void main(String[] args) {
		Singelton1 s1=Singelton1.getInstacnce();
		Singelton1 s2=Singelton1.getInstacnce();
		System.out.println(s1==s2);
	}
}
class Singelton1{
	//1、私有化构造方法
	private Singelton1(){
		
	}
	//2、类的内部构造一个实例
	private static Singelton1 instance=null;
	
	public static Singelton1 getInstacnce() {
		if(instance==null) {
			instance=new Singelton1();
			
		}
		return instance;
	}
}