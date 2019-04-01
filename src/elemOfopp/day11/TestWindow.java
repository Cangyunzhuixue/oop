package elemOfopp.day11;
//模拟火车站售票，开启三个床后售票，总片数100张
public class TestWindow {
	
public static void main(String[] args) {
	ThreadWindow1 w1=new ThreadWindow1();
	ThreadWindow1 w2=new ThreadWindow1();
	ThreadWindow1 w3=new ThreadWindow1();
	w1.setName("窗口1");
	w2.setName("窗口2");
	w3.setName("窗口3");
	w1.start();
	w2.start();
	w3.start();
}
}
class ThreadWindow1 extends Thread{
	static int count=100;

	@Override
	public void run() {		
		// TODO Auto-generated method stub
		while(count>0) {
			System.out.println(Thread.currentThread().getName()+" "+(100-count));
			count--;
		}
	}
}
