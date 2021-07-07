

package chapter15.stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos 
				= new FileOutputStream("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\output.txt")) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (Exception e) {
			e.printStackTrace();
		} // try_catch
		
		System.out.println("파일 생성 완료");

	} // main

} // FileOutputStreamTest1
