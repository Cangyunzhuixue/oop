package elemOfopp.day9.StudyOfSet;
/*
 * 1������������Կ�������ͼ���
 * 2������洢��Student[] stu=new Student[20];stu[0]=new Student();
 *   �׶ˣ�һ���������ɸ��ģ���ʵ��ŵ�����Ķ����������֪
 * 3��
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
		System.out.println(collection.size());//���ؼ��ϵĸ���
		collection.add(123);//���һ��Ԫ��
		collection.add("sasd");
		collection.add(new Date(0));
		collection.add("ss");
		collection.add(new Person(1,"samuro"));
		//�ж�contains(Object o):�жϼ������Ƿ����ָ����objԪ��
		//�жϵ������ǣ�����Ԫ���������equal�ǣ������������ж�
		//��ȷ��������뼯���е�Ԫ��ʦ�Զ�����Ķ���Ҫ����дequal�ǣ�������
		boolean b1=collection.contains(123);
		System.out.println(b1);
		System.out.println(collection);
		//containsAll�������ж��Ƿ��������Ԫ��
		Collection collection1=new ArrayList();
		collection1.add(123);//���һ��Ԫ��
		collection1.add("sasd");
		collection1.add(new Date(0));
		collection1.add("ss");
		collection1.add(new Person(1,"samuro"));
		System.out.println(collection.containsAll(collection1));
	    //retainAll()��ǰ���Ϻ�һ�������Ϲ��е�Ԫ�أ����ظ���ǰ����
		collection.retainAll(collection1);
		System.out.println(collection);
		//remove����ɾ��Ԫ�أ�����boolean
		System.out.println(collection.remove(123));
		//removeAll():ɾ�����е�Ԫ��
		collection1.removeAll(collection);
		System.out.println(collection1);
		//equals�����ж����������е�Ԫ���Ƿ���ȫ��ͬ
		//hashCode���������ϣֵ
		//toArray():������ת������
		Object o=collection1.toArray();
		//iterator():����һ��Iterator�ӿ�ʵ�ֵ���Ķ���,����ʵ�ּ��ϵı���,����forѭ��
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
	System.out.println(collection.size());//���ؼ��ϵĸ���
	collection.add(123);//���һ��Ԫ��
	collection.add("sasd");
	collection.add(new Date(0));
	collection.add("ss");
	System.out.println(collection.size());
	Collection collection2=Arrays.asList(1,2,3);//������ת����list
	collection.addAll(collection2);//���βε�����Ԫ����ӵ�������
	System.out.println(collection.size());
	System.out.println(collection.isEmpty());
	//�鿴����Ԫ��
	System.out.println(collection);
	collection.clear();//�������Ԫ��
	System.out.println(collection.isEmpty());
	
}
}
