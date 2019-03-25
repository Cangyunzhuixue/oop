package elemOfopp.day7;

public class TestTemplate {
public static void main(String[] args) {
	new SubTemplate().spendTime();
}
}
abstract class Template{
	abstract void code();
	public void spendTime() {
		long start =System.currentTimeMillis();
		this.code();
		long end=System.currentTimeMillis();
		System.out.println("花费时间为："+(end-start));
	}
	
}
class SubTemplate extends Template{
	public void code() {
		boolean flag=false;
		for (int i = 2; i < 100000; i++) {
			for (int j = 2; j < Math.sqrt(1); j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(i);
			}
		flag =false;
		}
	}
}