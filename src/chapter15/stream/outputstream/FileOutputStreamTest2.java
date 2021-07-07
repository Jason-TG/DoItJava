

package chapter15.stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos 
				= new FileOutputStream("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\output2.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		} // try_catch
		
		try (FileOutputStream fos 
				= new FileOutputStream("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\output2.txt", true)) {
//			출력 스트림 생성 시 생성자의 두번째 매개변수에 true(append)를 입력하면 원래 쓰여진 자료에 이어서 쓰여짐 
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		} // try_catch
		
		System.out.println("파일 생성 완료");

	} // main

} // FileOutputStreamTest2







