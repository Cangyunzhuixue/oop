package elemOfopp.day10;
/*
 * 1���Զ���ö����
 * 2�����ʹ�ùؼ���enum�ؼ��ֶ���ö����
 *    >���÷���
 *    >�����ö����ʵ�ֽӿڣ������ò�ͬö����Ķ���
 */
public class TestSeason2 {
	
	public static void main(String[] args) {
		@MyAnnotation("samuro")
		Season3 spring =Season3.SPRING;
		System.out.println(spring);
		
		System.out.println(spring.getSeasonName());
		System.out.println();
		//1.values()
		Season3[] seasons=Season3.values();
		for (int i = 0; i < seasons.length; i++) {
			System.out.println(seasons[i]);
		}
		//valueOf(String):Ҫ�����βε�����
		System.out.println(Season3.valueOf("SPRING"));
		
	}
}
//ö��
enum Season3{
	SPRING("����", "��������"){
		public void spr() {
			System.out.println("�������");
		}
	},
	SUMMER("����", "��������"){
	public void spr() {
		System.out.println("�����Ļ�");
	}
	};
	//1���ṩ�����ԣ�����Ϊpivate final
	private final String seasonName;
	private final String seasonDesc;
	//2������Ϊfinal���ԣ��ڹ������г�ʼ��
	private Season3(String seasonName,String seasonDesc) {
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
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
	public void spr() {
		System.out.println("����");
	}
}
