package elemOfopp.day11.exer2;

public class Customer implements Runnable{
private Account acccount;
private double amount;
int count=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			synchronized (Customer.class) {
				System.out.println(Thread.currentThread().getName() + "��ʼȡǮ");
				if (acccount.getBalance() >= amount) {
					System.out.println(Thread.currentThread().getName() + "�ɹ�ȡ� " + amount);
					acccount.setBalance(acccount.getBalance() - amount);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(" ���Ϊ��" + acccount.getBalance());
				} else {
					System.out.println("����");
				}
				count--;
			
		}
		
	}
	public Customer(Account acccount, double amount) {
		super();
		this.acccount = acccount;
		this.amount = amount;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
