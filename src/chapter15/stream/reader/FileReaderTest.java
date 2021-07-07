

package chapter15.stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		try(FileReader fr 
				= new FileReader("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\reader.txt")) {
			int i ;
			while( (i = fr.read()) != -1){
//				FileReader의 read는 읽어온 문자 하나의 코드를 리턴
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
} // FileReaderTest