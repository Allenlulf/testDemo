package com.niuke.jzoffer;

/**
 * 替换空格
 * @author lulf
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class THKG {
	public static void main(String[] args) {
		System.out.println(replaceStr(new StringBuffer("We Are Happy")));

	}
	
	public static String replaceStr(StringBuffer sb){
		String value=sb.toString();
		value=value.replace(" ", "%20");
		return value;
	}
}
