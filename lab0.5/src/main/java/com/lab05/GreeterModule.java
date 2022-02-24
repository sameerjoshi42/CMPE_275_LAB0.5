package com.lab05;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GreeterModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class);
		bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class);
	}

}
