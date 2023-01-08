package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
		
		System.out.println("안녕\t하세요");
		
		String address = "부산시 진구 가야동";
		
		int index = address.indexOf("시");
		System.out.println(index);
		int index2 = address.indexOf("진");
		System.out.println(index2);
		
		String address2 = "부산시 동래구 사직동";
		int index3 = address2.indexOf("동");
		System.out.println(index3);
		
		int index4 = address2.lastIndexOf("동");
		System.out.println(index4);
		
		String subAddress = address2.substring(0, 3);
		System.out.println(subAddress);
		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);
		String subAddress3 = address2.substring(4);
		System.out.println(subAddress3);
//		indexOf 란 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
//		substring  이란 해당 문자열에서 범위를 지정하여 문자열을 잘라줌.
		
//		문제!
//		"부산광역시 서구 부민동" 에서 indexOf, lastIndexOf를 사용해서 "부산광역시 서구"까지 출력
		String address3 = "부산광역시 서구 부민동";
		int index5 = address3.indexOf("부");
		int index6 = address3.lastIndexOf("부");
		String subaddress4 = address3.substring(index5, index6 - 1);
		System.out.println(subaddress4);
		
//		해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address3.replace(' ', '-');
		System.out.println(replaceAddress);
		
		String replaceAddress2 = address3.replaceAll(" 서" , "-");
		System.out.println(replaceAddress2);
		
		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		
//		문제! 010을 011로 다 바꿔라, /를 -으로 바꿔라, (,)를 /로 바꿔라
		
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/")
				;
		System.out.println(rePhone2);
		
		
		
		
		
	}

}



















