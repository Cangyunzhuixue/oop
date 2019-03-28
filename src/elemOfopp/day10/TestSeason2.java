package elemOfopp.day10;
/*
 * 1、自定义枚举类
 * 2、如何使用关键字enum关键字定义枚举类
 *    >常用方法
 *    >如何让枚举类实现接口：可以让不同枚举类的对象
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
		//valueOf(String):要求是形参的名字
		System.out.println(Season3.valueOf("SPRING"));
		
	}
}
//枚举
enum Season3{
	SPRING("春天", "万物生长"){
		public void spr() {
			System.out.println("川光灿烂");
		}
	},
	SUMMER("夏天", "夏日炎炎"){
	public void spr() {
		System.out.println("生如夏花");
	}
	};
	//1、提供类属性，声明为pivate final
	private final String seasonName;
	private final String seasonDesc;
	//2、声明为final属性，在构造器中初始化
	private Season3(String seasonName,String seasonDesc) {
		this.seasonDesc=seasonDesc;
		this.seasonName=seasonName;
	}
    //3、通过公共方法来调用属性
	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDesc() {
		return seasonDesc;
	}
	//4、创建枚举类的对象
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
	public void spr() {
		System.out.println("季节");
	}
}
