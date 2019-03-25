package elemOfopp.day7;



/*
 * 接口 （interface）是与类并行的一个概念
 * 1、可以看做一个特殊的抽象类，是常量与抽象方法的一个集合
 * 2、借口没有构造器
 * 3、接口定义的就是一种功能。此功能可以被类实现（implements）
 * ps:class CC extends DD implement AA
 * 4、实现接口的类，必须重写所有的抽象方法，方可实例化，若没有全部实现，则此类仍为一个抽象类
 * 5、类可以实现多个接口---java中的继承是单继承的
 * 6、接口和接口之间也是继承关系,而且可以实现多继承
 * 
 */
public class TestInterfance {
	public static void main(String[] args) {
		Duck duck=new Duck();
		TestInterfance.test1(duck);
		TestInterfance.test2(duck);
		TestInterfance.test3(duck);
	}
public static void test1(Runner r) {//Runner r=new Duck();
	r.run();//无法实例化，但是可以调用方法
}
public static void test2(Swimmer s) {
	s.swim();//虚拟方法调用
	
}
public static void test3(Flier f) {
	f.fly();
}
}
interface Runner{
	public abstract void run();
}


interface Swimmer{
	public abstract void swim();
}


interface Flier{
	public abstract void fly();
}
class Duck implements Runner,Swimmer,Flier{
	@Override
	public void fly() {
		
	}
	@Override
	public void swim() {
		
	}
	@Override
	public void run() {
		
	}
}
















interface AA{
	//常量:所有的常量都是用public static final修饰
	public static final int I=12;
	//抽象方法 所有的都用public abstract修饰
	void  method1();
	
}
abstract class BB implements AA{
	
}
class CC implements AA{
	public void method1() {
		
	}
}
class DD extends CC implements AA{
	public void method1() {
		
	}
}
interface MM extends AA{
	void method2();
}





