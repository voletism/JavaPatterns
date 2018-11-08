package com.home.examples.java.examples;

public class MVCModel {
	
	private String employeeName;
	private int employeeId;
	
	MVCModel(String name, int id) {
		this.employeeName = name;
		this.employeeId = id;
	}
	public String getName(){		
		return employeeName;
	}
	public void setName(String name){
		this.employeeName = name;
	}
	public int getId() {		
		return employeeId;		
	}
	public void setId(int id){
		this.employeeId = id;
	}
}
