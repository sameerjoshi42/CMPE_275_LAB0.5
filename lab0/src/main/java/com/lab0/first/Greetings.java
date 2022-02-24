package com.lab0.first;

public class Greetings implements Greeter{

	String name;
	public void setName(String name) {
		this.name=name;
		
	}

	public String getGreeting() {
		
		return "Hello world from "+name;
	}

}
