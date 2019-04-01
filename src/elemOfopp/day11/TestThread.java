package elemOfopp.day11;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * 创建一个子线程，完成1——100的自然数输出。同样地，主线程执行这样的操作
 * 常用方法：1：start():启动并执行相应的run（）方法
 * 2、run（）：子线程要执行的代码放在此方法中
 * 3、currentThread():静态的，调用当前的线程
 * 4、getName():获取此线程的名字
 * 5、setNanme():设置此线程的名字
 * 6、yeild():调用此方法的线程释放当前CPU的指向权
 * 7、join():在A线程中调用B线程的join()方法，表示：
 * 当执行到此方法，A线程停止执行，直至B进程执行完毕，A线程再接着Join()之后的代码执行
 * 8、isAlive():判断当前线程是否还存活
 * 9、sleep(long 1):显示让当前线程睡眠1毫秒
 * 10、线程的通信：wait() notify() notifyAll()
 * 11、线程的优先级：getPrioritu(),返回优先级
 * setPrioruty(int newPriority):改变线程优先级
 */
//1、穿件一个继承Thread的子类
class SubThread extends Thread {
	// 2、重写Thread的run（）方法、方法内完成子线程要完成的功能
	public void run() {
		for (int i = 1; i <= 20; i++) {
			/*
			 * try { Thread.currentThread().sleep(100); } catch (InterruptedException e) {
			 * // TODO Auto-generated catch block e.printStackTrace(); }
			 */
			System.out
					.println(Thread.currentThread().getName() + ": " + i + " " + +Thread.currentThread().getPriority());

		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		// 3、创建一个子类的对象
		SubThread st = new SubThread();
		// 4、调用现成的start():启动此线程；调用相应的run()方法
		// 一个线程只能执行一次start（）
		// 不能通过Thread的实现类来启动
		Thread.currentThread().setName("###主线程");
		st.setName("子线程1");
		st.setPriority(Thread.MAX_PRIORITY);
		st.start();
		System.out.println();
		for (int i = 1; i <= 20; i++) {
			System.out
					.println(Thread.currentThread().getName() + ": " + i + " " + Thread.currentThread().getPriority());
			/*
			 * if (i == 20) { try { st.join(); } catch (InterruptedException e) { // TODO:
			 * handle exception e.printStackTrace(); } } }
			 */
			/*System.out.println(st.isAlive());*/
		}
	}
}
