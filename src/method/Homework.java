package method;

import java.util.Scanner;

public class Homework {
	
	/*
	 * 1. 코드 작성
	 * 2. 테스트 (단위 테스트)
	 * 		- 부정 테스트 (내가 의도한 대로 동작이 안 되는지 체크)
	 * 			- operator가 "exit"일 때, 정상적으로 종료가 되는가?
	 * 		- 긍정 테스트 (내가 의도한 대로 동작이 되는지 체크)
	 */
	
	// 문제 1번
	public static void calculator (String operator, int number1, int number2) {
		if(operator.equals("+")) {
			System.out.println(number1 + number2);
		}else if(operator.equals("-")) {
			System.out.println(number1 - number2);
		}else if(operator.equals("*")) {
			System.out.println(number1 * number2);
		}else if(operator.equals("/")) {
			if(number2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			}else {
				System.out.println(number1 / number2);
			}
		}else {
			System.out.println("정확한 연산 기호를 입력하세요");
		}
	}
	
	// 문제 2번
	public static void primeNumber (int number1) {
		int divisorCount = 0;
		int primeNumberCount = 0;
		for(int i = 2; i < number1 + 1; i++) {
			divisorCount = 0;
			for(int j = 1; j < i + 1; j++) {
				if(i % j == 0) {
					divisorCount++;
				}
			}
			if(divisorCount == 2) {
				primeNumberCount++;
				// divisorCount = 0;
			}
//			else {
//				divisorCount = 0;
//			}
		}
		System.out.println("1~" + number1 + " 사이에 소수의 개수: " + primeNumberCount + "개");
	}
	
	
	// 문제 3번
	public static String isPrimeNumber (int number1) {
		String stringPrimeNumber = "";
		int divisorCount = 0;
		for(int i = 1; i < number1 + 1; i++) {
			if(number1 % i == 0) {
				divisorCount++;
			}
		}
		if(divisorCount == 2) {
			stringPrimeNumber = "true";
		}else {
			stringPrimeNumber = "false";
		}		
		return stringPrimeNumber;
	}
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("연산 기호를 입력하세요");
			System.out.println("종료를 원할시 exit를 입력해주세요");
			String calculate = keyboard.nextLine();
			if(calculate.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("첫 번째 숫자를 입력하세요");
				int number1 = keyboard.nextInt();
				System.out.println("두 번째 숫자를 입력하세요");
				int number2 = keyboard.nextInt();
				calculator(calculate, number1, number2);
				keyboard.nextLine();
			}
		}
		primeNumber(10000);
		System.out.println("원하는 숫자를 입력하시면 소수인지 판단해드립니다");
		System.out.println("숫자를 입력하세요");
		int inputPrimeNumber = keyboard.nextInt();
		System.out.println(isPrimeNumber(inputPrimeNumber));
	}
}
