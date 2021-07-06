

package chapter14.exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try(AutoCloseObj obj = new AutoCloseObj()) {
//			try의 괄호 안에 사용할 리소스 선언. 여러 개인 경우 세미콜론으로 구분
//			try (A a = new A(); B b = newB())
		}	catch(Exception e) {
				System.out.println("예외 부분입니다");
		}
		
		try (AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 부분입니다. ");
		}
		
		
	} // main

} // AutoCloseTest
