package etc.s210701;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_remove {

	public static void main(String[] args) {

		String[] fruitsArray = {"apple", "banana", "kiwi", "mango"};
		ArrayList<String>  fruits = new ArrayList<>(Arrays.asList(fruitsArray));
		System.out.println("all: " + fruits.toString()); // ArrayList의 toString() 메서드는 배열의 각 요소를 리턴한다. 

		String returned = fruits.remove(2); // ArrayList의 remove(index)는 해당 인덱스의 항목을 삭제하고 리턴값으로 반환한다. 
		System.out.println("remove(2): " + fruits.toString());
		System.out.println("returned: " + returned);
		
	} // main

	
}
