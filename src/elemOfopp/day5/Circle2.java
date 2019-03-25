package elemOfopp.day5;

public class Circle2 {
public static void main(String[] args) {
	Circle3 c1=new Circle3(10.0);
	Circle3 c2=new Circle3(20.0);
	System.out.println(Circle3.getTotal());
	Circle3.setInfo("rectangle");
	Circle3.show();
}
}
class Circle3{
	private double radius;
	private static String info="circle";
	private static int total=0;
	public Circle3(double radius) {
		this.radius=radius;
		total++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static String getInfo() {
		return info;
	}
	public static void setInfo(String info) {
		Circle3.info = info;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Circle3.total = total;
	}
	@Override
	public String toString() {
		return "Circle3 [radius=" + radius + "]";
	}
	public static void show() {
		System.out.println(info);
		// TODO Auto-generated method stub

	}
}
