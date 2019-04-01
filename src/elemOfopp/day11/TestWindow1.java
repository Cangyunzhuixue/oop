package elemOfopp.day11;
//与继承类的方式相比，实现的方式只需要创建一个对象，不用创建static
/*
 * 
 * 此程序存在线程安全问题：打印车票会出现重票，错票
 */
public class TestWindow1 {
public static void main(String[] args) {
	RunThread1 rt=new RunThread1();
	Thread rt1=new Thread(rt);
	Thread rt2=new Thread(rt);
	Thread rt3=new Thread(rt);
	rt1.setName("窗口1");
	rt2.setName("窗口2");
	rt3.setName("窗口3");
	rt1.start();
	rt2.start();
	rt3.start();
}
}
class RunThread1 implements Runnable{
	int ticket=100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticket>0) {
			synchronized (this) {
				
			}
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+ticket--);
		}
	}
	
}