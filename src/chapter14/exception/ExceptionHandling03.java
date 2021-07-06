

package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println();	System.out.println("==="); System.out.println();
			e.printStackTrace(); System.out.println();
			return;
		} finally { 
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				e.printStackTrace();
				} // try_catch
			} // if
			System.out.println("리턴문과 상관없이 finally는 항상 실행");
		} // finally
		System.out.println("catch문에 return이 있으므로 이미 메서드는 종료");
	} // main

} // ExceptionHandling03
