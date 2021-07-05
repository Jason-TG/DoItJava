

package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
//		ArrayList 클래스의 stream() 메서드 리턴값은 Stream 클래스 타입.
		stream.forEach(s->System.out.print(s + " "));
//		stream을 통해 최종 연산 forEach 수행
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s+ " "));
//		다시 stream을 생성하여 sorted 작업을 거쳐 forEach 수행
		
	//	sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	//	sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
		
	}
	
}
