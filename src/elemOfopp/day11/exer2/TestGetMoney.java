package elemOfopp.day11.exer2;

public class TestGetMoney {
	public static void main(String[] args) {
		Customer c1 = new Customer(new Account("a101", 10000), 1000);
		Customer c2 = c1;
				/*new Customer(new Account("a101", 10000), 1000);*/
		Thread tc1 = new Thread(c1);
		Thread tc2 = new Thread(c2);
		tc1.setName("´¢»§1£º");
		tc2.setName("´¢»§2 ");
		tc1.start();
		tc2.start();
	}

}
