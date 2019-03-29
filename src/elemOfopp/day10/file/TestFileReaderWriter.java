package elemOfopp.day10.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
/*
 * 对于非文本类的文件（视频，音频，图片），只能用字节流
 */


public class TestFileReaderWriter {
	@Test
	public void TestFileReader() {
		File file = new File("demo3.html");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			char[] c = new char[24];
			int len;
			while ((len = fr.read(c)) != -1) {
				String str = new String(c, 0, len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void TestFileWriter() {
	    FileReader fr=null;
	    FileWriter fw=null;
	    try {
	    	File file1=new File("demo1.html");
	    	File file2=new File("demo2.html");
	    	fr=new FileReader(file1);
	    	fw=new FileWriter(file2);
	    	int len;
	    	char[] c=new char[24];
	    	while((len=fr.read(c))!=-1) {
	    	
	    		fw.write(c,0,len);
	    		
	    	}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				try {
					fr.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
