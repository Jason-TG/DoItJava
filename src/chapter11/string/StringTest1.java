package chapter11.string;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);    //false
		System.out.println(str1.equals(str2)); //true
	
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str3 == str4);  // 문자열을 직접 대입한 경우
//		상수 풀에 저장된 동일한 주소를 갖게 되므로 true
		System.out.println(str3.equals(str4)); //true
	}
	
} // StringTest1
