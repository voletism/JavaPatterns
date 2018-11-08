package com.home.examples.java.examples;


public class ShapeFactory {
		
	   //use getShape or createShape method to get object of type shape 
	   public FactoryShape createShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new FactoryCircle();
		         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new FactoryRectangle();	         
	      }   
		     return null;
	    }
	}

