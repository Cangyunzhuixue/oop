package elemOfopp.day11.exer1;
/*
 * 生产者(Productor)将产品交给店员(Clerk)，
 * 而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），
 * 如果生产者试图生产更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
这里可能出现两个问题：
生产者比消费者快时，消费者会漏掉一些数据没有取到。
消费者比生产者快时，消费者会取相同的数据。

分析： 
1：是否涉及到多线程 ：生产者和消费者
2、是都涉及到共享数据：考虑线程安全
3、共享数据：产品数量
4、涉及到线程通信：生产者与消费者
 */
public class Productor implements Runnable{
	Clerk clerk;
	
	public Productor(Clerk clerk) {
		super();
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("开始生产");
		while(true) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clerk.addProduct();
		}
	}
}
