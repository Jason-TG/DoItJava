

package chapter11.object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) { // equals() 재정의
		
		if(obj instanceof MyDate){
		
			MyDate myDate = (MyDate)obj;
			
			if( this.day == myDate.day && this.month == myDate.month 
					&& this.year == myDate.year ) {
				return true;
				
			} else return false;
			
		} else return false;
		
	}// equals

	@Override
	public int hashCode() {
			return day *223 + month * 4235  + year *86743 ;
	}
}


public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());

	} // main

} // MyDateTest
