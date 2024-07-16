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
		// return processTime - getMinutes(145) * CHANGE;
		return processTime % CHANGE;
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
	
	public static double getAverage(int sum, int subjectCount) {
		return (double) sum / subjectCount;
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
	
	public static String getGrade (double average) {
		String grade = "";
		
		if (average >= 95) {
			grade = "A+";
		}else if (average >= 90) {
			grade = "A";
		}else if (average >= 85) {
			grade = "B+";
		}else if (average >= 80) {
			grade = "B";
		}else if (average >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		return grade;
	}
	
	public static int getFlightFee (int age) {
		final int ADULT_ONE_WAY_FLIGHTFARE = 300000;
		final int KID_ONE_WAY_FLIGHTFARE = 120000;
		final int ADULT_AGE = 19;
		
		if (age >= ADULT_AGE) {
			return ADULT_ONE_WAY_FLIGHTFARE;
		}else {
			return KID_ONE_WAY_FLIGHTFARE;
		}
		
		// System.out.println("~~~"); // return 이후로는 쓸 수 없다.
		// else if로 작성하면 return 이후가 에러가 안 나는데 getFlightFee가 에러가 난다. else인 경우가 없어서.
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
		
		int minute = 5;
		int second = 50;
		
		int time = getTime(minute, second);
		System.out.println(time + "초");
		
		
		
		int processTime = 145;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		System.out.println(minutes + "분 " + seconds + "초");
		
		
		
		int celsius = 30;
		int fahrenheit = getFahrenheit(celsius);
		System.out.println(fahrenheit + "F");
		
		
		
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		int sumScore = getSumScore(korScore, engScore, mathScore, progScore);
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
