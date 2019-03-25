package elemOfopp.day5;


public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		Circle circle2=new Circle(1.0,"blue",1.0);
		System.out.println(circle.color.equals(circle2.color));
		System.out.println(circle.equals(circle2));
		System.out.println(circle);

	}

}
