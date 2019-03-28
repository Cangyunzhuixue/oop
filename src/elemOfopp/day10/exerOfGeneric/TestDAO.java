package elemOfopp.day10.exerOfGeneric;

public class TestDAO {
	public static void main(String[] args) {
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
