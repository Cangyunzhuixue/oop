package elemOfopp.day13;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;


public class TestField {
	// ��ȡ����ʱ����
	@Test
	public void test1() {
		// 1��getFields()ֻ�ܻ�ȡpublic������(��������)
		Class clazz = Person.class;
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName());
		}

		System.out.println("#######");
		// 2��getDeclaredFields()�������ԣ����������ࣩ
		Field[] fields2 = clazz.getDeclaredFields();
		for (Field f : fields2) {
			System.out.println(f.getName());
		}
	}
	//Ȩ�����η� ������ ����
	//��ȡ���Եĸ�����������
	@Test
	public void test2() {
		Class clazz = Person.class;	
		Field[] fields2 = clazz.getDeclaredFields();
		for (Field f : fields2) {
			//1��Ȩ�����η�
			int i=f.getModifiers();
			String str1=Modifier.toString(i);
			System.out.print(str1+" ");
			//2����������
			Class type=f.getType();
			System.out.print(type.getName()+" ");
			System.out.println(f.getName());
		}
	}
	//��������
	@Test
	public void test3() throws Exception {
		Class clazz = Person.class;	
		//1����ȡ����
		
		Field name=clazz.getDeclaredField("name");
		//2��������
		Person person=(Person)clazz.newInstance();
		System.out.println(person);
		//3��������ʱ�ำֵ
		name.setAccessible(true);//˽�еı�����Ҫ�ĳɿɷ���
		name.set(person, "samuro");
		System.out.println(person);
		System.out.println();
		Field age=clazz.getDeclaredField("age");
		age.setAccessible(true);
		age.set(age, 11);
		System.out.println(person);
	}
}
