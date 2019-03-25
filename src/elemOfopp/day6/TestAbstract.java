package elemOfopp.day6;
/*
 * abstract用户来修饰类，方法
 * 抽象类不可以实例化,有构造器（凡是类都有构造器）
 * abstract 不能修饰private final tataic
 * 
 * 
 * 秀是吧方法的时候，没有方法体，如：public abstract void eat();
 * 抽象方法只保留方法的功能，具体执行交给子类
 * 抽象方法的类一定是抽象类
 * 若子类继承了抽象类，并重写了所有的抽象方法，则此类是“实体类”，即可以实例化
 * 若子类继承了抽象类，但没有重写了所有的抽象方法，说明此类中仍然有抽象方法，此类为抽象类
 * ******注意是重写所有(包括父类的父类)
 */
public class TestAbstract {
public static void main(String[] args) {
	Student  p1=new Student();
	p1.eat();
	p1.getName();
}
}
abstract class Creator{
	abstract void breath();
}
	
abstract class Person extends Creator{
	String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void eat();

	public abstract void walk();
}

 class Student extends Person {
	public void breath() {
		
	}
	public void eat() {

	}

	public void walk() {

	}
}