

package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHanling01 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("프로그램 종료"); 
	} // main

} // ExceptionHanling01
