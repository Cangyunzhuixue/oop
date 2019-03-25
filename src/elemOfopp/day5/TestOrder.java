package elemOfopp.day5;

public class TestOrder {
public static void main(String[] args) {
	Order order=new Order(11, "samuro");
	Order order2=new Order(11, "samuro");
	Order order3=new Order(12, "orderName");
	System.out.println(order.equals(order2));
	System.out.println(order.equals(order3));
}

}
