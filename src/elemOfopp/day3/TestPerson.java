package elemOfopp.day3;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		/*
		 * 类对象属性的复制先后顺序：
		 * 1、属性的默认初始化
		 * 2、属性的显式赋值
		 * 3、构造器赋值
		 * 4、通过对象的方法赋值
		 */

		System.out.println(person.getAge()+" "+person.getName());

	}

}
