/**
 * 
 */
package com.spring.learning;

/**
 * @author Ashish
 *
 */

interface Shape {
	public void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle!");
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("Drawing Triangle!");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Drawing Rectangle!");
	}
}

class DrawingClass {

	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape(){
		this.shape.draw();
	}
}


public class ApplicationClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Simple way*/
		/*Circle circle = new Circle();
		circle.draw();
		Triangle triangle = new Triangle();
		triangle.draw();*/
		
		/*Applying polymorphism*/
		/*Shape circleShape = new Circle();
		Shape triangleShape = new Triangle();
		circleShape.draw();
		triangleShape.draw();*/
		
		/*Trying to remove the Dependency*/
		/*myDrawMethod(new Circle());
		myDrawMethod(new Triangle());*/
		
		/*Added a Dependency on the Drawing class*/
		Shape shape = new Rectangle();
		DrawingClass drawingClass = new DrawingClass();
		drawingClass.setShape(shape);
		drawingClass.drawShape();
		
		
	}
	
	/*Method*/
	public static void myDrawMethod(Shape shape){
		shape.draw();
	}
	

}
