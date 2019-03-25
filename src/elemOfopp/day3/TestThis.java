package elemOfopp.day3;
/*
 * this:
 * 可以用来修饰属性、方法、构造器
 * 可以理解为当前对象或正在创建的的对象，例如this.name,this.show();
 * 可以在构造其中通过this（形参）的方式显示调用本类中其他重载的指定的构造器
 * 
 */
public class TestThis {
public static void main(String[] args) {
	TriAngle triAngle=new TriAngle();
	triAngle.setBase(2.3);
	triAngle.setHeight(1.2);
	System.out.println(triAngle.getArea());
}
}
class TriAngle{
	private double base;
	private double height;
	public   TriAngle() {
		// TODO Auto-generated constructor stub() {
		this.base=1.0;
		this.height=2.0;
		
	}
	public   TriAngle(double base) {
		// TODO Auto-generated constructor stub() {
		this.base=1.0;
		this.height=2.0;
		
	}
	public  TriAngle(double base,double height) {
		this(base);//可以用来显式地调用当前类的重载的构造器
	}
	public double getBase() {
		return base;

	}
	public double getHeight() {
		return height;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return this.base*this.height/2;
	}
}