package elemOfopp.day1;

import javafx.scene.shape.Circle;

/*匿名类对象:创建类的对象是匿名的
 * 当我们只需要一次调用的时候，我们就可以考虑匿名方式
 * passObjiect.printArea(new Circles(), 5);
 */


 class Circles {
	double radius;

	public double fingArea() {
		return Math.PI * radius * radius;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
}

public class PassObjiect {
	public static void main(String[] args) {
		PassObjiect passObjiect=new PassObjiect();
		
			Circles circle = new Circles();
			passObjiect.printArea(circle, 5);
			System.out.println();
			passObjiect.printArea(new Circles(), 5);
			System.out.println("ji ");
			new Circle().getRadius();
	}

	public void printArea(Circles c, int count) {
		System.out.println("r："+"\t"+"a");
		for (int i = 1 ; i < count; i++) {
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t"+c.fingArea());
			System.out.println();
		}
	}
}