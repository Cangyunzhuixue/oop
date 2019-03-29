package elemOfopp.day10;

interface Info{
	void show();
}

enum Seasons implements Info {
	SPRING("春天","万象初新"){
		public void show() {
			System.out.println("风乍起,吹皱一池春水");
		};
	},//创建四个实例，注意是逗号,
	SUMMER("夏天","生如夏花"){
		public void show() {
			System.out.println("接天莲叶无穷碧，映日荷花别样红");
		}
	},
	AUTMN("秋天","秋高气爽"){
		public void show () {
			System.out.println("人生若只如初见，何事秋风悲画扇");
		}
	},
	WINTER("冬天","冬日可爱"){
		public void show () {
			System.out.println("忽如一夜春风来，千树万树梨花开");
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
		System.out.println("春夏秋冬");	
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
	//valueOf(String):要求是形参的名字
	System.out.println(Seasons.valueOf("SPRING"));
	System.out.println();
}

}
