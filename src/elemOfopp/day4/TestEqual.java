package elemOfopp.day4;

/*
 * 基本数据类型比较值，两端数据类型可以不同，在不同情况下也可以返回true
 * 引用数据类型，比较引用类型变量的地址值是否相等
 * equal只能处理引用类型变量
 * 在Object,发现equals（）仍然比较两个引用变量的地址值是否相等
 * 
 */

public class TestEqual {
public static void main(String[] args) {
	String str11=new String("a");
	String str21=new String("a");
	System.out.println(str11==str21);//equals()
	System.out.println(str11.equals(str21));//在String中重写过
	
	String string="aa";
	String string2="aa";
	String string3=new String("aa");
	System.out.println(string==string2);
	System.out.println(string.equals(string3)+"#");
	
	String str = "abc";//在常量池中创建abc
	String str1 = "abcd";//在常量池中创建abcd
	String str2 = str+"d";//拼接字符串，此时会在堆中新建一个abcd的对象，因为str2编译之前是未知的
	String str3 = "abc"+"d";//拼接之后str3还是abcd，所以还是会指向字符串常量池的内存地址
	System.out.println(str1==str2);//false
	System.out.println(str1==str3);//true
	
	
	
}
private void pub() {
	int i=12;
	int j=12;
	char c=12;
	float f=12.0f;
	int k=65;
	char a='A';
	System.out.println(i==j);
	System.out.println(c==f);
	System.out.println(k==a);
	Object obj1=new Object();
	Object obj2=new Object();
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj1==obj2);
	// TODO Auto-generated method stub
	
	
	

}
}
