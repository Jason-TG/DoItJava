

package chapter9.template;

abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startCar()
	{
		System.out.println("시동을 켭니다");
	}
	
	public  void turnOff()
	{
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { // => template method : 메서드의 실행순서와 시나리오 정의
		startCar();
		drive();
		stop();
		turnOff();
	} // run()
	
} // class Car

class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");		
	}
} // AICar

class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다");
	}
} // ManualCar

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run(); // 템플릿
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run(); // 템플릿
		
	} // main
	
} // CarTest


