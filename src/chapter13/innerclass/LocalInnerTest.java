package chapter13.innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i){

		int num = 100;
		
		class MyRunnable implements Runnable{

			int localNum = 10;
				
			@Override
			public void run() {
				
				//num = 200;   
				//i = 100;     // 컴파일 시 외부 메서드의 지역변수와 매개변수는 final 상수로 변환
				localNum = 12;
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				}
			
			} // class MyRunnable
		
		 return new MyRunnable(); // 메서드의 리턴값으로 내부 지역 클래스의 객체를 생성하여 참조변수 반환
		 
	} // getRunnable()
	
} // class Outer

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
	} // main
	
} // class LocalInnerTest
