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
	//存储的元是无序的，不可重复的
	//无序性！=随机性，指的是元素在底层的存储位置时无序的
	//当想Set中添加进相同的元素时，后面的不能添加进去
	//添加进set中的类，一定要重写equals（）和hashCode();
	
	//Set 中的元素使用哈希算法进行存储
	//当向Set中添加对象时，首先调用所在类的hashCode（），计算此对象的哈希值，此
	//哈希值决定对象哎Set中的存储位置，若该位置没有对象存储，则此对象直接存储到该位置。
	//如此有对象，再通过equals（0比较，如果相同，就不能添加了
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
//LinkedHashSet:使用链表维护了一个添加进集合中的顺序。导致我们便利LinkedHashSet时
//是按照添加顺序遍历
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
 * 1、元素必须是同一个类
 * 2、可以按照添加进集合中的元素的顺序遍历。像String，包装类等默认按照从小到大的顺序遍历
 * 3、当自定义类没有实现Comparable的接口时，要实现compareTo方法
 * 
 * 5、向Tree中添加元素时，首先要按照compareTO进行比较，一旦返回0，虽然
 * 两对象此属性相同，但程序会认为这两个对象相同
 */
public void test3() {//自然排序
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
//定制排序
@Test
public void test4() {
	/*
	 * 1、创建一个Comparator（区别于CompareTo）接口的类对象
	 */
	Comparator comparator=new Comparator() {
		/*
		 * 向TreeSet中添加Customer类的对象，再次compare（）方法中
		 * 指明是按照cunstomer的哪个属性来排序的
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
		//2、将此对象作为形参传递给TreeSet构造器中	
	};
	TreeSet set=new TreeSet(comparator);
	//3、向TreeSet中添加COmparator接口中的compare方法中涉及的类对象
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
