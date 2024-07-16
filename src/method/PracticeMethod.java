package method;

public class PracticeMethod {
	
	public static int getTime (int minutes, int seconds) {
		final int CHANGE = 60;
		return minutes * CHANGE + seconds;
	}
	
	public static int getMinutes (int processTime) {
		final int CHANGE = 60;
		return processTime / CHANGE;
	}
	
	public static int getSeconds (int processTime) {
		final int CHANGE = 60;
		return processTime - getMinutes(145) * CHANGE;
	}
	
	public static int getFahrenheit (int celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	public static int getSumScore (int korScore, int engScore, int mathScore, int progScore) {
		return korScore + engScore + mathScore + progScore;
	}
	
	public static int getAverageScore (int sumScore, int subjects) {
		return sumScore / subjects;
	}
	
	public static void getGrade (int averageScore) {
		if (averageScore >= 95) {
			System.out.println("A+");
		}else if (averageScore >= 90) {
			System.out.println("A");
		}else if (averageScore >= 85) {
			System.out.println("B+");
		}else if (averageScore >= 80) {
			System.out.println("B");
		}else if (averageScore >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
	}
	
	public static int getFlightFee (int age) {
		int adultOneWayFlightFare = 300000;
		int kidOneWayFlightFare = 120000;
		
		if (age >= 19) {
			return adultOneWayFlightFare;
		}else {
			return kidOneWayFlightFare;
		}
	}
	
	public static void getTrip(int totalFee) {
		final int MONEY = 1000000;
		if(totalFee <= MONEY) {
			System.out.println("여행 가자!");
		}else {
			System.out.println("다음에 가자");
		}
	}
	
	
	public static void main (String[] args) {
		int time = getTime(5, 50);
		System.out.println(time + "초");
		
		
		
		
		int minutes = getMinutes(145);
		int seconds = getSeconds(145);
		System.out.println(minutes + "분 " + seconds + "초");
		
		
		
		
		int fahrenheit = getFahrenheit(30);
		System.out.println(fahrenheit + "F");
		
		
		
		
		int sumScore = getSumScore(90, 88, 70, 80);
		System.out.println("총점: " + sumScore + "점");
		
		int averageScore = getAverageScore(sumScore, 4);
		System.out.println("평균: " + averageScore + "점");
		
		getGrade(averageScore);
		
		
		
		int father = getFlightFee(42);
		int mother = getFlightFee(36);
		int daughter = getFlightFee(11);
		
		int totalFee = father + mother + daughter;
		
		getTrip(totalFee);
	}
}
