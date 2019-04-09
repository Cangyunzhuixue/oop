package elemOfopp.day13;

import java.lang.reflect.Constructor;

import org.junit.Test;


public class TestCOnstructor {
@Test
//其他的类似方法
public void test() throws Exception {
	String string = "elemOfopp.day13.Person";
	Class class3 = Class.forName(string);
	Constructor[] cons=class3.getDeclaredConstructors();
	for(Constructor c:cons) {
		System.out.println(c.getName());
		
	}
}
@Test
public void test1() throws Exception {
	String string = "elemOfopp.day13.Person";
	Class class3 = Class.forName(string);
	Constructor cons=class3.getDeclaredConstructor(int.class,String.class);
	cons.setAccessible(true);
	Person person=(Person)cons.newInstance("xiao",11);
	System.out.println(person);
}
}
