package method;

import java.util.Scanner;

public class Equals {
	public static void main (String[] args) {
		/**
		 * 비교 연산자: 숫자만 처리 가능!
		 * ==
		 * !=
		 * >=
		 * <=
		 * >
		 * <
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("문자를 입력하세요!");
		String operator = keyboard.nextLine();
		
		System.out.println("입력한 값은 " + operator + " 입니다.");
		
		System.out.println(operator == "+"); // false
		// 문자열 비교
		
		System.out.println(operator.equals("+")); // true
	}
}
