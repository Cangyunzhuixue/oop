package elemOfopp.day10;

public class TestSeason {
public static void main(String[] args) {
	Season spring =Season.SPRING;
	System.out.println(spring);
	spring.show();
	System.out.println(spring.getSeasonName());
}
}
//枚举
class Season{
	//1、提供类属性，声明为pivate final
	private final String seasonName;
	private final String seasonDesc;
	//2、声明为final属性，在构造器中初始化
	private Season(String seasonName,String seasonDesc) {
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
	public static final Season SPRING=new Season("春天", "万物生长");
	public static final Season SUMMER=new Season("夏天", "夏日炎炎");
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
	public void show() {
		System.out.println("季节");
	}
}
