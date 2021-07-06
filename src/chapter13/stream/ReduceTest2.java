

package chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString2 implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	} // apply()
	
} // CompareString

public class ReduceTest2 {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;}));

		                          
	} // main
	
} // ReduceTest
