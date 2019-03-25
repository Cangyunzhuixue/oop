package elemOfopp.day2;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/*
 * 可变可数的形参的方法
 * 1、格式：数据类型...形参名
 * 2、可变个数的形参的方法与同名的方法之间构成重载
 * 3、可变参数在调用时，个数从0开始到无穷多个都可以
 * 4、使用可变多喝形参的方法与方法的形参使用数组是一样的
 * 5、若方法中存在可变个数的形参，那么一定要声明在方法形参的最后
 * 6、在一个方法中，最多声明一个可变参数的形参
 */

public class anonyousObljest {
public static void main(String[] args) {
	anonyousObljest anonyousObljest=new anonyousObljest();
	anonyousObljest.name(1,"sd");
	anonyousObljest.name(2,"hello","asdasd");
	anonyousObljest.name(1,"123mutour ");
	System.out.println(args.length);
}
/*public void name() {
	System.out.println("hello");
	
}*/
/*public void name(String str) {
	System.out.println("wor");
}//可变个数的形参的方法
*/public void name(int j,String ... args) {
	for (int i = 0; i < j; i++) {
		System.out.print(args[i]+" "+"test");
	}
	System.out.println();
}
/*public void name(int i,String...args) {
	
}*/
/*跟上边的一样
 * 
 * public void name(String[] args) {
	
}*/
}
