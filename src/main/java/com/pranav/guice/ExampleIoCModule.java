package com.pranav.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;


public class ExampleIoCModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PojoToInjectImpl.class);
		bind(String.class).annotatedWith(Names.named("ION")).toInstance("IONUsinsBind");
	}
	
	@Provides
	@Named("ION")
	String provideString(){
		return "ION";
	}

}
