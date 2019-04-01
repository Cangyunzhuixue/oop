package elemOfopp.day11.exer1;

public class TestPro {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Productor p1 = new Productor(clerk);
		Productor p2 = new Productor(clerk);
		Customer c1 = new Customer(clerk);
		Customer c2 = new Customer(clerk);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		Thread t3=new Thread(p2);
		Thread t4=new Thread(c2);
		t1.setName("生产者1号");
		t3.setName("生产者2号");
		t2.setName("消费者2号");
		t4.setName("消费者2号");
		t1.start();
		t2.start();
		t4.start();
		/*t3.start();*/
	}
}
