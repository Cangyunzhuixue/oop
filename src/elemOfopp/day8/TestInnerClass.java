package elemOfopp.day8;
/*
 * ��ĵ������Ա���ڲ��࣬������ڲ��������
 * ���ࣺ��Ա�ڲ��ࣨ����ڲ��ͷ�������ߣ�vs�ֲ��ڲ��ࣨ�������ڲ���
 * ��Ա�ڲ��ࣺ�����η���static final abstract
 *    �ص㣺���Զ�������,������������
 * �ֲ��ڲ���
 * �������㣺1����δ�����Ա�ڲ���Ķ���(�紴��Bird��Dog)��
 *        2��������ֵ����ⲿ��ġ��ڲ��������(����������ʱ)
 *        3���ֲ��ڲ���Ļ���ʹ��
 */
public class TestInnerClass {
public static void main(String[] args) {
	Person.Dog dog=new Person.Dog();//������̬�ķ�ʽ
	Person person=new Person();
	Person.Bird b=person.new Bird();
	b.setName("hao");
}
}

class Person{
	String name="samuro";
	int age;
        class Bird{
		String name="xue";
		int id;
		public Bird(){
			
		}
		public void setName(String name) {
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
		public void info() {
			show();
		}
	}
	
	static class Dog{
		
	}
	
	
	public void show() {
		
	}
	public void name2() {
		class A{
			
		}
	}
}