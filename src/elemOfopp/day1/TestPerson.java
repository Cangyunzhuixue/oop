package elemOfopp.day1;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "xiao";
		person.age = 12;
		person.showAge();
		person.study();
		person.addAge();
		person.showAge();
		Person person2=new Person();
		person2.age = 19;
		person2.showAge();
		person2.study();
		person2.addAge();
		person2.showAge();
	}

}

class Person {
	String name;// 成員變量有修飾符，有初始值

	int age;
	boolean sex;

	// 方法
	public void study() {
		System.out.println("studying");
	}

	public void showAge() {
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	public void addAge() {
		int i = 2;// 局部變量沒有修飾符，與所在方法的相同，舞初始值
		age += i;
	}
}