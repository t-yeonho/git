package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * 문제!
		 * str = "abcdefghijk"
		 * 
		 * 출력
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 * 
		 */
		
		String str = "abcdefghijksldnkflskdfnklsdfnlksdfnlskdfnlskdfnlk";
		
		for(int i = 0; i < str.length(); i++) {
			String substr = str.substring(i, i+1);
			System.out.println(substr);
		}
		
		
	}

}



















