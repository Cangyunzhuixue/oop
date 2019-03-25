package elemOfopp.day8.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;
/*
 * java.lang.Throwable
 *      |----erroe:错误，程序中不进行处理
 *      |----Exception 异常，要求在编写程序中进行处理
 *      
 *      java提供的事异常的抓抛模型
 *      1、抛，执行代码时，一旦出现异常，生成一个对应的异常类的对象，斌将此对象抛出，程序终止，
 *      此异常类的的方法抛给犯法的调用者
 *      2、抓，抓住上一步抛出来的对象
 *      java提供两种方式
 *      方式一：
 *      try{
 *     可能出现的异常
 *      }catch(Exception1 e1){
 *      处理的方式1
 *      }catch(Exception1 e1){
 *      处理的方式2
 *      }finally{
 *      必须执行的代码
 *      }
 * 注：1、try内的事局部变量，出了try语句不能被调用,
 * 2、finally可选
 * 4、多个catch语句，从上往下寻找，一旦找到，跳过其他的
 * 5、如果异常处理了，那么其后的代码继续执行
 * 6、若catch多个异常类型的是并列的，谁上谁下都可以
 *    包含关系须将子类放在父类的上边
 * 8、try - catch可以相互嵌套
 */

public class TestException {
	@Test
public void test1() {
	Scanner s=new Scanner(System.in);
	try {
		int i=s.nextInt();
		System.out.println(i);
	}catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("出现类型不匹配的异常");
	}
	
	s.close();
	}
	@Test
	public void test2() {
		try {
			int[] i=new int[10];
			System.out.println(i[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("数组越界了");
	}
		System.out.println("重新输入");
}
}