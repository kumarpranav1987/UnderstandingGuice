package com.pranav.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class GuiceMain {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new ExampleIoCModule());
		IService service = injector.getInstance(ServiceImpl.class);
		service.execute();

	}

}
