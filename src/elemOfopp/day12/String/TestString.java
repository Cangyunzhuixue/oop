package elemOfopp.day12.String;
/*
 * 
public int length()
public char charAt(int index)����ָ��λ�õ��ַ���
public boolean equals(Object anObject)�Ƚ��ַ����Ƿ����
public int compareTo(String anotherString)
public int indexOf(String s)����s�״γ��ֵ�λ�ã�û���򷵻�-1
public int indexOf(String s ,int startpoint)����s�ַ�����stapoint��ʼ�״γ��ֵ�λ��
public int lastIndexOf(String s)
public int lastIndexOf(String s ,int startpoint)
public boolean startsWith(String prefix)�ж��Ƿ���pre��ʼ
public boolean endsWith(String suffix)
public boolean regionMatches(int firstStart,String other,int otherStart ,int length)
�жϵ�ǰ�ַ�����firstStar��ʼ�ĵ��Ӵ�����һ���ַ�����otherstart��ʼ��length�����Ƿ����
 */
import org.junit.Test;

public class TestString {
@Test
public void test() {
	String str1="abcbcd";
	String str2="zbcdefghi";
	System.out.println(str1.length());
	System.out.println(str1.charAt(1));
	System.out.println(str1.equals(str2));
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.indexOf("cd"));
	System.out.println(str2.indexOf("d", 2)+"**");
	System.out.println(str1.lastIndexOf("b"));
	System.out.println(str1.startsWith("ab"));
	System.out.println(str1.regionMatches(3, str2, 1, 2));
}

}
