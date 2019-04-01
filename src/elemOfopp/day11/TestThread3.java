package elemOfopp.day11;
/*
 * 对比两种方式
 * 联系：Thread也是实现了Runnable
 * 
 * 对比：实现的方式优于继承的方式
 *   原因：避免继承的单继承性
 *       如果多个线程要操作同一个资源（或数据），更适合实现的方式
 */
public class TestThread3 {
public static void main(String[] args) {
	RunThread rt=new RunThread();//作为形参
	//要想调用子线程，必须调用sart()方法
	Thread rt1=new Thread(rt);
	rt1.start();//启动线程，指向Thread对象生成时构造器形参的对象的run()方法
	Thread rt2=new Thread(rt);//创建的第二个线程
	
}
}
class RunThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if(i%10==0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
}