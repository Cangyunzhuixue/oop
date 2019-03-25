package elemOfopp.day4;

/*
 * 子类对象实例化全过程
 * 
 */
public class TestSuper {
	public static void main(String[] args) {
		/*
		 * Dog dog=new Dog(); dog.setAge(10); dog.setName("ming");
		 * dog.setHostName("samuro"); System.out.println(dog.getName()+
		 * " "+dog.getAge()+" "+dog.getHostName());
		 */

		Dog dog2 = new Dog();
		System.out.println(4);
	}

}

class Creator {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Creator() {
		super();
		System.out.println("Creater");
	}

}

class Animal extends Creator {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		System.out.println("Animal");
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int id) {
		this(name);
		System.out.println("1");
	}

}

class Dog extends Animal {
	private String hostName;
	private int hostNum;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Dog() {
	
		super("name",1);
		System.out.println("Dog");
	}

}