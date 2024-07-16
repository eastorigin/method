package method;

import java.util.Scanner;

/**
 * <pre> 
 * pre가 없으면 내용이 한 줄로 나옴
 * 
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 
 * 빼기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 차를 출력
 * 
 * 곱하기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 곱을 출력
 * 
 * 나누기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수를 나눈 몫을 출력
 * 
 * main(String[] args) 메소드에서 호출
 * </pre>
 */
public class SimpleCalculator { // 반환하지 않은 목적은 메소드 내부에서 출력시키고 싶어서
	
	public static void add (int number1, int number2) {
		System.out.println(number1 + number2);
	}
	
	public static void minus (int number1, int number2) {
		System.out.println(number1 - number2);
	}
	
	public static void multiple (int number1, int number2) {
		System.out.println(number1 * number2);
	}
	
	public static void divide(int number1, int number2) {
		System.out.println(number1 / number2);
	}
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		int number1 = keyboard.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요");
		int number2 = keyboard.nextInt();
		
		add(number1, number2);
		minus(number1, number2);
		multiple(number1, number2);
		divide(number1, number2);
	}
}
