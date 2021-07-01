

package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int size = arrayStack.size();
		if(size == 0 ) { 
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(size-1));
	}
	
	public ArrayList<String> getArrayStack() {
		return arrayStack;
	}
	
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		stack.push("A");
		System.out.println(stack.getArrayStack());
		stack.push("B");
		System.out.println(stack.getArrayStack());
		stack.push("C");
		System.out.println(stack.getArrayStack());
		
		System.out.println(stack.pop());
		System.out.println(stack.getArrayStack());
		System.out.println(stack.pop());
		System.out.println(stack.getArrayStack());
		System.out.println(stack.pop());
		System.out.println(stack.getArrayStack());
	} // main
	
} //StackTest


