package elemOfopp.day10.file;
/*RandomAccessFile:֧���������
 * 1���ȿ��Գ䵱һ����������Ҳ���Գ䵱�����
 * 2��֧�ִ��ļ��Ŀ�ͷ��ȡ��д��
 * 3��֧�ִ�����λ�õĶ�ȡ��д�루���룩
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class TestRandomAccessFile {
	@Test
	public void test1() {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try {
			raf1 = new RandomAccessFile(new File("hello.txt"), "r");
			raf2 = new RandomAccessFile(new File("hello1.txt"), "rw");
			byte[] b = new byte[20];
			int len;
			while ((len = raf1.read(b)) != -1) {
				raf2.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void Test2() {
		RandomAccessFile raf1 = null;
		try {
			raf1 = new RandomAccessFile(new File("hello.txt"), "rw");
			raf1.seek(4);
			raf1.write("xy".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	@Test
	public void Test3() {
		RandomAccessFile raf1 = null;
		try {
			raf1 = new RandomAccessFile(new File("hello.txt"), "rw");
			raf1.seek(4);//��λ�ö�λ�����ĸ��ַ�
			byte[] b=new byte[10];
			int len;
			StringBuffer sb=new StringBuffer();
			while((len=raf1.read(b))!=-1) {
				sb.append(new String(b,0,len));
			}
			raf1.seek(4);;
			raf1.write("xy".getBytes());
			raf1.write(sb.toString().getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (raf1 != null) {
				try {
					raf1.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	} 
	
	
}
