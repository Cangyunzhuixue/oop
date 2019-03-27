package elemOfopp.day9.StudyOfSet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class TestList {
@Test
public void test1() {
	List list=new ArrayList();
	list.add(123);
	list.add("asd");
	list.add(789);
	list.add("sd");
	System.out.println(list);
	list.add(0, 40);
	System.out.println(list);
	System.out.println(list.get(1));
	
}
}
