package elemOfopp.day9;
/*
 * 操作Collection和map工具類：Collections
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import java.util.List;

public class TestCollections {
@Test
public void TestCollections() {
	 int a[] = { 2, 3, 4, 5, 6 };  

	    for (int i = a.length - 1; i >= 0; i--)        

	        System.out.print(a[i] + "");
	int x=9,y=7;
	int max=(x<y)?y:x;//如果括號裡的正確，就把前一個賦值給max，否則反之
	System.out.println(max);
	String s = "good";

	 char[] ch = {'a','b','c'};

	 change(s,ch);

	System.out.println(s);

	 System.out.println(ch); 
	
}
public static void change(String str, char ch[]){   

    str = "test ok";

    ch[0] = 'g';       

} 
	@Test
	public void testCollections() {
		List list=new ArrayList();
		list.add(123);
		list.add(523);
		list.add(483);
		list.add(568);
		list.add(23);
		System.out.println(list);
		Collections.reverse(list);	
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.swap(list, 1, 3);
		System.out.println(list);
		int i=Collections.frequency(list, 123);
		System.out.println(i);
		//實現複製
		List list2=Arrays.asList(new Object[list.size()]); 
		Collections.copy(list2, list);
		List list3=Collections.synchronizedList(list);//轉成線程安全
	}
}
