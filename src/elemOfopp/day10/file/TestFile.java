package elemOfopp.day10.file;
/*
 * 凡是与输入输出相关的类、接口都定义在java.io下
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
