package elemOfopp.day11;

//ģ���վ��Ʊ����������������Ʊ����Ƭ��100��
public class TestWindow4 {

	public static void main(String[] args) {
		ThreadWindow4 w1 = new ThreadWindow4();
		Thread wt1 = new Thread(w1);
		Thread wt2 = new Thread(w1);
		Thread wt3 = new Thread(w1);
		wt1.setName("����1");
		wt2.setName("����2");
		wt3.setName("����3");
		wt1.start();

		wt2.start();
		wt3.start();
	}
}

class ThreadWindow4 implements Runnable {
	static int count = 100;
	Object obj = new Object();

	@Override
	public void run() {
	while(true){
			show();
	}
		
		// TODO Auto-generated method stub
	}

	public synchronized void show() {
		if(count > 0) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + (101 - count));
			count--;
		}
	}
}
