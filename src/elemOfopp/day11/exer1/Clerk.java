
package elemOfopp.day11.exer1;

public class Clerk {
	int count ;

	public synchronized void addProduct() {
		if (count >= 20) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			count++;
			System.out.println(Thread.currentThread().getName() + " 生产第" + count);
			notifyAll();
		}
	}

	public synchronized void consumePro() {
		if (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " 消费了第" + count);
			count--;
			notifyAll();
		}
	}
}
