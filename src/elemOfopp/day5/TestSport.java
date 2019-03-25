package elemOfopp.day5;
/*
 * static 静态的，可以用来修饰属性，方法，代码块（初始化块）、内部类
 * static修饰属性（类变量）：
 * 1、由类创建的所有对象，都共用一个属性
 * 2、当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用
 * vs实例变量（非static修饰的属性，搜有一条自己属性的副本）
 * 3、类变量随着类的加载而加载的，而且独一份
 * 4、静态变量可以有类来调用：SportMan.nation
 * 5、类变量的加载要早于对象（类变量是随着对象的创建而被加载的），
 * 有对象之后可以通过“对象.类变量”，但是“类·实例变量”不行的的
 * 6、类变量存在于静态域中，被所有对象所共用
 * 
 * >静态的方法内是不可以有this和supper的
 * static修饰方法（类方法）：
 * 1、随着类的加载而加载，在内存中也是独一份
 * 2、可以直接通过“类·类方法”调用
 * 3、在静态方法内部，可以调用静态属性和静态方法，不能调用非静态的属性和方法;
 * 反之，在非静态方法里边是可以调用静态的属性和方法的
 * 
 * 注：静态的结构（static的属性、方法，飞马快、内部类）的生命周期要早于非静态及结构
 * 同时也回收比非静态的晚
 */
public class TestSport {;

	public static void main(String[] args) {
		SportMan s1=new  SportMan("Samuro", 24);
		SportMan s2=new SportMan("Zhandi", 15);
		s1.name="haoren";
		s1.nation="China";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(SportMan.nation);
		s1.show1();
		SportMan.show2();
		s1.show2();
	}

}
class SportMan{
	String name; 
	int age;
	static String nation;
	public SportMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.nation="zg";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SportMan [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	public void show1() {
		
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub
	}
	public static void show2() {
		System.out.println(nation);
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub
	}
	private static void publ() {
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub

	}
}
