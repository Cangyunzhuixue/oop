package elemOfopp.day10.exerOfGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class DAO<T> {
	Map<String, T> map=new HashMap<>();

	public void save(String id, T entry) {
		map.put(id, entry);

	}

	T get(String id) {
		return this.map.get(id);
	}

	void update(String id, T entry) {
		map.replace(id, entry);
	}

	List<T> list() {
		List<T> list = new ArrayList<>();
		for(String l:map.keySet()) {
			list.add(map.get(l));
		}
		return list;
	}

	void delete(String id) {
		map.remove(id);
	}

	public DAO(Map<String, T> map) {
		super();
		this.map = map;
	}

	public DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DAO [map=" + map+ "]";
	}

	@Test
	public void test() {
		DAO<User> dao=new DAO<>();
		dao.save("a", new User(1001,23,"samuro"));
		dao.save("b", new User(1002,24,"zhao"));
		dao.save("c", new User(1003,25,"lin"));
		dao.save("d", new User(1004,27,"zeng"));
		System.out.println(dao.get("c"));
		System.out.println(dao.list());
		dao.update("a", new User(1009,293,"cangyun"));
		System.out.println(dao.list());
		dao.delete("d");
		System.out.println(dao.list());

	}
	
	
}
