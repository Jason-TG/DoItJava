

package chapter12.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Apple");
		myList.add("Bank");
		myList.add("Canada");
		
		System.out.println(myList);
		myList.add(1, "Deer");
		
		System.out.println(myList);
		
		myList.addFirst("First");
		System.out.println(myList);
		System.out.println(myList.removeLast());
		
		System.out.println(myList);
	
	}

} // LinkedListTest
