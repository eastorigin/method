package method;
/**
 * <pre> 
 * pre가 없으면 내용이 한 줄로 나옴
 * 
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 합을 반환
 * 
 * 빼기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 차를 반환
 * 
 * 곱하기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수의 곱을 반환
 * 
 * 나누기 연산이 가능
 * 		- 두 숫자를 파라미터로 받아서 두 수를 나눈 몫을 반환
 * 
 * main(String[] args) 메소드에서 호출 하여 반환된 값을 출력
 * </pre>
 */
public class ReturnedSimpleCalculator { // 계산만 해주고 출력은 main에 하고 싶어서
	
	public static int getAddNumber (int number1, int number2) {
		return number1 + number2;
	}
	
	public static int getMinusNumber (int number1, int number2) {
		return number1 - number2;
	}
	
	public static int getMultipleNumber (int number1, int number2) {
		return number1 * number2;
	}
	
	public static int getDevideNumber (int number1, int number2) {
		return number1 / number2;
	}
	
	public static void main (String[] args) {
		int result = getAddNumber(4, 8);
		int result2 = getMinusNumber(4, 8);
		int result3 = getMultipleNumber(4, 8);
		int result4 = getDevideNumber(4, 8);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
