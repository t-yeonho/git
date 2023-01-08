package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MiN_NUMBER = 0;
//		바뀌지 말아야할 상수는 앞에 final 을 써주면 됨.
		
		int number = 10;
		
		number = 11;
		System.out.println("최댓값: " + MAX_NUMBER);
		System.out.println("최솟값: " + MiN_NUMBER);
		System.out.println("현재값: " + number);
		
	}

}
