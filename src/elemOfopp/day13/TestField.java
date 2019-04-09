package elemOfopp.day13;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;


public class TestField {
	// 获取运行时属性
	@Test
	public void test1() {
		// 1、getFields()只能获取public的属性(包括父类)
		Class clazz = Person.class;
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
		}

		System.out.println("#######");
		// 2、getDeclaredFields()所有属性（不包括父类）
		Field[] fields2 = clazz.getDeclaredFields();
		for (Field f : fields2) {
			System.out.println(f.getName());
		}
	}
	//权限修饰符 变量名 类型
	//获取属性的各个部分内容
	@Test
	public void test2() {
		Class clazz = Person.class;	
		Field[] fields2 = clazz.getDeclaredFields();
		for (Field f : fields2) {
			//1、权限修饰符
			int i=f.getModifiers();
			String str1=Modifier.toString(i);
			System.out.print(str1+" ");
			//2、变量类型
			Class type=f.getType();
			System.out.print(type.getName()+" ");
			System.out.println(f.getName());
		}
	}
	//调用属性
	@Test
	public void test3() throws Exception {
		Class clazz = Person.class;	
		//1、获取属性
		
		Field name=clazz.getDeclaredField("name");
		//2创建对象
		Person person=(Person)clazz.newInstance();
		System.out.println(person);
		//3、将运行时类赋值
		name.setAccessible(true);//私有的变量需要改成可访问
		name.set(person, "samuro");
		System.out.println(person);
		System.out.println();
		Field age=clazz.getDeclaredField("age");
		age.setAccessible(true);
		age.set(age, 11);
		System.out.println(person);
	}
}
