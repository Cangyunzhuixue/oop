package elemOfopp.day11;
/*
 * ����һ�����̣߳����1����100����Ȼ�������ͬ���أ����߳�ִ�������Ĳ���
 * 
 */
//1������һ���̳�Thread������
class SubThread2 extends Thread{
	//2����дThread��run����������������������߳�Ҫ��ɵĹ���
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
		//3������һ������Ķ���
		SubThread2 st=new SubThread2();
		//4�������ֳɵ�start():�������̣߳�������Ӧ��run()����
		//һ���߳�ֻ��ִ��һ��start����
		//����ͨ��Thread��ʵ����������
		st.start();
		SubThread1 st1=new SubThread1();
	
		st1.start();
		System.out.println();
		for (int i = 1; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			}
		}
	
}
 