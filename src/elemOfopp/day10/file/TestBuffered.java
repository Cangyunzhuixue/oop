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



import org.junit.Test;

public class TestBuffered {
	@Test
public void testBufferedInputOutputStream() {
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	try {
		File file1=new File("1.jpg");
		File file2=new File("2.jpg");
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream(file2);
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		byte[] bs=new byte[1024];
		int len ;
		while ((len=bis.read(bs))!=-1){
		bos.write(bs,0,len);
		bos.flush();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if (bis!=null) {
			try {
				bis.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (bos!=null) {
			try {
				bos.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
	@Test
	public void testBufferedReader() {
		BufferedReader bis=null;
		BufferedWriter bWriter=null;
		try {
			File file=new File("demo1.html");
			File file2=new File("demo3.html");
			FileReader fr=new FileReader(file);
			FileWriter fw=new FileWriter(file2);
			 bis=new BufferedReader(fr);
			 bWriter=new BufferedWriter(fw);
			/*char[] c=new char[1024];
			int len;
			while ((len=bis.read(c))!=-1) {
				String string =new String(c, 0, len);
				System.out.println(string);
			}*/
			 String string=null;
			 while((string=bis.readLine())!=null) {
				 bWriter.write(string);
				 bWriter.newLine();
			 }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bWriter!=null) {
				try {
					bWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
