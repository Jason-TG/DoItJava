

package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest02 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입력 오류");
			System.out.println(e);
			System.out.println("<===>");
		}

	} // main

} // SystemInTest02
