package elemOfopp.day6;



/*
 *关于属性值的操作：1、默认的初始化；2、显示的初始化或者代码块初始化（顺序执行）；3、构造器中；4、方法
 *
 *类的第四个成员，初始化（代码块）
 *代码块如果有修饰，那么只能使用static
 *分类：
 *1.静态代码块
 *可以有输出语句
 *随着类的加载而加载
 *只加载一次
 *顺序结构执行
 *遭遇非静态执行
 *静态代码块中只能执行静态的结构（类属性，类方法）
 *
 *
 *2.非静态代码块：
 *可以对类的属性进行赋值，同时可以调用本类声明的方法
 *里边可以有输出语句
 *一个类中可以又多个非静态代码块，顺序结构执行
 *每创建一个对象，非静态代码块加载一次
 *非静态代码块的执行要早于构造器
 *
 *代码块都先执行父类的
 *
 */
public class Testorder {
public static void main(String[] args) {
	Order o1=new Order();
	System.out.println(o1);
	System.out.println();
	Order o2=new Order();
	System.out.println(o2);
}
}


class Order{
	private int orderId;
	private String OrderName;
	private static String orderDec;
	//初始化块
	{
		orderId=1002;
		OrderName="AA";
		System.out.println("i am in");
	}
	{ 
		orderId=1003;
		OrderName="AA";
		System.out.println("2 ");
	}
	static {
		orderDec="sda";
		System.out.println("static");
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		OrderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	@Override
	public String toString() {
		return "order [orderId=" + orderId + ", OrderName=" + OrderName + "]";
	}
	
}