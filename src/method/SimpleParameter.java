package method;

public class SimpleParameter {
	
	public static void printHello(String name, String message) { // 매 타입마다 타입을 다 적어줘야 함
		System.out.println(name + "씨, " + message);
	}
	
	public static void main (String[] args) {
		
		printHello("까칠이", "안녕하세요?");
		printHello("기쁨이", "반갑습니다");
		printHello("불안이", "졸리다");
		printHello("따분이", "피곤하다");
		printHello("부럽이", "잘가");
		
	}
}
