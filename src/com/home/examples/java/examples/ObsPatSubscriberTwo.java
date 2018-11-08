package com.home.examples.java.examples;

public class ObsPatSubscriberTwo extends ObsPatObserver{

	ObsPatSubscriberTwo(ObsPatSubject subject) {
		this.mySubject = subject;
		this.mySubject.addObservers(this);
	}
	
	@Override
	void update() {		
		System.out.println("Subject state changed =" + this.mySubject.getState());		
		// TODO Auto-generated method stub		
	}

}
