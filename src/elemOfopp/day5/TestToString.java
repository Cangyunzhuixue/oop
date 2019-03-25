package elemOfopp.day5;
/*
 * 打印order和打印order.toString（）效果是一样的
 * 像，String、包装类、File、Date类已经实现了Object中toString（）的重写
 */
public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=new Order(22, "samuro");
		System.out.println(order);

	}

}
