package elemOfopp.day14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TestTcp1 {
	@Test
	public void client() {
		Socket socket = null;
		OutputStream os = null;
		InputStream is= null;
		try {
			socket = new Socket("127.0.0.1", 9090);
			os = socket.getOutputStream();
			os.write("samuro coming".getBytes());
			socket.shutdownOutput();
			is=socket.getInputStream();
			byte[] b=new byte[20];
			int len;
			while ((len = is.read(b)) != -1) {
				String string = new String(b, 0, len);
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
			if (is != null) {
				try {
					is.close();
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
		OutputStream os=null;
		try {
			ss = new ServerSocket(9090);
			socket = ss.accept();
			is = socket.getInputStream();
			os=socket.getOutputStream();
			byte[] b = new byte[20];
			int len;
			while ((len = is.read(b)) != -1) {
				String string = new String(b, 0, len);
				System.out.println(string);
			}
			os.write("geted!".getBytes());
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
			if (os != null) {
				try {
					os.close();
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
		}
	}
}
