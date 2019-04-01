package elemOfopp.day11;

//与继承类的方式相比，实现的方式只需要创建一个对象，不用创建static
/*
 * 
 * 此程序存在线程安全问题：打印车票会出现重票，错票
 * 1、为什么会出现线程安全问题
 *   原因：由于一个线程在操作共享数据的过程中，在未执行完毕的情况下，另外的线程参与进来，导致贡献数据出现问题
 * 2、如何解决
 *   必须让一个线程操作共享数据完毕以后，其他数据才有机会参与共享数据的操作 
 * 3、java如何实现线程安全：想成同步机制
 *    方式一：同步代码块
 *    synchronized(同步监视器){
 *    //需要被同步的代码块（即为操作共享数据的代码）
 *    }
 *    1、共享数据：多个线程共同操作的同一个数据（变量）
 *    2、同步监视器：由一个类的对象来充当。那个县城获取此监视器，谁就执行大括号里被同步的代码。俗称：锁
 *    3、要求所有的线程公寓一把锁
 *    方方式二：同步方法
 *    将操作数据的方法声明为synchronized
 *  4、弊端：同一个时间 只有一个线程访问数据，效率变低 
 */
public class TestWindow3 {
	public static void main(String[] args) {
		RunThread3 rt = new RunThread3();
		Thread rt1 = new Thread(rt);
		Thread rt2 = new Thread(rt);
		Thread rt3 = new Thread(rt);
		rt1.setName("窗口1");
		rt2.setName("窗口2");
		rt3.setName("窗口3");
		rt1.start();
		rt2.start();
		rt3.start();
	}
}

class RunThread3 implements Runnable {
	int ticket = 100;// 共享数据
	// Object obj = new Object();

	public void run() {
		// Animal a = new Animal();//局部变量
		while (true) {
			synchronized (this) {// this表示当前对象，本题中即为w
				if (ticket > 0) {
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
				}
			}
		}
	}
}