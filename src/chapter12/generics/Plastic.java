package chapter12.generics;

public class Plastic implements Material {

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 출력합니다");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic 입니다";
		
	}
}
