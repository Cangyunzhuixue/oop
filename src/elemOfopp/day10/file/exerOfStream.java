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
	// �ֽ���
	@Test
	public void test1() {
		BufferedOutputStream bw = null;
		BufferedInputStream br = null;

		try {
			File file2 = new File("test.txt");
			FileOutputStream fos = new FileOutputStream(file2);
			bw = new BufferedOutputStream(fos);
			bw.write(new String(
					"getBytes() ��Java��������н�һ���ַ���ת��Ϊһ���ֽ�����byte[]�ķ�����" + "String��getBytes()�����ǵõ�һ��ϵͳĬ�ϵı����ʽ���ֽ����顣\r\n"
							+ "��һ��String���͵��ַ����а������ַ�ת����byte���Ͳ��Ҵ���һ��byte[]�����С�" + "��java�е��������ݵײ㶼���ֽڣ��ֽ����ݿ��Դ��뵽byte���顣")
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
			bw.write(new String("�洢�ַ�����ʱ���ַ��������ַ����ݣ������Ƚ��в��Ȼ�󽫲�ѯ�Ľ��д���豸����ȡʱҲ���Ȳ���Ѳ鵽�����ݴ�ӡ����ʾ�豸�ϣ�getBytes()��ʹ��Ĭ�ϵ��ַ�������ת����getBytes(��utf-8��)��ʹ��UTF-8��������ת����\r\n" + 
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
