package elemOfopp.day13;

/*
 * public 修饰的成员可以在任何范围内直接访问，只是一种最宽松的访问控制等级。
 * 需要注意的，所谓的直接访问仍需要先创建或获得一个相应类的对象然后才可以使用”对象名.
 * 成员“的方式访问其属性或调用其方法，但是出于信息封装和隐藏的需要一般不提倡把成员声明为public的，
 * 而构造方法和需要外界直接调用的普通方法则适合声明为public.
 *protected 修饰的成员可以在其所在类中、同一包中及子类中（无论子类在不在同一个包）被直接访问，
 *但不能在位于不同包中的非子类中被直接访问，这里需要特别声明：
 *在位于不同包的子类中必须是子类的对象才能直接访问其父类的protected成员，
 *而父类自身的对象反而不能访问其所在类中声明的protected成员\
 *缺省 :访问修饰符的成员只能在其所在类中或包中直接访问，在不同包中即使是不同包的子类也不能直接访问。
 *private成员只能在所在类中被直接访问，是4种访问等级最高的一个。
 */
@MyAnnotation(value = "person")
public class Person extends Creature<String> implements Comparable, MyInterface {
	private int age;
	protected String name;
	int id = 1001;
	public int testNUm;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@MyAnnotation(value = "zhujie")
	public void setName(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public Person() {// 默认定义的，一旦显示定义构造器，显示的构造器不在提供，构造器重载
		age = 18;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void show() {
		System.out.println("xiao");
	}

	class Bird {

	}
	public static void info() {
		System.out.println("ren");
	}
}
