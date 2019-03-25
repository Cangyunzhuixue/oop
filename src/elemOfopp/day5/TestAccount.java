package elemOfopp.day5;
/*
 * 使用静态的变量可以实现一个累加的效果
 */
public class TestAccount {

public static void main(String[] args) {
	Account a1=new Account("abc123", 1000);
	Account a2=new Account("abc123", 2000);
	Account a3=new Account("abc123", 3000);
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
}
}
class Account{
	private int id;
	private String pwd;
	private double balance;
	private static double rate;
	private static double minBalance;
	private static int init=1000;
	public Account(String pwd,double balance) {
		this.id=init++;
		this.pwd=pwd;
		this.balance=balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Account.rate = rate;
	}
	public static double getMinBalance() {
		return minBalance;
	}
	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
}