

package chapter5;

public class Function1 {
	
	void divide(int a, int b) {
		
		if(a == 0) {
			System.out.println("0 이외의 숫자를 입력하세요");
			return; // 함수 수행 종료
		} else {
			int result = a / b ;
			System.out.println("결과는 " + result + "입니다." );
		}
		
	} // divide
	



	public static void main(String[] args) {
				

	} // main

} // Function1
