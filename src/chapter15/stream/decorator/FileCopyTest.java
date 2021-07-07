
package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) {

			millisecond = System.currentTimeMillis();

			int i;
			while ((i = fis.read()) != -1) {
				// 인풋 스트림(바이트단위)으로 a.zip파일을 읽어서
				fos.write(i);
				// 아웃풋 스트림(바이트단위)으로 copy.zip파일을 새로 쓰기 
			}

			millisecond = System.currentTimeMillis() - millisecond;
			// 복사 과정에서 걸린 시간 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	} // main

} // FileCopyTest
