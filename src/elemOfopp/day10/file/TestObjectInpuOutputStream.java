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
	// 对象序列化过程，将内存的对象通过ObjectOutputStream转换成二进制流，存储在硬盘文件中
	
	@Test
	public void testObjectOutOutStream() {
		Person p1 = new Person("samuro", 24,new Pet("喵"));
		Person p2 = new Person("xueli", 22,new Pet("咪咪"));
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
	//对象的反序列化过程：将内存中对象同城ObjectInputStream转换成相应对象
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
 * 要实现序列化的类
 * 1、是可序列化的：实现Serializable接口
 * 2、类的属性同样实现Serializable接口
 * 3、提供一个版本号
 * 4、使用static和transient修饰的属性不可序列化
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
	