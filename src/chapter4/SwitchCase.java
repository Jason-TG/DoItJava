package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		
		int floor = 0;

		floor = 3;

		if (floor == 1) {
			System.out.println("1층입니다.");
		} else if (floor == 2) {
			System.out.println("2층입니다.");
		} else if (floor == 3)	 {
			System.out.println("3층입니다.");
		} else if (floor == 4) {
			System.out.println("4층입니다.");
		} else if (floor == 5) {
			System.out.println("5층입니다.");
		} //if-else

		switch (floor) {
		
			case 1 : System.out.println("1층입니다.");
			break;
			case 2 : System.out.println("2층입니다.");
			break;
			case 3 : System.out.println("3층입니다.");
			break;
			case 4 : System.out.println("4층입니다.");
			break;
			default : System.out.println("5층입니다.");
		
		} // switch
		
} // main

} // SwitchCase
