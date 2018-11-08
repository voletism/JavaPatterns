package com.home.examples.java.examples;

import java.util.ArrayList;
import java.util.List;

public class ObsPatSubject {

	private List<ObsPatObserver> myObservers = new ArrayList<ObsPatObserver>();
	int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	
	public void addObservers(ObsPatObserver observer){
		myObservers.add(observer);
	}
	
	public void notifyObservers() {
		
		for (ObsPatObserver observers : myObservers) {			
			observers.update();
		}
	}
}
