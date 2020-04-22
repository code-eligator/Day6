package kr.ac.jinwoo.day06.homework;

public class StringUtil {
	
	public char[] stringCopyToChar(String str) {
		char[] ret;
		ret = new char[str.length()];
		str.getChars(0, str.length(), ret, 0);
		
		return ret;
	}
	
	public char convertChar(char c) {
		if(isUpperChar(c))
			c += 32;
		else if(isLowerChar(c))
			c -= 32;
		return c;
	}
		
	////////////////////////////////////////////////////////
	
	public boolean isUpperChar(char c) {
		return ('A' <= c && c <= 'Z') ? true : false;
	}

	public boolean isLowerChar(char c) {
		return ('a' <= c && c <= 'z') ? true : false;
	}
	
	public int max(int i, int j) {
		return (i > j) ? i : j;
	}
	
	public int min(int i, int j ) {
		return (i < j) ? i : j;
	}
	
	public String reverseString(String str) {

		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = chArr.length-1; i >= 0; i--)
			ret += chArr[i];
		
		return ret;
	}
	
	public String toUpperString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isUpperChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
	 
	public String toLowerString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isLowerChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
}
