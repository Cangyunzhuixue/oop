package elemOfopp.day10.file;
/*
 * ���������������ص��ࡢ�ӿڶ�������java.io��
 */

import java.io.File;
/*
 * 
 */

import org.junit.Test;
public class TestFile {
@Test
public void test() {
	File file=new File("E:/io/hello.txt");
	System.out.println(file.getAbsolutePath());
}


}
