package elemOfopp.day11;
/*
 * �����̣߳�һ�����100�ڵ�������һ�����ż��
 */
public class ExerOfThread {
public static void main(String[] args) {
	ExThread1 exThr1=new ExThread1();
	ExThread2 exThr2=new ExThread2();
	exThr1.setName("ż���߳�");
	exThr2.setName("�����߳�");
	Thread.currentThread().setName("#####���߳�");
	exThr1.start();
	exThr2.start();
//�̳���Thread�Ե����������
	new Thread() {
		public void run() {
			Thread.currentThread().setName("�߳�3");
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