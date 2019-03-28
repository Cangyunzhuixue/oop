package elemOfopp.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestGeneric {
@Test
public void test1() {
	//1、在集合没有使用泛型情况下，任何Object都能添加进去，强转会出现异常
	List list =new ArrayList();
	list.add(123);
	list.add(1323);
	list.add(1523);
	list.add("sa");
	for (int i = 0; i < list.size(); i++) {
		int sore=(Integer)list.get(i);//报错
		System.out.println(sore);
	}
	
}
@Test
public void test2() {
	//1、在集合没有使用泛型情况下，任何Object都能添加进去，强转会出现异常
	List<Integer> list =new ArrayList<Integer>();
	list.add(123);
	list.add(1323);
	list.add(1523);
	for (int i = 0; i < list.size(); i++) {
		int sore=list.get(i);//报错
		System.out.println(sore);
	}
	Iterator<Integer> it=list.iterator();
	
}
@Test
public void test3() {
	Map<String, Integer> map=new HashMap<>();
	map.put("AA",78);
	map.put("Ab",78);
	map.put("Ac",78);
	Set<Map.Entry<String, Integer>> set=map.entrySet();
	for(Map.Entry<String, Integer> o:set) {
		System.out.println(o.getKey()+" -"+o.getValue());
	}
}
@Test
/*
 * 泛型与继承关系
 * 若类A是类B的子类，那么Lis<A>就不是List<B>的子接口
 */
public void test4() {
	Object object=null;
	String string="AA";
	object=string;
	
	
	List<Object> list=null;
	List<String> list1=new ArrayList<>();
	/*list =list1; 错误
	 * 假设满足两者指向同一地址
	 * 则list.add（123）；
	 *String str=list1.get(0);
	 */
	
}
/*
 * 通配符 ？
 * List<?>是一切List<A>的父类
 * ? extends A:可以存放A及其子类
 * ？ super A:可以存放A及其父类
 */
@Test
public void test5() {
	List<?> list=null;
	List<Object> list2=null;
	List<String> list1=new ArrayList<>();
	list=list1;
	list=list2;
	System.out.println(list);
	show(list1);
	show2(list2);
}
public void show(List<?> list) {
	
}
public void show2(List<Object> list) {
	
}
@Test
public void test6() {
	List<String> list=new ArrayList<>();
	list.add("AA");
	list.add("BB");
	List<?> list1=list;
	//可以读取声明为通配符的集合类的对象
	Iterator<?> iter=list1.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	//不允许向声明为通配符的集合类中写入对象。唯一例外是null
	/*list1.add(11);*/
	list1.add(null);
}
}
