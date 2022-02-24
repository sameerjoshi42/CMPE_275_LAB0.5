package com.lab05;

import com.google.inject.Inject;

public class CoolGreeter implements Greeter {
	
	private String name;
	
	@Inject
	public CoolGreeter(String name) {
		this.name=name;
		
	}

	public void Greet() {
		// TODO Auto-generated method stub
		System.out.println("Hey World. Me "+name);
		
	}

}
