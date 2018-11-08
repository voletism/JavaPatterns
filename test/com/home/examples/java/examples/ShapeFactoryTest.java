package com.home.examples.java.examples;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapeFactory = new ShapeFactory();
			
	      //get an object of Circle and call its draw method.
	      FactoryShape shape1 = shapeFactory.createShape("CIRCLE");

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      FactoryShape shape2 = shapeFactory.createShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      FactoryShape shape3 = shapeFactory.createShape("Circle");

	      //call draw method of circle
	      shape3.draw();
	   }

	}
