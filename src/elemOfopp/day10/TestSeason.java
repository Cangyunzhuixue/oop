package elemOfopp.day10;

public class TestSeason {
public static void main(String[] args) {
	Season spring =Season.SPRING;
	System.out.println(spring);
	spring.show();
	System.out.println(spring.getSeasonName());
}
}
//ö��
class Season{
	//1���ṩ�����ԣ�����Ϊpivate final
	private final String seasonName;
	private final String seasonDesc;
	//2������Ϊfinal���ԣ��ڹ������г�ʼ��
	private Season(String seasonName,String seasonDesc) {
		this.seasonDesc=seasonDesc;
		this.seasonName=seasonName;
	}
    //3��ͨ��������������������
	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDesc() {
		return seasonDesc;
	}
	//4������ö����Ķ���
	public static final Season SPRING=new Season("����", "��������");
	public static final Season SUMMER=new Season("����", "��������");
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
	public void show() {
		System.out.println("����");
	}
}
