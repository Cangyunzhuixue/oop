package elemOfopp.day11;
//��̳���ķ�ʽ��ȣ�ʵ�ֵķ�ʽֻ��Ҫ����һ�����󣬲��ô���static
/*
 * 
 * �˳�������̰߳�ȫ���⣺��ӡ��Ʊ�������Ʊ����Ʊ
 */
public class TestWindow1 {
public static void main(String[] args) {
	RunThread1 rt=new RunThread1();
	Thread rt1=new Thread(rt);
	Thread rt2=new Thread(rt);
	Thread rt3=new Thread(rt);
	rt1.setName("����1");
	rt2.setName("����2");
	rt3.setName("����3");
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