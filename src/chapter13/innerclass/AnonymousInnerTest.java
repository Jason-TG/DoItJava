
package chapter13.innerclass;

class Outter2 {

	Runnable getRunnable(int i) {

		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				// num = 200; //에러 남
				// i = 10; //에러 남
				System.out.println(i);
				System.out.println(num);
				System.out.println("외부 클래스의 메서드 안에서 Runnable을 구현하여 리턴");
				System.out.println();
				
			} // run()
		}; // Runnable() => ;으로 닫아주기
		 
	} // getRunnable(int i)

	Runnable runnerble2 = new Runnable() {
		@Override
		public void run() {
			int i = 10;
			int num = 100;
			System.out.println(i);
			System.out.println(num);
			System.out.println("Runnable을 구현하여 외부 클래스의 참조 변수에 바로 대입");
		} // run()
	}; // Runnable()
	
} // class Outter2

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();

		Runnable runnerble1 = out.getRunnable(10);
		runnerble1.run();

		out.runnerble2.run();
	}
}