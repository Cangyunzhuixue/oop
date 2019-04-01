package elemOfopp.day11;
/*
 * 创建一个子线程，完成1——100的自然数输出。同样地，主线程执行这样的操作
 * 
 */
//1、穿件一个继承Thread的泽类
class SubThread2 extends Thread{
	//2、重写Thread的run（）方法、方法内完成子线程要完成的功能
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			}
	}
}
class SubThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			}
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		//3、创建一个子类的对象
		SubThread2 st=new SubThread2();
		//4、调用现成的start():启动此线程；调用相应的run()方法
		//一个线程只能执行一次start（）
		//不能通过Thread的实现类来启动
		st.start();
		SubThread1 st1=new SubThread1();
	
		st1.start();
		System.out.println();
		for (int i = 1; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			}
		}
	
}
 