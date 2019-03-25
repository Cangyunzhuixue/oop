package elemOfopp.day6;
/**
 * 饿汉式
 * 单例的设计模式：
 * 1、解决的问题，是的一个类只能创建一个对象
 * 2、如何实现
 * @author Administrator
 *
 */
public class TestStringleton {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1==s2);
}
}
//只能创建Singleton的单个实例
class Singleton{
	//1、私有化构造器,类的外部不能调用构造器
	private Singleton() {
		
	}
	//2、类的内部创建一个类的实例
	private static Singleton instance=new Singleton();
	//3、私有化此对象，通过公共方法来调用
	//4、此公共的方法，只能通过类来调用，因此设置成static，同事类的实例也必须为static声明的
	public static Singleton getInstance() {
		return instance;
	}
}
