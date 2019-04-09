package elemOfopp.day12.String;
/*
 * 
public int length()
public char charAt(int index)返回指定位置的字符。
public boolean equals(Object anObject)比较字符串是否相等
public int compareTo(String anotherString)
public int indexOf(String s)返回s首次出现的位置，没有则返回-1
public int indexOf(String s ,int startpoint)返回s字符串从stapoint开始首次出现的位置
public int lastIndexOf(String s)
public int lastIndexOf(String s ,int startpoint)
public boolean startsWith(String prefix)判断是否以pre开始
public boolean endsWith(String suffix)
public boolean regionMatches(int firstStart,String other,int otherStart ,int length)
判断当前字符串从firstStar开始的的子串和另一个字符串从otherstart开始，length长的是否相等
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
/*
 * 1.字符串 与基本数据类型、包装类之间转换
 * ①字符串 --->基本数据类型、包装类:调用相应的包装类的parseXxx(String str);
 * ①基本数据类型、包装类--->字符串:调用字符串的重载的valueOf()方法
 * 
 * 2.字符串与字节数组间的转换
 * ①字符串---->字节数组:调用字符串的getBytes()
 * ②字节数组---->字符串：调用字符串的构造器
 * 
 * 3.字符串与字符数组间的转换
 * ①字符串---->字符数组：调用字符串的toCharArray();
 * ②字符数组---->字符串:调用字符串的构造器
 */
@Test
public void test1() {
	
	//字符串与基本数据类型、包装类之间的转换
	String str1="23";
	int i=Integer.parseInt(str1);
	
	String str2=i+"";
	str2=String.valueOf(str2);
	//字符串与字节数组之间的转换
	String string="abc123";
	byte[] bs=str1.getBytes();
	
	
}

}
