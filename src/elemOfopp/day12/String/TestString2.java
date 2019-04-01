package elemOfopp.day12.String;

import java.util.ArrayList;

import java.util.List;

/*
 * public String substring(int startpoint)����startpoint֮����ַ���
public String substring(int start,int end)����start��ʼend�������ַ��������ұ�
pubic String replace(char oldChar,char newChar)
public String replaceAll(String old,String new)
public String trim()ȥ����ǰ�ַ�������β���ֵĿո�
public String concat(String str)���ӵ�ǰ�ַ�����str
public String[] split(String regex)������regex�ɵ�ǰ�ַ�����ֳɶ���ַ���

 */

public class TestString2 {
	public static void main(String[] args) {
		testMaxString("abcdefgabcdhibbbcjklmn","abcdefgytdb");
		

	}

	// ָ��������ת
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

	// ȡ����β�ո�
	public static void testTrim(String string) {
		int st = 0;
		int end = string.length();
		System.out.println(end);
		char[] value = string.toCharArray();
		while (st < end && value[st] <= ' ') {// ��С��
			st++;
		}
		System.out.println(st + " " + end);
		while (st < end && value[end - 1] <= ' ') {
			end--;
		}
		String string2 = string.substring(st, end);
		System.out.println("---" + string2 + "----");
	}

	// ָ������
	public static void testCount(String string, String desString) {
		int index = 0;// ÿ�ο�ʼѰ�ҵ�λ��
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
	//������Ӵ�
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
