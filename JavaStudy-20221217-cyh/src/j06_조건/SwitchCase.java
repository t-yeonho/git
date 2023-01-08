package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
//		switch("30") {
//			case "10":
//				System.out.println("10입니다.");
//				break;
//			case "20":
//				System.out.println("20입니다.");
//			case "30":
//				System.out.println("30입니다.");
//			case "40":
//				System.out.println("40입니다.");
//				break;
//			case "50":
//				System.out.println("50입니다.");
//		
//	}
		
		System.out.println("프로그램을 시작합니다.");
		
		String select = "35";
		switch(select) {
		case "10":
			System.out.println("10입니다.");
		case "20":
			System.out.println("20입니다.");
		case "30":
			System.out.println("30입니다.");
		case "40":
			System.out.println("40입니다.");
		case "50":
			System.out.println("50입니다.");
		default:
			System.out.println("프로그램이 종료되었습니다.");
		// default 는 해당값이 없을 때도 무조건 실행
		}
	}
}



















