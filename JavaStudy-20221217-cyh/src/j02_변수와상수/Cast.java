package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		
		double c = b;
		
		
		System.out.println(b);
		System.out.println(c);
//		업캐스팅- 명시안해줘도됨.
		
//		int d = c;
		
		int d = (int) c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);
//		()를 붙여줘서 다운캐스팅 해주는 것.
//		다운캐스팅은 꼭 명시를 해줘야함.

		
	}

}
