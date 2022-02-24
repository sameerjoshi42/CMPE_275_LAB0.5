package com.lab05;

import com.google.inject.Inject;

public class WarmGreeter implements Greeter {

	private String name;
	
//	@Inject
//	public WarmGreeter(String name) {
//		this.name=name;
//		
//	}
	public void Greet() {
		// TODO Auto-generated method stub
		System.out.println("Hey my dear World. I am  Nice to see you!");
		
	}

}
