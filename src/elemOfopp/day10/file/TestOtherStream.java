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
 * 转换流：InputStreamReader,OutputDtreamWriter
 * 编码：字符串--->字节数组
 * 解码：字节数组--->字符串
 */
import org.junit.Test;

public class TestOtherStream {
	/*
	 * 标准输出流:system.out
	 * 将键盘输入字符串，将输入到键盘的郑航字符串转成大写输出，然后继续输入
	 * 直到遇到exit
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
				System.out.println("请输入：");
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
