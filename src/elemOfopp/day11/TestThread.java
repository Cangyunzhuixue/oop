package elemOfopp.day11;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * ����һ�����̣߳����1����100����Ȼ�������ͬ���أ����߳�ִ�������Ĳ���
 * ���÷�����1��start():������ִ����Ӧ��run��������
 * 2��run���������߳�Ҫִ�еĴ�����ڴ˷�����
 * 3��currentThread():��̬�ģ����õ�ǰ���߳�
 * 4��getName():��ȡ���̵߳�����
 * 5��setNanme():���ô��̵߳�����
 * 6��yeild():���ô˷������߳��ͷŵ�ǰCPU��ָ��Ȩ
 * 7��join():��A�߳��е���B�̵߳�join()��������ʾ��
 * ��ִ�е��˷�����A�߳�ִֹͣ�У�ֱ��B����ִ����ϣ�A�߳��ٽ���Join()֮��Ĵ���ִ��
 * 8��isAlive():�жϵ�ǰ�߳��Ƿ񻹴��
 * 9��sleep(long 1):��ʾ�õ�ǰ�߳�˯��1����
 * 10���̵߳�ͨ�ţ�wait() notify() notifyAll()
 * 11���̵߳����ȼ���getPrioritu(),�������ȼ�
 * setPrioruty(int newPriority):�ı��߳����ȼ�
 */
//1������һ���̳�Thread������
class SubThread extends Thread {
	// 2����дThread��run����������������������߳�Ҫ��ɵĹ���
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
		// 3������һ������Ķ���
		SubThread st = new SubThread();
		// 4�������ֳɵ�start():�������̣߳�������Ӧ��run()����
		// һ���߳�ֻ��ִ��һ��start����
		// ����ͨ��Thread��ʵ����������
		Thread.currentThread().setName("###���߳�");
		st.setName("���߳�1");
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
