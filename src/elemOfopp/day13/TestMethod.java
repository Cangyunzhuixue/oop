package elemOfopp.day13;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class TestMethod {
	@Test
	public void test1() {
		// 同属性操作
		Class clazz1 = Person.class;
		Method[] method = clazz1.getMethods();
		for (Method m : method) {
			System.out.println(m);
		}
		System.out.println();
		Method[] method2 = clazz1.getDeclaredMethods();
		for (Method m : method2) {
			System.out.println(m);
		}
	}
	// 注解 权限修饰符 返回值类型 方法名 形参列表 异常
	@Test
	public void test2() {
		Class clazz1 = Person.class;
		Method[] method2 = clazz1.getDeclaredMethods();
		for (Method m : method2) {
			// 1、注解
			Annotation[] ann = m.getAnnotations();
			for (Annotation a : ann) {
				System.out.println(a);
			}
			// 2、权限修饰符
			String str1 = Modifier.toString(m.getModifiers());
			System.out.print(str1 + " ");
			// 3、返回值类型
			Class returnType = m.getReturnType();
			System.out.print(returnType + " ");
			// 4、方法名
			System.out.print(m.getName() + " ");
			// 5、形参列表
			System.out.print("(");
			Class[] params = m.getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				System.out.print(params[i].getName() + "args-" + i + " ");
			}
			System.out.println(")");
			// 6、异常
			Class[] exps = m.getExceptionTypes();
			for (int i = 0; i < exps.length; i++) {
				System.out.println(exps[i].getName());
			}
			System.out.println();
		}
	}
	// 调用方法
	@Test
	public void test3() throws Exception {
		Class clazz=Person.class;
		Method method=clazz.getDeclaredMethod("show");
		Person person=(Person)clazz.newInstance();
		Object returnVal=method.invoke(person);//已调用
		System.out.println(returnVal);//null
		Method method2=clazz.getMethod("setName", String.class);
		Object returnVal1=method2.invoke(person,"samuro");
		System.out.println(returnVal1);
		//调用静态方法
		Method method3=clazz.getDeclaredMethod("info");
		method3.invoke(Person.class);
		Method method4=clazz.getDeclaredMethod("getName");
		String name=(String) method4.invoke(person);
		System.out.println(name);
	}
}
