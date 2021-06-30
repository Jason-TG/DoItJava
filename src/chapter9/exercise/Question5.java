
package chapter9.exercise;

import java.util.ArrayList;

abstract class Car {

	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();

	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}

} // Car

class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
	
} // Sonata

class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur 시동을 끕니다.");
	}
	
} // Grandeur

class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다.");
	}
	
} // Avante

class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Genesis 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");
	}
	
} // Genesis


public class Question5 {

		public static void main(String[] args) {

			ArrayList<Car> carList = new ArrayList<Car>();
			
			carList.add(new Sonata());
			carList.add(new Grandeur());
			carList.add(new Avante());
			carList.add(new Genesis());
			
			for(Car car : carList) {
				car.run();
				System.out.println("======================");
			}
		
	} // main

} // Question5
