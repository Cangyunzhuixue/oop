package elemOfopp.day6;
/*
 * final最终的
 * ，修饰类、属性、方法
 * 修饰类的时候，这个类不能被继承：String 、StringBuffer、System
 * 修饰方法：不能被重写:
 * 修饰属性：1）此属性就是一个常量，不可再被赋值，
 * 2）常量用大写字符表示
 * 3）此常量不能使用默认初始化
 * 4）可以显地赋值、代码块、构造器
 * 
 * 变量用static final修饰：全局常量（可以被类来调用）
 */
public class TestFinal {

}
final class A{
	
}
class C{
	public void name() {
		System.out.println("uu");
	}
}
class D extends C{
	public void name(){
		
	}
}
class E{
	final int I=1;
	public void m1() {
		System.out.println(I);
	}
}