

package chapter13.lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	
	public static void showMyString(PrintString p) { 
//		스태틱 메서드로 적용 시 매개변수로 인터페이스 타입 선언.
//		람다식에 전달할 매개변수를 입력하여 인터페이스의 메서드를 호출. 
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() { // 리턴 값으로 람다식 반환
		return s->System.out.println(s + "world");
	}

	public static void main(String[] args) {

		PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);                         
//		미리 람다식의 매개변수를 작성한 스태틱 메서드에 인터페이스 타입의 참조변수 대입
		
		PrintString reStr = returnString();   
//		람다식을 반환하는 메서드를 호출하여 람다식을 인터페이스타입의 참조변수에 대입
		reStr.showString("hello ");
//		인터페이스 내의 메서드에 람다식에 전달할 매개변수를 입력하여  람다식 호출
		
//		결국 중요한 것은 람다식은 추상메서드가 하나 있는 인터페이스 타입의 참조변수에 
//		대입한다는 것이고 람다식 실행을 위해서는 해당 참조변수를 통해 인터페이스 내의 메서드를 
//		호출하여 람다식에 필요한 매개변수를 전달하는 것이다. 
		
//		보통은 기능 실행을 위해 인터페이스의 추상메서드를 구체화한 클래스를 작성하고 해당 클래스의 객체를
//		생성하여 구체화한 메서드를 호출하였다면 
//		별도의 클래스 없이 인터페이스에 작성한 추상메서드를 람다식의 간단한 문법으로 재정의하여 구체화 한다는 개념인 듯.
//		인터페이스와 추상메서드, 람다식으로 하나의 기능을 실행하는 방법인 것 같다. 
		
//		이를 통해 자바스크립트처럼 하나의 메서드를 변수로 관리할 수 있는 것이 장점인 듯. 
		
	} // main

} // returnString
