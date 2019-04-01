package elemOfopp.day11;

public class TestDeadLock {
static StringBuffer sb1=new StringBuffer();
static StringBuffer sb2=new StringBuffer();
public static void main(String[] args) {
	new Thread() {
		public void run() {
			synchronized (sb1) {
				try {
					Thread.currentThread().sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				sb1.append("A");
				synchronized (sb2) {
					sb2.append("B");
					System.out.println(sb1);
					System.out.println(sb2);
				}
			}
		};
	}.start();
	System.out.println("");
	new Thread() {
		public void run() {
			synchronized (sb2) {
				try {
					Thread.currentThread().sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				sb1.append("C");
				synchronized (sb1) {
					sb2.append("D");
					System.out.println(sb1);
					System.out.println(sb2);
				}
			}
		};
	}.start();
	
}
}
