package elemOfopp.day10.file;
/*1�����ķ���
 * ������������ͬ���������������
 * ���մ������ݵĵ�λ��ͬ���ֽ������ַ�����������ı��ļ���
 * ���ս�ɫ��ͬ���ڵ�����ֱ���������ļ��ģ�������
 * 2��IO����ϵ
 * �������                       �ڵ������ļ�����                ������(���������ļ���ȡЧ��)
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
		// 1.�����ļ�����
		File file = new File("./hello.txt");
		// 2.����һ��FileInputStream����
		FileInputStream fileInputStream = new FileInputStream(file);
		// 3.����FileInputStream�ķ�����ʵ��file�Ķ�ȡ
		/*
		 * read():��ȡһ���ֽڣ�ִ�е���βʱ����-1
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
		// ʹ��try-catch�ķ�ʽ�����쳣������
		// 1.�����ļ�����
		FileInputStream fileInputStream = null;
		try {
			File file = new File("./hello.txt");
			// 2.����һ��FileInputStream����
			fileInputStream = new FileInputStream(file);
			// 3.����FileInputStream�ķ�����ʵ��file�Ķ�ȡ

			int b;
			while ((b = fileInputStream.read()) != -1) {
				System.out.println((char) b);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {//��֤���Ĺرձ���ִ��
			
		}
	}
	@Test
	public void TestFileInputStream3() {
		FileInputStream fis=null;
	try {
		File file=new File("hello.txt");
		 fis=new FileInputStream(file);
		byte[] b=new byte[5];
		int len;//ÿ�ζ��뵽byte�е��ֽڳ���
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
	//���
	
	@Test
	public void TestFileOutpuStream1() {
		//����һ��File���󣬱���Ҫд���λ��
		File file=new File("hello2.txt");//�ļ����Բ����ڣ����Զ������������ڣ��Ḳ��
		//����һ��FileOutStream����
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			//д�����
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
