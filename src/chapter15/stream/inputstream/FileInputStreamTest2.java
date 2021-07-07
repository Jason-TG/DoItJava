

package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis 
				= new FileInputStream("C:\\DevTools\\WorkSpace_G\\DoItJava_study\\src\\chapter15\\input.txt")){ 
			int i;
			while ( (i = fis.read()) != -1){
				System.out.print((char)i + "\t \n");
			}
			System.out.println("=======");
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main

} // FileInputStreamTest02
