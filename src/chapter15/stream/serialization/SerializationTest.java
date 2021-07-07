

package chapter15.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	private static final long serialVersionUID = 4361614814482382296L;
	// 클래스의 버전 관리를 위한 정보.
	
	String name;
	transient String job;
	// transient 예약어를 사용한 변수는 직렬화와 역직렬화 과정에서 제외 => 자료형의 기본값으로 저장

	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() 	{
		return name + "," + job;
	}
	
} // class Person

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		} // t-c
			
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		} // t-c
		
	} // main
	
} // SerializationTest
