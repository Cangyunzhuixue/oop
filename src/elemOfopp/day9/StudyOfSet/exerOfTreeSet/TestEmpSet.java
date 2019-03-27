package elemOfopp.day9.StudyOfSet.exerOfTreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestEmpSet {
	@Test
	public void testComparable() {
		Set trSet = new TreeSet();
		trSet.add(new Employee("samuro", 24, new MyDate(1995, 7, 28)));
		trSet.add(new Employee("zhaoxueli", 21, new MyDate(1997, 10, 8)));
		trSet.add(new Employee("taotao", 25, new MyDate(1994, 9, 16)));
		trSet.add(new Employee("wenwen", 22, new MyDate(1996, 5, 128)));
		trSet.add(new Employee("samuro", 24, new MyDate(1991, 8, 28)));
		for (Object o : trSet) {
			System.out.println(o);
		}
	}

	@Test
	public void testComparator() {
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee employee1 = (Employee) o1;
					Employee employee2 = (Employee) o2;
					int i = employee1.getName().compareTo(employee2.getName());
					if (i == 0) {
						int j = employee1.getAge().compareTo(employee2.getAge());
						if (j == 0) {
							return employee1.getBirthday().compareTo(employee2.getBirthday());
						} else {
							return j;
						}
					} else {
						return i;

					}
				}
				return 0;
			}
		};
		TreeSet seTree = new TreeSet(comparator);
		seTree.add(new Employee("samuro", 24, new MyDate(1995, 7, 28)));
		seTree.add(new Employee("zhaoxueli", 21, new MyDate(1997, 10, 8)));
		seTree.add(new Employee("taotao", 25, new MyDate(1994, 9, 16)));
		seTree.add(new Employee("wenwen", 22, new MyDate(1996, 5, 128)));
		seTree.add(new Employee("samuro", 24, new MyDate(1991, 8, 28)));
		for (Object o : seTree) {
			System.out.println(o);
		}

	}
}
