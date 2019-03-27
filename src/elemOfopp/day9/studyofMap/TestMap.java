package elemOfopp.day9.studyofMap;
/*
 * 1��hashMap key����Set��ţ��������}��value��Collection��ţ������}
 * һ��key-value��һ��Entry�����е�Rntry����Set��ŵģ��������}
 * 2��HashMap�����Ԫ�ؕr�����{��Key���ڵ�equals�������Д��ɂ�key�Ƿ���ͬ������ͬ��
 * �tֻ����Ӻ���ӵ��ǂ�Ԫ��
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Map�ӿ�
 *     |----HashMap��MapץӴ����ʵ����
 *     |----LinkedHashMap������ʱ�������˳�����
 *     |----TreeMap:������ӽ�Mapֵ��Ԫ��key��ָ��Ԫ�ؽ�������Ҫ��key������ͬһ����Ķ���
 *           ��� key����Ȼ����
 *     |----HashTable �����ϣ������hʹ��
 *          |----Properties:���Á�̎������ļ�������ֵ����String
 * 
 */

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class TestMap {
	@Test
	public void pub() {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("AA", 33);
		map.put("BB", 323);
		map.put("CC", 313);
		map.put("DD", 333);
		map.put("AA", 335);
		map.put(123, "kk");
		map.put(new Person(11, "zhao"), 55);
		map.put(new Person(11, "zhao"), 20);
		System.out.println(map.size());
		System.out.println(map);

	}

	@Test
	public void test() {
		Map map = new HashMap();
		map.put("AA", 33);
		map.put("BB", 323);
		map.put("CC", 313);
		map.put("DD", 333);
		map.put(123, "kk");
		map.put(new Person(11, "zhao"), 55);
		// 1������keyֵ
		Set set = map.keySet();
		for (Object o : set) {
			System.out.println(o);
		}
		// 2������Value
		Collection collection = map.values();
		Iterator i = collection.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// ������ֵ��
		// ��ʽһ��
		Set set1 = map.keySet();
		for (Object o : set1) {
			System.out.println(o + "-" + map.get(o));
		}
		// ��ʽ����
		Set set2 = map.keySet();
		for (Object o : set2) {
			Map.Entry entry = (Map.Entry) o;
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	@Test
	public void test2() {
		Map map = new LinkedHashMap();
		map.put("AA", 33);
		map.put("BB", 323);
		map.put("CC", 313);
		map.put("DD", 333);
		map.put(123, "kk");
		map.put(new Person(11, "zhao"), 55);
		Set set1 = map.keySet();
		for (Object o : set1) {
			System.out.println(o + "-" + map.get(o));
		}
	}

	@Test // ��Ȼ����
	public void test3() {
		Map map = new TreeMap();
		map.put(new Person(12, "samureo"), 11);
		map.put(new Person(2, "zhoaxueli"), 12);
		map.put(new Person(23, "taotao"), 113);
		map.put(new Person(22, "wenwen"), 1124);
		map.put(new Person(22, "yingeno"), 114);
		Set set = map.keySet();
		for (Object o : set) {
			System.out.println(o + " " + map.get(o));
		}

	}

	// ��������
	@Test
	public void test4() {
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof Person && o2 instanceof Person) {
					Person person1 = (Person) o1;
					Person person2 = (Person) o2;
					int i = person1.name.compareTo(person2.name);
					if (i == 0) {
						return person1.getAge().compareTo(person2.getAge());
					} else {
						return i;
					}
				}
				return 0;
			}
		};
		TreeMap map = new TreeMap(comparator);
		map.put(new Person(12, "samureo"), 11);
		map.put(new Person(2, "zhoaxueli"), 12);
		map.put(new Person(23, "taotao"), 113);
		map.put(new Person(22, "wenwen"), 1124);
		map.put(new Person(22, "yingeno"), 114);
		Set set = map.keySet();
		for (Object o : set) {
			System.out.println(o + " " + map.get(o));
		}

	}

	/*@Test
	public void test5() throws FileNotFoundException,IOException{
		Properties properties=new Properties();
		properties.load(new FileInputStream(new File("jdbc.properties")));

	}*/
}
