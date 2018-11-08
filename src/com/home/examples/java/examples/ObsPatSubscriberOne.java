package com.home.examples.java.examples;

public class ObsPatSubscriberOne extends ObsPatObserver{
	
	public ObsPatSubscriberOne(ObsPatSubject subject) {
		
		this.mySubject = subject;
		this.mySubject.addObservers(this);
	}

	@Override
	void update() {
		
		System.out.println("Subject state changed = " + this.mySubject.getState());		
	}
}
