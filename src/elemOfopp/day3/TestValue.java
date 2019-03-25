package elemOfopp.day3;
/*
 * 无论是数据类型还是引用类型，参数传递的都是值
 * 在方法中声明的局部变量都是用完就释放的例如value2;
 * 
 */
public class TestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestValue t = new TestValue();
		t.first();
	}
	
	public void first() {
		int i=1;
		Value value=new Value();
		value.i=25;
		second(value,i);
		System.out.println(value.i);
	}

	public void second(Value value,int i) {//这个value跟上边的value只是指向地址一样
		i=0;
		value.i=20;
		Value value2=new Value();
		value=value2;
		System.out.println(value.i+" "+i);
	} 

}

class Value {
	int i = 15;
}
