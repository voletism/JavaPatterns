package com.home.examples.java.examples;

public class BuilderPattern {
	// employee class or user class
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	
	private BuilderPattern(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
		}
		
	public String getFirstName() {
	   return firstName;
	  }
		
	public String getLastName() {		
	     return lastName;		
		}
	
	public int getAge() {		
		 return age;
		}
	
	public String getPhone() {
	    return phone;
	  }
	public String getAddress() {		
		return address;
		}
		
	 public static class UserBuilder {		
        private final String firstName;		
        private final String lastName;		
        private int age;		
        private String phone;		
        private String address;

        public UserBuilder(String firstName, String lastName) {		
            this.firstName = firstName;		
            this.lastName = lastName;		
        }        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public BuilderPattern build() {
        	return new BuilderPattern(this);
	        }
	    }
	//  how the client uses the code
	public BuilderPattern getUser() {
		return new
    		BuilderPattern.UserBuilder("Jhon", "Doe")
            .age(30)
            .phone("1234567")
            .address("Fake address 1234")
            .build();
	}
}