package elemOfopp.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TestTcp2 {
	@Test
	public void client() {
		Socket socket = null;
		OutputStream os = null;
		FileInputStream fis = null;
		InputStream iStream = null;
		try {
			socket = new Socket("127.0.0.1", 9999);
			os = socket.getOutputStream();
			fis = new FileInputStream(new File("1.jpg"));
			byte[] bs = new byte[1024];
			int len;
			while ((len = fis.read(bs)) != -1) {
				os.write(bs, 0, len);
			}
			socket.shutdownOutput();
			iStream = socket.getInputStream();
			byte[] bs2 = new byte[1024];
			int len1;
			while ((len1 = iStream.read(bs2)) != -1) {
				String string = new String(bs2, 0, len1);
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (iStream != null) {
				try {
					iStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

	@Test
	public void server() {
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		FileOutputStream fos = null;
		OutputStream oStream = null;
		try {
			ss = new ServerSocket(9999);
			socket = ss.accept();
			is = socket.getInputStream();
			fos = new FileOutputStream(new File("3.jpg"));
			byte[] bs = new byte[1024];
			int len;
			while ((len = is.read(bs)) != -1) {
				fos.write(bs, 0, len);
			}
			oStream = socket.getOutputStream();
			oStream.write("“— ’µΩ".getBytes());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (ss != null) {
				try {
					ss.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (oStream != null) {
				try {
					oStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
