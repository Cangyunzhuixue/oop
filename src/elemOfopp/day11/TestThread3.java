package elemOfopp.day11;
/*
 * �Ա����ַ�ʽ
 * ��ϵ��ThreadҲ��ʵ����Runnable
 * 
 * �Աȣ�ʵ�ֵķ�ʽ���ڼ̳еķ�ʽ
 *   ԭ�򣺱���̳еĵ��̳���
 *       �������߳�Ҫ����ͬһ����Դ�������ݣ������ʺ�ʵ�ֵķ�ʽ
 */
public class TestThread3 {
public static void main(String[] args) {
	RunThread rt=new RunThread();//��Ϊ�β�
	//Ҫ��������̣߳��������sart()����
	Thread rt1=new Thread(rt);
	rt1.start();//�����̣߳�ָ��Thread��������ʱ�������βεĶ����run()����
	Thread rt2=new Thread(rt);//�����ĵڶ����߳�
	
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