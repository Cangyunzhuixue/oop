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
	//1���ڼ���û��ʹ�÷�������£��κ�Object������ӽ�ȥ��ǿת������쳣
	List list =new ArrayList();
	list.add(123);
	list.add(1323);
	list.add(1523);
	list.add("sa");
	for (int i = 0; i < list.size(); i++) {
		int sore=(Integer)list.get(i);//����
		System.out.println(sore);
	}
	
}
@Test
public void test2() {
	//1���ڼ���û��ʹ�÷�������£��κ�Object������ӽ�ȥ��ǿת������쳣
	List<Integer> list =new ArrayList<Integer>();
	list.add(123);
	list.add(1323);
	list.add(1523);
	for (int i = 0; i < list.size(); i++) {
		int sore=list.get(i);//����
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
 * ������̳й�ϵ
 * ����A����B�����࣬��ôLis<A>�Ͳ���List<B>���ӽӿ�
 */
public void test4() {
	Object object=null;
	String string="AA";
	object=string;
	
	
	List<Object> list=null;
	List<String> list1=new ArrayList<>();
	/*list =list1; ����
	 * ������������ָ��ͬһ��ַ
	 * ��list.add��123����
	 *String str=list1.get(0);
	 */
	
}
/*
 * ͨ��� ��
 * List<?>��һ��List<A>�ĸ���
 * ? extends A:���Դ��A��������
 * �� super A:���Դ��A���丸��
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
	//���Զ�ȡ����Ϊͨ����ļ�����Ķ���
	Iterator<?> iter=list1.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	//������������Ϊͨ����ļ�������д�����Ψһ������null
	/*list1.add(11);*/
	list1.add(null);
}
}
