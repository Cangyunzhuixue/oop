package elemOfopp.day4;
/*
 * 多态性
 * 1、指的是：一个事物的多种表现形态
 *  1）重载和重写 2）子类对象的多态性
 * 2、子类对象的多态性使用前前：1）要有累的继承 2）要有子类对父类方法的重写
 * 3、程序氛围编译状态和运行状态
 *   对于多太性来说，编译时看左边，将次引用变量理解是父类的类型
 *   运行时看右边，关注于真正的对象实体：子类的对象，那么执行的子类的重写
 * 4、子类对象的属性不属于多态性的,属性属于生声明类型
 * 
 */
public class ImportentTestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.eat();
		
		Man man=new Man();
		man.eat();
		
		//子类对象的多态性：父类的引用指向子类对象
		Person person2=new Man();
		/*
		 * 虚拟方法调用：有了多态以后，通过父类的引用指向子类的对象实体，当调用方法是，
		 * 实际执行的事子类重写父类的方法 
		 */
		person2.eat();
		Person person3=new Women();//向上转型
		System.out.println("%"+person3.id);
		person3.eat();
		Women women=(Women)person3;//向下转型
		System.out.println(women.id+"*");
		women.makeLove();
		women.eat();
		/*
		 * women不能转换man ，会出现强制转换错误
		 * 可判断：instanceof
		 * 格式：对象a instanceof 类A ：判断对象a是否是类A的一个实例，是的话
		 * 返回true，否则返回false
		 * 若a是A的实例，那么a也一定是A类的父类的实例
		 * 
		 */
		if (person instanceof Women) {
			Women man1=(Women)person;
			man1.makeLove();
		}
		


	}

}
