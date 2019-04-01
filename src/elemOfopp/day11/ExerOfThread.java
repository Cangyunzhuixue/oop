package elemOfopp.day11;
/*
 * 两个线程，一个输出100内的奇数，一个输出偶数
 */
public class ExerOfThread {
public static void main(String[] args) {
	ExThread1 exThr1=new ExThread1();
	ExThread2 exThr2=new ExThread2();
	exThr1.setName("偶数线程");
	exThr2.setName("奇数线程");
	Thread.currentThread().setName("#####主线程");
	exThr1.start();
	exThr2.start();
//继承于Thread猎德匿名类对象
	new Thread() {
		public void run() {
			Thread.currentThread().setName("线程3");
			for (int i = 0; i < 1000; i++) {
				if (i%100==0) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
		}; 
	}.start();
	
}
}
class ExThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if (i%2==0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
	
}
class ExThread2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if (i%2!=0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}