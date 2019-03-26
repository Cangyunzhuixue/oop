package elemOfopp.day9.StudyOfSet;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;


public class TestIterator {
	@Test
	public void test4() {
		String[] strings=new String[] {
				"cc","xx","aa"
		};
		for(String s:strings) {
			System.out.println(s);
		}
}
	@Test
	public void test3() {
		Collection collection=new ArrayList();
		System.out.println(collection.size());//返回集合的个数
		collection.add(123);//添加一个元素
		collection.add("sasd");
		collection.add(new Date(0));
		collection.add("ss");
		collection.add(new Person(1,"samuro"));
		for(Object i:collection) {
			System.out.println(i);
		}
		Iterator iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
}
	@Test
public void test2() {
		Collection collection=new ArrayList();
		System.out.println(collection.size());//返回集合的个数
		collection.add(123);//添加一个元素
		collection.add("sasd");
		collection.add(new Date(0));
		collection.add("ss");
		collection.add(new Person(1,"samuro"));
		Iterator iterator=collection.iterator();
		//错误写法
		while((iterator.next())!=null) {
			System.out.println(iterator.next());
		}
}
	@Test
public void test1() {
		Collection collection=new ArrayList();
		System.out.println(collection.size());//返回集合的个数
		collection.add(123);//添加一个元素
		collection.add("sasd");
		collection.add(new Date(0));
		collection.add("ss");
		collection.add(new Person(1,"samuro"));
		Iterator iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
}
}
