package chapter7.exercise.q4;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("럭키", "셰퍼드"));
		dogList.add(new Dog("바비", "리트리버"));
		dogList.add(new Dog("우주", "포메라니안"));
		dogList.add(new Dog("행운", "셰퍼드"));
		
		for (Dog dog : dogList) {
			System.out.printf("%s, %s \n", dog.getName(), dog.getType());
		}

	} // main

	
	
}
