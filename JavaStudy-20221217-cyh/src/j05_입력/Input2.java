package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		/*
		 * 문제!
		 * Scanner
		 * 입력
		 * 
		 * 이름 : 최연호 	 next()		변수명 : name
		 * 생일 : 624		nextInt()			birth
		 * 주소 : 부산 진구 가야동	nextLine()	address
		 * 연락처 : 010-3300-4698 	next()		phone
		 * 
		 * 출력
		 * 사용자의 이름은 최연호이고 생일은 624입니다
		 * 주소는 부산 진구 가야동에 거주중입니다.
		 * 연락처는 010-3300-4698
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int birth = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("생일: ");
		birth = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		/*
		 *  scanner.nextLine() : 넥스트 라인 전에는 엔터를 먹을 수 있는 
		 *  넥스트 라인을 적어줘야 함.
		 */
		
		

		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 생일은 " + birth + " 입니다." );
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
	}

}
