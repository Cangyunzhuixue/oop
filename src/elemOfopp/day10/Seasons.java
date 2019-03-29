package elemOfopp.day10;

interface Info{
	void show();
}

enum Seasons implements Info {
	SPRING("����","�������"){
		public void show() {
			System.out.println("��է��,����һ�ش�ˮ");
		};
	},//�����ĸ�ʵ����ע���Ƕ���,
	SUMMER("����","�����Ļ�"){
		public void show() {
			System.out.println("������Ҷ����̣�ӳ�պɻ�������");
		}
	},
	AUTMN("����","�����ˬ"){
		public void show () {
			System.out.println("������ֻ�������������籯����");
		}
	},
	WINTER("����","���տɰ�"){
		public void show () {
			System.out.println("����һҹ��������ǧ�������滨��");
		}
	};
	private  final String seasonName;
	private  final String seasonDesc;
	private Seasons(String seasonName, String seasonDesc) {
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}



	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDesc() {
		return seasonDesc;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("�����ﶬ");	
	}
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
public static void main(String[] args) {
	Seasons spring =Seasons.SPRING;
	System.out.println(spring);
	System.out.println(spring.getSeasonName());
	System.out.println();
	//1.values()
	Seasons[] seasons=Seasons.values();
	for (int i = 0; i < seasons.length; i++) {
		System.out.println(seasons[i]);
	}
	seasons[0].show();
	//valueOf(String):Ҫ�����βε�����
	System.out.println(Seasons.valueOf("SPRING"));
	System.out.println();
}

}
