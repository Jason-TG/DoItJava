

package chapter13.lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber max = (x, y) -> (x >= y) ? x : y;
//		람다식을 인터페이스형 참조변수 max에 대입
//		람다식을 사용하면 익명 내부클래스 객체가 생성된다 
		
		System.out.println(max.getMax(10, 20));
//		인터페이스형 변수 max와 메서드 getMax를 호출하여 대입된 람다식 사용
		
	}

}
