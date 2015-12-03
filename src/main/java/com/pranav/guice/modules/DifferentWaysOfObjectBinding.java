package com.pranav.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.pranav.guice.IONStringProvider;
import com.pranav.guice.PojoToInjectImpl;

/**
 * 
 * 
 * This Example Explains different ways of bind a Object
 * 1)Using toinstance
 * 2)Using annotation Provides
 * 3)Using a provider
 *
 */

public class DifferentWaysOfObjectBinding extends AbstractModule {

	@Override
	protected void configure() {
		bind(PojoToInjectImpl.class);
		//bind(String.class).annotatedWith(Names.named("ION")).toInstance("IONUsinsBind");
		bind(String.class).annotatedWith(Names.named("ION")).toProvider(IONStringProvider.class);
	}
	
	/*@Provides
	@Named("ION")
	String provideString(){
		return "ION";
	}*/

}
