package elemOfopp.day11.exer1;

public class Customer implements Runnable {
	Clerk clerk;

	public Customer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ฯ๛ทั");
		while (true) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clerk.consumePro();
		}
	}

}
