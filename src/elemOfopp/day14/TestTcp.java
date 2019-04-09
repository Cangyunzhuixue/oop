package elemOfopp.day14;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.junit.Test;
public class TestTcp {
	@Test
	public void client() {
		Socket socket = null;
		OutputStream oStream = null;
		try {
			// TODO Auto-generated constructor stub
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 9093);
			oStream = socket.getOutputStream();
			oStream.write("¿Í»§¶Ë".getBytes());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (oStream != null) {
				try {
					oStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
	@Test
	public void server() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream inputStream = null;
		try {
			serverSocket = new ServerSocket(9093);
			socket = serverSocket.accept();
			inputStream = socket.getInputStream();
			byte[] bs = new byte[20];
			int len;
			while ((len = inputStream.read(bs)) != -1) {
				String string = new String(bs, 0, len);
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (serverSocket != null) {
				try {
					serverSocket.close();
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
