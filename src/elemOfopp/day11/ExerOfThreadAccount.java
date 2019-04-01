package elemOfopp.day11;



public class ExerOfThreadAccount {
public static void main(String[] args) {
	Account account =new Account();
	Customer cus1=new Customer("s", account);
	Customer cus2=new Customer("s", account);
	Thread tcs1=new Thread(cus1);
	Thread tcs2=new Thread(cus2);
	tcs1.setName("´¢»§1");
	tcs2.setName("´¢»§2");
	tcs1.start();
	tcs2.start();
}
}



class Account {
	double balance;
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public Account() {
		
	}

	public synchronized void deposit(double amount) {
		this.balance += amount;
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" " +balance);
	}
}

class Customer implements Runnable{
	String name;
	Account account;
	
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
			for (int i = 0; i < 3; i++) {
				account.deposit(1000);	
		}
	}
}

