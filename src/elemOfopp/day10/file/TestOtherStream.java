package elemOfopp.day10.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * ת������InputStreamReader,OutputDtreamWriter
 * ���룺�ַ���--->�ֽ�����
 * ���룺�ֽ�����--->�ַ���
 */
import org.junit.Test;

public class TestOtherStream {
	/*
	 * ��׼�����:system.out
	 * �����������ַ����������뵽���̵�֣���ַ���ת�ɴ�д�����Ȼ���������
	 * ֱ������exit
	 */
	@Test
	public void test() {
		BufferedReader  bReader=null;
		try {
			InputStream iStream=System.in;
			InputStreamReader inputStreamReader=new InputStreamReader(iStream);
			bReader=new BufferedReader(inputStreamReader);
			String string;
			while(true) {
				System.out.println("�����룺");
				string=bReader.readLine();
				if(string.equalsIgnoreCase("e")||string.equalsIgnoreCase("exit")) {
					break;
				}
				String str1=string.toUpperCase();
				System.out.println(str1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (bReader!=null) {
				try {
					bReader.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	
	
@Test 
public void testTransferStream(){
	BufferedReader br=null;
	BufferedWriter bw=null;
	try {
		File file =new File("demo1.html");
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		 br=new BufferedReader(isr);
		
		File file2=new File("demo4.html");
		FileOutputStream fos=new FileOutputStream(file2);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "GBK");
		 bw=new BufferedWriter(osw);
		String str;
		while ((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(br!=null) {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(bw!=null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
