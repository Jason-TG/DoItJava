

package chapter11.object;

class Book{
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() { // toString 재정의
		return bookTitle + "," + bookNumber;
	}
	
} // Book

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	
	}// main
	
} // ToStringEx

