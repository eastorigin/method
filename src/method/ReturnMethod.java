package method;

import java.util.Random;

public class ReturnMethod {
	
	public static int getRandomNumber() {
		// 무언가를 반환시킬 때에는 이름을 get으로 시작한다
		Random random = new Random();
		// return 키워드의 역할
		// 1. 값을 반환시킨다
		// 2. 메소드(getRandomNumber)를 종료시킨다
		return random.nextInt();
		
		// System.out.println("~~~~"); // Dead code, return 이후는 종료되서 실행될 수 없음.
	}
	
	public static void main (String[] args) {
		int randomNumber = getRandomNumber(); // 묵시적 형변환이 가능하여 long으로 해도 가능, 오른족에 있는 것이 먼저 실행됨
		System.out.println(randomNumber);
	}
}
