

package chapter15.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); 
//				인풋 스트림을 버퍼 방식으로 변환
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
//			 	아웃풋 스트림도 버퍼 방식으로 변환
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			} // 버퍼로 파일 읽고 쓰기
			
			// 버퍼드 스트림은 멤버 변수로 8,192 바이트 배열을 갖고 있어 바이트 단위로 입출력을 하는 바이트 스트림보다 훨씬 빠르다.
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
	
} // BufferedStreamTest
