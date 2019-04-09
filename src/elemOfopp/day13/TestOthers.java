package elemOfopp.day13;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class TestOthers {
	// 1����ȡ����
	@Test
	public void test() {
		Class clazz1 = Person.class;
		Class superClass = clazz1.getSuperclass();
		System.out.println(superClass);

	}

	// 2����ȡ���ࣨ�����ͣ�
	@Test
	public void test1() {
		Class clazz1 = Person.class;
		Type superClass = clazz1.getGenericSuperclass();
		System.out.println(superClass);

	}

	// 3����ȡ����ķ���
	@Test
	public void test2() {
		Class clazz1 = Person.class;
		Type type = clazz1.getGenericSuperclass();
		ParameterizedType param = (ParameterizedType) type;
		Type[] type1 = param.getActualTypeArguments();
		System.out.println(((Class) type1[0]).getName());

	}

	// 4����ȡ�ӿ�
	@Test
	public void test3() {
		Class clazz1 = Person.class;
		Class[] interface1 = clazz1.getInterfaces();
		for (Class i : interface1) {
			System.out.println(i);

		}
	}

	// 5����ȡ���ڰ�
	@Test
	public void test4() {
		Class clazz = Person.class;
		Package package1 = clazz.getPackage();
		System.out.println(package1);
	}

	// 6����ȡע��
	@Test
	public void test5() {
		Class clazz = Person.class;
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation a : annotations) {
			System.out.println(a);
		}
	}

}
