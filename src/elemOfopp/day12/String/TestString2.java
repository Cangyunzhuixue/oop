package elemOfopp.day12.String;

import java.util.ArrayList;

import java.util.List;

/*
 * public String substring(int startpoint)返回startpoint之后的字符串
public String substring(int start,int end)返回start开始end结束的字符串，左开右闭
pubic String replace(char oldChar,char newChar)
public String replaceAll(String old,String new)
public String trim()去除当前字符串中首尾出现的空格
public String concat(String str)链接当前字符串喝str
public String[] split(String regex)将按照regex吧当前字符串拆分成多个字符串

 */

public class TestString2 {
	public static void main(String[] args) {
		testMaxString("abcdefgabcdhibbbcjklmn","abcdefgytdb");
		

	}

	// 指定部分逆转
	public static void testResver(String string, int start, int end) {
		string.trim();
		char[] ch = string.toCharArray();
		while (end > start) {
			char temp = ch[end];
			ch[end] = ch[start];
			ch[start] = temp;
			start++;
			end--;
		}
		String string2 = new String(ch);
		System.out.println(string2);
	}

	// 取出首尾空格
	public static void testTrim(String string) {
		int st = 0;
		int end = string.length();
		System.out.println(end);
		char[] value = string.toCharArray();
		while (st < end && value[st] <= ' ') {// 最小了
			st++;
		}
		System.out.println(st + " " + end);
		while (st < end && value[end - 1] <= ' ') {
			end--;
		}
		String string2 = string.substring(st, end);
		System.out.println("---" + string2 + "----");
	}

	// 指定次数
	public static void testCount(String string, String desString) {
		int index = 0;// 每次开始寻找的位置
		int num = 0;
		while (index <= string.length()) {
			int i = string.indexOf(desString, index);//
			if (i >= 0) {
				System.out.println(i);
				index = desString.length() + i;
				System.out.println(index + "#");
				num++;
			} else {
				break;
			}
		}
		System.out.println(num);
	}
	//求最大子串
	public static void testMaxString(String string,String otherstring) {
		
		int maxlength=0;
		List<String> list=new ArrayList<>();
		
		for (int i = 0; i < otherstring.length(); i++) {
			for (int j = i+1; j <=otherstring.length(); j++) {
				String string2=otherstring.substring(i, j);
				list.add(string2);
			}
		}
		for(String l:list) {	
			
			if ((string.indexOf(l))>=0) {
				maxlength=(maxlength>l.length())?maxlength:l.length();
			}
			
		}
		for(String l:list) {
			if (l.length()==maxlength&&(string.indexOf(l))>=0) {
			System.out.println(l);
			}
		}
	}
}
