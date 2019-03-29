package elemOfopp.day10.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

import org.junit.Test;

public class exerOfStream {
	// 字节流
	@Test
	public void test1() {
		BufferedOutputStream bw = null;
		BufferedInputStream br = null;

		try {
			File file2 = new File("test.txt");
			FileOutputStream fos = new FileOutputStream(file2);
			bw = new BufferedOutputStream(fos);
			bw.write(new String(
					"getBytes() 是Java编程语言中将一个字符串转化为一个字节数组byte[]的方法。" + "String的getBytes()方法是得到一个系统默认的编码格式的字节数组。\r\n"
							+ "将一个String类型的字符串中包含的字符转换成byte类型并且存入一个byte[]数组中。" + "在java中的所有数据底层都是字节，字节数据可以存入到byte数组。")
									.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		try {

			File file1 = new File("test.txt");
			FileInputStream fis = new FileInputStream(file1);
			br = new BufferedInputStream(fis);
			int len;
			byte[] b = new byte[1024];
			while ((len = br.read(b)) != -1) {
				String string = new String(b, 0, len);
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	@Test
	public void test2() {
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			File file1=new File("test2.txt");
			FileWriter fw=new FileWriter(file1);
			bw=new BufferedWriter(fw);
			bw.write(new String("存储字符数据时（字符串就是字符数据），会先进行查表，然后将查询的结果写入设备，读取时也是先查表，把查到的内容打印到显示设备上，getBytes()是使用默认的字符集进行转换，getBytes(“utf-8”)是使用UTF-8编码表进行转换。\r\n" + 
					""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (bw!=null) {
				try {
					bw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		try {
			File file=new File("test2.txt");
			FileReader fr=new FileReader(file);
			br=new BufferedReader(fr);
			int len;
			char[] c=new char[1024];
			while((len=br.read(c))!=-1) {
				String string=new String(c, 0, len);
				System.out.println(string);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
