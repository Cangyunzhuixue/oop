package elemOfopp.day12.String;
/*
 * 
public int length()
public char charAt(int index)����ָ��λ�õ��ַ���
public boolean equals(Object anObject)�Ƚ��ַ����Ƿ����
public int compareTo(String anotherString)
public int indexOf(String s)
public int indexOf(String s ,int startpoint)
public int lastIndexOf(String s)
public int lastIndexOf(String s ,int startpoint)
public boolean startsWith(String prefix)
public boolean endsWith(String suffix)
public boolean regionMatches(int firstStart,String other,int otherStart ,int length)

 */
import org.junit.Test;

public class TestString {
@Test
public void test() {
	String str1="abcd";
	String str2="abcdefghi";
	System.out.println(str1.length());
	System.out.println(str1.charAt(1));
	System.out.println(str1.equals(str2));
}

}
