package elemOfopp.day10;

public class TestSingle {

}
//����ʽ:��ǰ�����ö���
class Single{
	private Single(){
		
	}
	private static Single instance=new Single();
	public static Single getInstance() {
		return instance;
	}
}

//����ʽ������ʱ�Ŵ���
class Single2{
	private static Single2 instance=null;
	private Single2() {
		
	}
	
	public static Single2 getInstance() {
		if(instance==null) {
			instance=new Single2();
		}
		return instance;
	}
}