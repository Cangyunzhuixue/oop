package elemOfopp.day13;


import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class TestReflection {
	@Test
	public void test() throws Exception {
		// 1
		Class class1 = Person.class;
		System.out.println(class1.getName());
		// 2
		Person person = new Person(1,"asd");
		
		
		Class class2 = person.getClass();
		System.out.println(class2.getName());
		// 3
		String string = "elemOfopp.day13.Person";
		Class class3 = Class.forName(string);
		System.out.println();
		// 4
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class class4 = classLoader.loadClass(string);
		Object object=class1.newInstance();
		Person person2=(Person)object;
		System.out.println(person2);

		//
		ClassLoader loader = this.getClass().getClassLoader();
		InputStream iStream = loader.getResourceAsStream("elemOfopp\\day13\\jdbc.properties");
		Properties properties = new Properties();
		properties.load(iStream);
		String name = properties.getProperty("username");
		System.out.println(name);
		String pwd = properties.getProperty("password");
		System.out.println(pwd);
	}
}
