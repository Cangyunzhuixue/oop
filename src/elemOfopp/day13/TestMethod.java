package elemOfopp.day13;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class TestMethod {
	@Test
	public void test1() {
		// ͬ���Բ���
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
	// ע�� Ȩ�����η� ����ֵ���� ������ �β��б� �쳣
	@Test
	public void test2() {
		Class clazz1 = Person.class;
		Method[] method2 = clazz1.getDeclaredMethods();
		for (Method m : method2) {
			// 1��ע��
			Annotation[] ann = m.getAnnotations();
			for (Annotation a : ann) {
				System.out.println(a);
			}
			// 2��Ȩ�����η�
			String str1 = Modifier.toString(m.getModifiers());
			System.out.print(str1 + " ");
			// 3������ֵ����
			Class returnType = m.getReturnType();
			System.out.print(returnType + " ");
			// 4��������
			System.out.print(m.getName() + " ");
			// 5���β��б�
			System.out.print("(");
			Class[] params = m.getParameterTypes();
			for (int i = 0; i < params.length; i++) {
				System.out.print(params[i].getName() + "args-" + i + " ");
			}
			System.out.println(")");
			// 6���쳣
			Class[] exps = m.getExceptionTypes();
			for (int i = 0; i < exps.length; i++) {
				System.out.println(exps[i].getName());
			}
			System.out.println();
		}
	}
	// ���÷���
	@Test
	public void test3() throws Exception {
		Class clazz=Person.class;
		Method method=clazz.getDeclaredMethod("show");
		Person person=(Person)clazz.newInstance();
		Object returnVal=method.invoke(person);//�ѵ���
		System.out.println(returnVal);//null
		Method method2=clazz.getMethod("setName", String.class);
		Object returnVal1=method2.invoke(person,"samuro");
		System.out.println(returnVal1);
		//���þ�̬����
		Method method3=clazz.getDeclaredMethod("info");
		method3.invoke(Person.class);
		Method method4=clazz.getDeclaredMethod("getName");
		String name=(String) method4.invoke(person);
		System.out.println(name);
	}
}
