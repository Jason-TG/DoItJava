package chapter8.exercise;

import java.util.ArrayList;

class Shape{
	void draw()
	{
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	void draw()
	{
		System.out.println("Circle");
	}
}

class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Rectangle");
	}
}

class Triangle extends Shape{
	void draw()
	{
		System.out.println("Triangle");
	}
}

public class Question5 {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Rectangle());
		
		for(Shape s : list) {
			s.draw();
		}

	} // main

} // Question5
