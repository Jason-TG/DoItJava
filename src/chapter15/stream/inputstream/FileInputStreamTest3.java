
package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		try (FileInputStream fis 
				= new FileInputStream("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\input2.txt")) {
//			input2.txt 파일을 인자값으로 받아서 FileInputStream 타입의 객체 생성, fis변수에 저장
			
			byte[] bs = new byte[10];
//			10개의 바이트 항목을 갖는 배열을 bs 변수에 저장
			
			int i;
			
			while((i = fis.read(bs)) != -1 ) {
//				fis가 참조하는 FileInputStream 객체의 read()메서드에 bs가 참조하는 바이트 배열을 인자값으로 대입.
//				read() 메서드는 한 번에 읽어들인 자료의 수를 리턴하므로 int형 변수 i에 대입
				
				for	(byte b : bs) {
					System.out.print((char)b);
//					bs 배열의 각 바이트 항목을 char형으로 변환하여 출력
					
				} // for
				System.out.println(": " + i + "바이트 읽음");
			} // while
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		System.out.println("end");
	} // main

} // FileInputStreamTest3
