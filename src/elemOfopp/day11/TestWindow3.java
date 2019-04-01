package elemOfopp.day11;

//��̳���ķ�ʽ��ȣ�ʵ�ֵķ�ʽֻ��Ҫ����һ�����󣬲��ô���static
/*
 * 
 * �˳�������̰߳�ȫ���⣺��ӡ��Ʊ�������Ʊ����Ʊ
 * 1��Ϊʲô������̰߳�ȫ����
 *   ԭ������һ���߳��ڲ����������ݵĹ����У���δִ����ϵ�����£�������̲߳�����������¹������ݳ�������
 * 2����ν��
 *   ������һ���̲߳���������������Ժ��������ݲ��л�����빲�����ݵĲ��� 
 * 3��java���ʵ���̰߳�ȫ�����ͬ������
 *    ��ʽһ��ͬ�������
 *    synchronized(ͬ��������){
 *    //��Ҫ��ͬ���Ĵ���飨��Ϊ�����������ݵĴ��룩
 *    }
 *    1���������ݣ�����̹߳�ͬ������ͬһ�����ݣ�������
 *    2��ͬ������������һ����Ķ������䵱���Ǹ��سǻ�ȡ�˼�������˭��ִ�д������ﱻͬ���Ĵ��롣�׳ƣ���
 *    3��Ҫ�����е��̹߳�Ԣһ����
 *    ����ʽ����ͬ������
 *    ���������ݵķ�������Ϊsynchronized
 *  4���׶ˣ�ͬһ��ʱ�� ֻ��һ���̷߳������ݣ�Ч�ʱ�� 
 */
public class TestWindow3 {
	public static void main(String[] args) {
		RunThread3 rt = new RunThread3();
		Thread rt1 = new Thread(rt);
		Thread rt2 = new Thread(rt);
		Thread rt3 = new Thread(rt);
		rt1.setName("����1");
		rt2.setName("����2");
		rt3.setName("����3");
		rt1.start();
		rt2.start();
		rt3.start();
	}
}

class RunThread3 implements Runnable {
	int ticket = 100;// ��������
	// Object obj = new Object();

	public void run() {
		// Animal a = new Animal();//�ֲ�����
		while (true) {
			synchronized (this) {// this��ʾ��ǰ���󣬱����м�Ϊw
				if (ticket > 0) {
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "��Ʊ��Ʊ��Ϊ��" + ticket--);
				}
			}
		}
	}
}