package com.home.examples.java.examples;

public class MVCController {

	MVCModel myModel = null;
	MVCView myView = null;
	
	public MVCController(MVCModel model, MVCView view) {
		
		this.myModel = model;
		this.myView = view;			
	}
	
	public void printdata() {
		myView.showEmployeeInfo();
	}
	
	public static void main (String [] args) {
		
		MVCModel model = new MVCModel("jesus", 101 );
		MVCView view = new MVCView(model);
		
		MVCController controller = new MVCController(model, view);
		controller.printdata();
	}
}
