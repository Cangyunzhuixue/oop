package elemOfopp.day10.file;
/*1、流的分类
 * 按照数据流向不同：输入流，输出流
 * 按照处理数据的单位不同：字节流、字符流（处理的文本文件）
 * 按照角色不同：节点流（直接作用于文件的）处理流
 * 2、IO的体系
 * 抽象基类                       节点流（文件流）                缓冲流(可以提升文件读取效率)
 * InputStream   FileInputStream  BufferInputStream
 * OutputStream  FileOutpuStream  BufferOutputStream(flush())
 * Reader        FileReader       BufferReader(readLine())
 * Writer        FileWriter       BufferWriter(flush())
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.junit.Test;

public class TestFileInputOutputStream {
	@Test
	public void TestFileInputStream1() throws IOException {
		// 1.创建文件对象
		File file = new File("./hello.txt");
		// 2.创建一个FileInputStream对象
		FileInputStream fileInputStream = new FileInputStream(file);
		// 3.调用FileInputStream的方法，实现file的读取
		/*
		 * read():读取一个字节，执行到结尾时返回-1
		 */
		/*
		 * int b=fileInputStream.read(); while (b!=-1) { System.out.println((char)b);
		 * b=fileInputStream.read();
		 * 
		 * }
		 */
		int b;
		while ((b = fileInputStream.read()) != -1) {
			System.out.println((char) b);
		}
		fileInputStream.close();
	}

	@Test
	public void TestFileInputStream2() {
		// 使用try-catch的方式处理异常更合理
		// 1.创建文件对象
		FileInputStream fileInputStream = null;
		try {
			File file = new File("./hello.txt");
			// 2.创建一个FileInputStream对象
			fileInputStream = new FileInputStream(file);
			// 3.调用FileInputStream的方法，实现file的读取

			int b;
			while ((b = fileInputStream.read()) != -1) {
				System.out.println((char) b);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {//保证流的关闭必须执行
			
		}
	}
	@Test
	public void TestFileInputStream3() {
		FileInputStream fis=null;
	try {
		File file=new File("hello.txt");
		 fis=new FileInputStream(file);
		byte[] b=new byte[5];
		int len;//每次读入到byte中的字节长度
		while((len=fis.read(b))!=-1) {
			/*for (int i = 0; i <b.length ;i++) {
				System.out.print((char)b[i]+" ");
			}*/
			String str=new String(b,0,len);
			System.out.print(str);
		}
	} catch (IOException e) {
		// TODO: handle exception
	}finally {
		if (fis!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}		
	}
	//输出
	
	@Test
	public void TestFileOutpuStream1() {
		//创建一个File对象，表明要写入的位置
		File file=new File("hello2.txt");//文件可以不存在，会自动创建，若存在，会覆盖
		//创建一个FileOutStream对象
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			//写入操作
			fos.write(new String("I love ZhaoXueLi").getBytes());
		} catch(IOException e){
			e.printStackTrace();
		}finally {
			if (fos!=null) {
				try{
					fos.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		
			// TODO: handle finally clause
		}
	}
	
	
	@Test
	public void testFileInputOutputStream() {
		File file1=new File("C:\\Users\\Administrator\\Desktop\\1.jpg");
		File file3=new File("C:\\Users\\Administrator\\Desktop\\2.jpg");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(file1);
			fos=new FileOutputStream(file3);
			byte[] b=new byte[5];
			int len;
			while((len=fis.read(b))!=-1) {
				fos.write(b, 0, len);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if(fis!=null) {
				try {
					fos.close();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	
}
