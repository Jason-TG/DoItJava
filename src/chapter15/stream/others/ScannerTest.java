

package chapter15.stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		다양한 자료형을 입력할 수 있는 Scanner 클래스
//		표준 입력 스트림인 InputStream 클래스 타입의 static 변수 in을 매개변수로 받아 객체 생성
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
//		한 줄 단위 문자열을 읽어 변수에 저장
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt();
//		한 줄 단위 정수를 읽어 변수에 저장
				
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);

	} // main

} // ScannerTest
