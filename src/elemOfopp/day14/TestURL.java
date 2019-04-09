package elemOfopp.day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestURL{
public static void main(String[] args) throws Exception {
	URL url=new URL("http://localhost:8080/examples/first.html");
	/* public String getProtocol(  )     ��ȡ��URL��Э����
		public String getHost(  )           ��ȡ��URL��������
		public String getPort(  )            ��ȡ��URL�Ķ˿ں�
		public String getPath(  )           ��ȡ��URL���ļ�·��
		public String getFile(  )             ��ȡ��URL���ļ���
		public String getRef(  )             ��ȡ��URL���ļ��е����λ��
		public String getQuery(   )        ��ȡ��URL�Ĳ�ѯ��*/
	InputStream is=null;
	try {
		is = url.openStream();
		byte[] bs = new byte[1024];
		int len;
		while ((len = is.read(bs)) != -1) {
			String string = new String(bs, 0, len);
			System.out.println(string);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if (is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	URLConnection urlConn=null;
	FileOutputStream fileOutputStream=null;
	InputStream is1=null;
	try {
		urlConn = url.openConnection();
		is1 = urlConn.getInputStream();
		fileOutputStream = new FileOutputStream("demo1.html");
		byte[] b1 = new byte[20];
		int len1;
		while ((len1 = is1.read(b1))!=-1) {
			fileOutputStream.write(b1, 0, len1);
		} 
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		
		is1.close();
		fileOutputStream.close();
	}
}
}
