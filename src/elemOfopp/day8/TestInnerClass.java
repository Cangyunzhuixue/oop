package elemOfopp.day8;
/*
 * 类的第五个成员，内部类，在类的内部定义的类
 * 分类：成员内部类（类的内部和方法的外边）vs局部内部类（方法的内部）
 * 成员内部类：有修饰符；static final abstract
 *    特点：可以定义属性,方法，构造器
 * 局部内部类
 * 掌握三点：1、如何创建成员内部类的对象(如创建Bird和Dog)；
 *        2、如何区分调用外部类的、内部类的属性(尤其是重名时)
 *        3、局部内部类的基本使用
 */
public class TestInnerClass {
public static void main(String[] args) {
	Person.Dog dog=new Person.Dog();//创建静态的方式
	Person person=new Person();
	Person.Bird b=person.new Bird();
	b.setName("hao");
}
}

class Person{
	String name="samuro";
	int age;
        class Bird{
		String name="xue";
		int id;
		public Bird(){
			
		}
		public void setName(String name) {
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
		public void info() {
			show();
		}
	}
	
	static class Dog{
		
	}
	
	
	public void show() {
		
	}
	public void name2() {
		class A{
			
		}
	}
}