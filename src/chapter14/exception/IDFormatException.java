

package chapter14.exception;

public class IDFormatException extends Exception{
//	Exception 클래스를 상속하여 적용시키고 싶은 조건에 따라 예외를 발생시킴
	
	public IDFormatException(String message){
		super(message);
//		예외 상황에 대한 메시지 문자열을 받아 객체 생성 
//		=> 상위 클래스인 Exception의 생성자에 문자열을 전달하여 객체 생성
	}
	
} // IDFormatException
