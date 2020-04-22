package kr.ac.jinwoo.day06.homework;

/**
 * 아이스크림의 정보를 담는 클래스
 * 
 * @author Park Jinwoo
 *
 */

public class IcecreamDoc {
	
	private String name;
	private int price;
	
	/**
	 * Getter name
	 * 
	 * @return this.name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter name
	 * 
	 * @param name this.name에 저장할 문자열
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter price
	 * 
	 * @return this.price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Setter price
	 * 
	 * @param price this.price에 저장할 정수
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
}
