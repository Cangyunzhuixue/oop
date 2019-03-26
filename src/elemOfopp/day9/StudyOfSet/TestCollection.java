package elemOfopp.day9.StudyOfSet;
/*
 * 1、春初对象可以考虑数组和集合
 * 2、数组存储：Student[] stu=new Student[20];stu[0]=new Student();
 *   弊端：一旦创建不可更改；真实存放的数组的对象个数不可知
 * 3、
 */

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;



public class TestCollection {
	@Test
	public void testCollection2() {
		Collection collection=new ArrayList();
		System.out.println(collection.size());//返回集合的个数
		collection.add(123);//添加一个元素
		collection.add("sasd");
		collection.add(new Date(0));
		collection.add("ss");
		collection.add(new Person(1,"samuro"));
		//判断contains(Object o):判断集合中是否包含指定的obj元素
		//判断的依据是：根据元素所在类的equal是（）方法进行判断
		//明确：如果存入集合中的元素师自定义类的对象，要求重写equal是（）方法
		boolean b1=collection.contains(123);
		System.out.println(b1);
		System.out.println(collection);
		//containsAll（）；判断是否包含所有元素
		Collection collection1=new ArrayList();
		collection1.add(123);//添加一个元素
		collection1.add("sasd");
		collection1.add(new Date(0));
		collection1.add("ss");
		collection1.add(new Person(1,"samuro"));
		System.out.println(collection.containsAll(collection1));
	    //retainAll()球当前集合和一其它集合共有的元素，返回给当前集合
		collection.retainAll(collection1);
		System.out.println(collection);
		//remove（）删除元素，返回boolean
		System.out.println(collection.remove(123));
		//removeAll():删除共有的元素
		collection1.removeAll(collection);
		System.out.println(collection1);
		//equals（）判断两个集合中的元素是否完全相同
		//hashCode（）：算哈希值
		//toArray():将集合转成数组
		Object o=collection1.toArray();
		//iterator():返回一个Iterator接口实现的类的对象,进而实现集合的遍历,不用for循环
		Iterator iterator=collection.iterator();
		System.out.println(iterator.next());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
@Test
public void testCollection1() {
	

	
	@SuppressWarnings("unchecked")
	Collection collection=new ArrayList();
	System.out.println(collection.size());//返回集合的个数
	collection.add(123);//添加一个元素
	collection.add("sasd");
	collection.add(new Date(0));
	collection.add("ss");
	System.out.println(collection.size());
	Collection collection2=Arrays.asList(1,2,3);//将数组转换成list
	collection.addAll(collection2);//将形参的所有元素添加到档期中
	System.out.println(collection.size());
	System.out.println(collection.isEmpty());
	//查看几何元素
	System.out.println(collection);
	collection.clear();//清空所有元素
	System.out.println(collection.isEmpty());
	
}
}
