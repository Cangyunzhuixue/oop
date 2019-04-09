package elemOfopp.day14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
public static void main(String[] args) throws UnknownHostException {
	InetAddress inetAddress=InetAddress.getByName("www.baicu.com");
	System.out.println(inetAddress);
	System.out.println(inetAddress.getHostName());
	System.out.println(inetAddress.getHostAddress());
	InetAddress inetAddress2=InetAddress.getLocalHost();
	System.out.println(inetAddress2);
	System.out.println(inetAddress2.getHostName());
	System.out.println(inetAddress.getHostAddress());
}
}
