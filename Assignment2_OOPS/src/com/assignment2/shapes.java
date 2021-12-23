package com.assignment2;

public class shapes {

	public static void main(String[] args) {
		Line l=new Line();
		l.draw();
		
		Rectangle r=new Rectangle();
		r.draw();
		
		Cube c=new Cube();
		c.draw();
	}

}

	abstract class Shape{
	abstract void draw(); 
	
	}
	class Line extends Shape
	{
	@Override
	void draw() {
		System.out.println("This is a Line");
		
	}}
	class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("This is a Rectangle");
		
				}
	
								}
	class Cube extends Shape{

	@Override
	void draw() {
		System.out.println("This is a Cube");
		
	}
	
}