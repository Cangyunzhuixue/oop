package elemOfopp.day11;
//��������ʽ���̰߳�ȫ���⣺ʹ��ͬ������
//����һ�㷽���ڣ�ʹ��ͬ������飬���Կ�����this
//��̬���������ñ���Ϊ��
public class TestSingle {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1==s2);
}

}
class Singleton{
	private Singleton() {
	}
	private static Singleton instance=null;
	
	public static Singleton getInstance() {
		if (instance==null) {//���ʸ�һ��
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			} 
		}
		return instance;
	}
	}