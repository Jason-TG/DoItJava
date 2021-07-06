

package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className)
//	Class 타입을 반환하는 메서드
	
	throws FileNotFoundException, ClassNotFoundException {
//		메서드 실행 시 예외를 처리하도록 미룸
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
//		파일 이름과 클래스 이름 대입 시 예외가 발생할 수 있으나 처리를 미루어 컴파일 오류 x
		return c;

} // loadClass
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try { // 메서드를 실행할 때 예외 처리 
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// 모든 예외를 한 문장으로 처리
			e.printStackTrace();
		}
		
		try { // 다중 예외 처리 : 각 예외별 작성
			test.loadClass("a.txt", "java.lang.String");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}


	} // main 

} // ThrowsException
