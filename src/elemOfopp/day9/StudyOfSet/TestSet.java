package elemOfopp.day9.StudyOfSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestSet {
@Test
public void testHashSet() {
	//�洢��Ԫ������ģ������ظ���
	//�����ԣ�=����ԣ�ָ����Ԫ���ڵײ�Ĵ洢λ��ʱ�����
	//����Set����ӽ���ͬ��Ԫ��ʱ������Ĳ�����ӽ�ȥ
	//��ӽ�set�е��࣬һ��Ҫ��дequals������hashCode();
	
	//Set �е�Ԫ��ʹ�ù�ϣ�㷨���д洢
	//����Set����Ӷ���ʱ�����ȵ����������hashCode����������˶���Ĺ�ϣֵ����
	//��ϣֵ��������Set�еĴ洢λ�ã�����λ��û�ж���洢����˶���ֱ�Ӵ洢����λ�á�
	//����ж�����ͨ��equals��0�Ƚϣ������ͬ���Ͳ��������
	Set set=new HashSet();
	set.add(123);
	set.add(456);
	set.add("AA");
	set.add("AA");
	set.add(null);
	System.out.println(set);
	Iterator iterator=set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
@Test
//LinkedHashSet:ʹ������ά����һ����ӽ������е�˳�򡣵������Ǳ���LinkedHashSetʱ
//�ǰ������˳�����
public void test2() {
	Set set=new LinkedHashSet();
	set.add(123);
	set.add(456);
	set.add("AA");
	set.add("AA");
	set.add(null);
	
	Iterator iterator=set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
@Test
//TreeSet:
/*
 * 1��Ԫ�ر�����ͬһ����
 * 2�����԰�����ӽ������е�Ԫ�ص�˳���������String����װ���Ĭ�ϰ��մ�С�����˳�����
 * 3�����Զ�����û��ʵ��Comparable�Ľӿ�ʱ��Ҫʵ��compareTo����
 * 
 * 5����Tree�����Ԫ��ʱ������Ҫ����compareTO���бȽϣ�һ������0����Ȼ
 * �������������ͬ�����������Ϊ������������ͬ
 */
public void test3() {//��Ȼ����
	Set set=new TreeSet();
	/*set.add(123);
	set.add(456);
	set.add(113);
	set.add(458);*/
    set.add(new Person(11,"samuro11"));
    set.add(new Person(12,"samuro1"));
    set.add(new Person(13,"samuro3"));
    set.add(new Person(14,"samuro4"));
    set.add(new Person(14,"samuro5"));
	for(Object str:set) {
		System.out.println(str);
	}
	/*set.add("AA");
	set.add("AA");
	set.add(null);*/
}
//��������
@Test
public void test4() {
	/*
	 * 1������һ��Comparator��������CompareTo���ӿڵ������
	 */
	Comparator comparator=new Comparator() {
		/*
		 * ��TreeSet�����Customer��Ķ����ٴ�compare����������
		 * ָ���ǰ���cunstomer���ĸ������������
		 * 
		 */
		@Override
		public int compare(Object o1, Object o2) {
			
			if(o1 instanceof Customer&&o2 instanceof Customer) {
				Customer customer1=(Customer)o1;
				Customer customer2=(Customer)o2;
				int i= customer1.getId().compareTo(customer2.getId());
				if(i==0) {
					return customer1.getName().compareTo(customer2.getName());
				}else {
					return i;
				}
			}
			return 0;
		}
		//2�����˶�����Ϊ�βδ��ݸ�TreeSet��������	
	};
	TreeSet set=new TreeSet(comparator);
	//3����TreeSet�����COmparator�ӿ��е�compare�������漰�������
	set.add(new Customer("AA",1001));
	set.add(new Customer("BB",1006));
	set.add(new Customer("CC",1003));
	set.add(new Customer("dd",1004));
	set.add(new Customer("EE",1005));
	for(Object o:set) {
	System.out.println(o);	
	}
}
}
