package kr.ac.jinwoo.day06.homework;

/**
 * 사칙연산을 수행하는 클래스
 * 
 * @author Park Jinwoo
 *
 */

public class CalculatorDoc {

	private int num1 = 0;
	private int num2 = 0;
	
	/**
	 * Setter num1
	 * 
	 * @param n 사칙연산을 수행할 좌항의 정수
	 */
	public void setNum1(int n) {
		num1 = n;
	}
	
	/**
	 * Setter num2
	 * 
	 * @param n 사칙연산을 수행할 우항의 정수
	 */
	public void setNum2(int n) {
		num2 = n;
	}
	
	/**
	 * Getter num1
	 * 
	 * @return this.num1
	 */
	public int getNum1() {
		return num1;
	}
	
	/**
	 * Getter num2
	 * 
	 * @return this.num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * 두 수의 합을 반환하는 메소드
	 * 
	 * @return 두 정수의 합
	 */
	public int sum() { return num1 + num2; }
	
	/**
	 * 두 수의 차(num1 - num2)를 반환하는 메소드
	 * 
	 * @return 두 정수의 차(num1 - num2)
	 */
	public int sub() { return num1 - num2; }
	
	/**
	 * 두 수의 곱을 반환하는 메소드
	 * 
	 * @return 두 수의 곱
	 */
	public int mul() { return num1 * num2; }
	
	/**
	 * 두 수의 나누기 연산의 값을 반환하는 메소드
	 * 
	 * @return 두 수의 나눗셈 결과
	 */
	public double div() { return (double)num1 / (double)num2; }
	
	/**
	 * 전달인자 n이 소수인지 판단하는 메소드
	 * 
	 * @param n 소수인지 확인하고 싶은 정수
	 * @return n이 소수면 true 아니면 false
	 */
	public boolean isPrime(int n) {
		boolean ret = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				ret = false;
				i = n;	// break;
			}
		}
		return ret; 
	}
}
