package elemOfopp.day10.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class TestObjectInpuOutputStream {
	// �������л����̣����ڴ�Ķ���ͨ��ObjectOutputStreamת���ɶ����������洢��Ӳ���ļ���
	
	@Test
	public void testObjectOutOutStream() {
		Person p1 = new Person("samuro", 24,new Pet("��"));
		Person p2 = new Person("xueli", 22,new Pet("����"));
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
			oos.writeObject(p1);
			oos.flush();
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					;
				}
			}
		}
	}
	//����ķ����л����̣����ڴ��ж���ͬ��ObjectInputStreamת������Ӧ����
	@Test
	public void testObjectIOutStream() {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("person.txt"));
			Person p1=(Person)ois.readObject();
			System.out.println(p1);
			Person p2=(Person)ois.readObject();
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if (ois!=null) {
				try {
					ois.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
/*
 * Ҫʵ�����л�����
 * 1���ǿ����л��ģ�ʵ��Serializable�ӿ�
 * 2���������ͬ��ʵ��Serializable�ӿ�
 * 3���ṩһ���汾��
 * 4��ʹ��static��transient���ε����Բ������л�
 */
class Person implements Serializable {
	
	private static final long serialVersionUID = 6951594272020361077L;
	
	
	String name;
	Integer age;
	Pet pet;
	
	public Person(String name, Integer age, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}	
}
class Pet implements Serializable{
	
	private static final long serialVersionUID = 3655698520479712446L;
	String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
	
}
	