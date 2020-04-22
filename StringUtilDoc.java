package kr.ac.jinwoo.day06.homework;

/**
 *  <br>아래의 내용을 포함하는 StringUtil 클래스를 작성합니다.
 *
 *   <br>
 *   <br>1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 isUpperChar(char c) 메소드
 *   <br>2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드
 *   <br>3. 두개의 숫자를 입력받아 큰 수를 반환하는 max(int i, int j) 메소드
 *   <br>4. 두개의 숫자를 입력받아 작은 수를 반환하는 min(int i, int j) 메소드
 *   <br>5. 문자열을 입력받아 거꾸로 변경하는 reverseString(String str) 메소드
 *   <br>6. 문자열을 입력받아 대문자로 변경하는 toUpperString(String str) 메소드
 *   <br>7. 문자열을 입력받아 소문자로 변경하는 toLowerString(String str) 메소드
 * 
 * @author Park Jinwoo
 *
 */

public class StringUtilDoc {
	
	/**
	 * parameter str을 char형 배열로 변환하여 리턴하는 메소드
	 * 
	 * @param str char형 배열로 변환하고 싶은 String 문자열
	 * @return 변환된 char형 배열
	 */
	public char[] stringCopyToChar(String str) {
		char[] ret;
		ret = new char[str.length()];
		str.getChars(0, str.length(), ret, 0);
		
		return ret;
	}
	
	/**
	 * parameter c가 대문자이면 소문자로, 소문자이면 대문자로 변환하는 메소드
	 * 대문자, 소문자에 속해있지 않다면 c를 변환없이 그대로 리턴
	 * 
	 * @param c 대문자, 소문자로 변환하고 싶은 문자
	 * @return 변환된 문자. 대문자도 소문자도 아니라면 인자 그대로를 변환없이 리턴
	 */
	public char convertChar(char c) {
		if(isUpperChar(c))
			c += 32;
		else if(isLowerChar(c))
			c -= 32;
		return c;
	}
		
	/**
	 * 하나의 문자를 입력받아 해당 문자가 대문자이면 true를 반환하는 메소드
	 * 
	 * @param c 대문자인지 확인할 문자
	 * @return 대문자이면 true, 그 외에는 false
	 */
	public boolean isUpperChar(char c) {
		return ('A' <= c && c <= 'Z') ? true : false;
	}
	

	/**
	 * 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 메소드
	 * 
	 * @param c 소문자인지 확인할 문자
	 * @return 소문자이면 true, 그 외에는 false
	 */
	public boolean isLowerChar(char c) {
		return ('a' <= c && c <= 'z') ? true : false;
	}
	
	/**
	 * 두개의 숫자를 입력받아 큰 수를 반환하는 메소드
	 * 
	 * @param i data1
	 * @param j data2
	 * @return 입력받은 두 수 중 큰 수
	 */
	public int max(int i, int j) {
		return (i > j) ? i : j;
	}
	
	/**
	 * 두개의 숫자를 입력받아 작은 수를 반환하는 메소드
	 * 
	 * @param i data1
	 * @param j data2
	 * @return 입력받은 두 수 중 작은 수
	 */
	public int min(int i, int j ) {
		return (i < j) ? i : j;
	}
	
	/**
	 * 문자열을 입력받아 거꾸로 변경하는 메소드
	 * 
	 * @param str 거꾸로 변환할 문자열
	 * @return 거꾸로 변환된 문자열
	 */
	public String reverseString(String str) {

		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = chArr.length-1; i >= 0; i--)
			ret += chArr[i];
		
		return ret;
	}
	
	/**
	 * 문자열을 입력받아 대문자로 변경하는 메소드
	 * 
	 * @param str 대문자로 변환할 문자열
	 * @return 대문자로 변환된 문자열
	 */
	public String toUpperString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isUpperChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
	 
	/**
	 * 문자열을 입력받아 소문자로 변경하는 메소드
	 * 
	 * @param str 소문자로 변환할 문자열
	 * @return 소문자로 변환된 문자열
	 */
	public String toLowerString(String str) {
		
		char[] chArr = stringCopyToChar(str);
		String ret = "";
		
		for(int i = 0; i < chArr.length; i++)
			ret += (isLowerChar(chArr[i]) ? convertChar(chArr[i]) : chArr[i]);
		
		return ret;
	}
}
