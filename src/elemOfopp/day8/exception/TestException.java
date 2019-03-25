package elemOfopp.day8.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;
/*
 * java.lang.Throwable
 *      |----erroe:���󣬳����в����д���
 *      |----Exception �쳣��Ҫ���ڱ�д�����н��д���
 *      
 *      java�ṩ�����쳣��ץ��ģ��
 *      1���ף�ִ�д���ʱ��һ�������쳣������һ����Ӧ���쳣��Ķ��󣬱󽫴˶����׳���������ֹ��
 *      ���쳣��ĵķ����׸������ĵ�����
 *      2��ץ��ץס��һ���׳����Ķ���
 *      java�ṩ���ַ�ʽ
 *      ��ʽһ��
 *      try{
 *     ���ܳ��ֵ��쳣
 *      }catch(Exception1 e1){
 *      ����ķ�ʽ1
 *      }catch(Exception1 e1){
 *      ����ķ�ʽ2
 *      }finally{
 *      ����ִ�еĴ���
 *      }
 * ע��1��try�ڵ��¾ֲ�����������try��䲻�ܱ�����,
 * 2��finally��ѡ
 * 4�����catch��䣬��������Ѱ�ң�һ���ҵ�������������
 * 5������쳣�����ˣ���ô���Ĵ������ִ��
 * 6����catch����쳣���͵��ǲ��еģ�˭��˭�¶�����
 *    ������ϵ�뽫������ڸ�����ϱ�
 * 8��try - catch�����໥Ƕ��
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
		System.out.println("�������Ͳ�ƥ����쳣");
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
			System.out.println("����Խ����");
	}
		System.out.println("��������");
}
}