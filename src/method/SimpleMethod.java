package method;

public class SimpleMethod {
	
	public static void greeting() {
		System.out.println("Hello, Method");
	}
	
	public static void addNumber() {
		int numberOne = 10;
		int numberTwo = 30;
		System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
	}
	
	public static void gugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}

	public static void main (String[] args) {
		
		gugudan();
		
		greeting();
		greeting();
		greeting();
		greeting();
		greeting();
		greeting();
		
		addNumber();
		
		for(int i = 0; i < 5; i++) {
			addNumber();
		}
	}
}
