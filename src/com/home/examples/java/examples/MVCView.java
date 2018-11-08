package com.home.examples.java.examples;

public class MVCView {
	
	MVCModel myModel ;
	
	public MVCView(MVCModel model) {
		this.myModel= model;
		
	}
	public void showEmployeeInfo() {
		
		System.out.println("Employee Id : " + myModel.getId());
		System.out.println("Employee name : " + myModel.getName());
	}
}
