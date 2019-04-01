package elemOfopp.day11;
//关于懒汉式的线程安全问题：使用同步机制
//对于一般方法内，使用同步代码块，可以考虑用this
//静态方法可以用本身为锁
public class TestSingle {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1==s2);
}

}
class Singleton{
	private Singleton() {
	}
	private static Singleton instance=null;
	
	public static Singleton getInstance() {
		if (instance==null) {//掉率高一点
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			} 
		}
		return instance;
	}
	}