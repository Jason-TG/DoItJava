
package chapter13.innerclass;

import chapter13.innerclass.OutClass.InStaticClass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InnerClass innerClass; //

	public OutClass() { // 기본 생성자
		innerClass = new InnerClass(); // 내부 클래스 생성
	} // OutClass()

	class InnerClass {

		int inNum = 100;
		// static int sInNum = 200; // inner클래스에 static 변수 사용 불가

		void innerTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("<=========================================>");
		}

		// static void sTest(){ // inner클래스에 static 변수 사용 불가
		// }

	} // class InnerClass

	public void usingClass() {
		innerClass.innerTest(); // 내부 클래스 변수를 사용하여 메서드 호출하기
	}

	static class InStaticClass {

		int inNum = 100;
		static int sInNum = 200;

		void inTest() { // 정적 클래스의 일반 메서드
			// num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		} // inTest()

		static void sTest() { // 정적 클래스의 static 메서드
			// num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			// inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		} // sTest()
		
	} // class InStaticClass
	
} // class OutClass

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		System.out.println();
		outClass.usingClass(); // 외부 클래스의 메서드 안에 정의된 내부 클래스 기능 호출
		
		OutClass.InStaticClass.sTest(); 
		// private이 아닌 경우 정적 내부 클래스의 정적 메서드와 변수는 객체 생성 없이 호출 가능 

		 OutClass.InnerClass innerClass = outClass.new InnerClass(); 
		 // 생성되어있는 외부 클래스 객체를 이용하여 내부 클래스 생성
		 System.out.println();
		 System.out.println("외부 클래스 객체의 참조변수를 이용하여 내부 클래스 생성"); // 내부 클래스가 private이 아닌 경우
		 innerClass.innerTest();
		 
		 System.out.println();
		 
//		 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성 
		 OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); 
		 System.out.println("정적 내부 클래스 일반 메서드 호출");
		 sInClass.inTest(); System.out.println();
		 
		 System.out.println("정적 내부 클래스의 스태틱 메소드 호출"); OutClass.InStaticClass.sTest();
		 
	}
}
