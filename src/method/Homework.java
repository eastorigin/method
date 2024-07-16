package method;

import java.util.Scanner;

public class Homework {
	// 문제 1번
	public static void calculator (String operator, int number1, int number2) {
		if(operator.equals("+")) {
			System.out.println(number1 + number2);
		}else if(operator.equals("-")) {
			System.out.println(number1 - number2);
		}else if(operator.equals("*")) {
			System.out.println(number1 * number2);
		}else if(operator.equals("/")) {
			System.out.println(number1 / number2);
		}else {
			System.out.println("정확한 연산 기호를 입력하세요");
		}
	}
	
	// 문제 2번
	public static void primeNumber (int number1) {
		int check = 0;
		int answer = 0;
		for(int i = 2; i < number1 + 1; i++) {
			for(int j = 1; j < i + 1; j++) {
				if(i % j == 0) {
					check++;
				}
			}
			if(check == 2) {
				answer++;
				check = 0;
			}else {
				check = 0;
			}
		}
		System.out.println(answer + "개");
	}
	
	
	// 문제 3번
	public static String isPrimeNumber (int number1) {
		String booleanPrimeNumber = "";
		int check = 0;
		for(int i = 1; i < number1 + 1; i++) {
			if(number1 % i == 0) {
				check++;
			}
			if(check == 2) {
				booleanPrimeNumber = "true";
			}else {
				booleanPrimeNumber = "false";
			}
		}
		return booleanPrimeNumber;
	}
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("연산자를 입력하세요");
			String calculate = keyboard.nextLine();
			if(calculate.equals("exit")) {
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
		primeNumber(10);
		System.out.println(isPrimeNumber(13));
	}
}
