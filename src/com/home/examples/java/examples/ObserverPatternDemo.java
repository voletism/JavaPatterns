package com.home.examples.java.examples;

public class ObserverPatternDemo {

		   public static void main(String[] args) {
		      ObsPatSubject subject = new ObsPatSubject();

		      new ObsPatSubscriberOne(subject);
		      new ObsPatSubscriberTwo(subject);
		 
		      System.out.println("First state change: 15");	
		      subject.setState(15);
		      System.out.println("Second state change: 10");	
		      subject.setState(10);
		   }
}
