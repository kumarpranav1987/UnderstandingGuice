package com.pranav.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pranav.guice.modules.DifferentWaysOfObjectBinding;


public class GuiceMain {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new DifferentWaysOfObjectBinding());
		IService service = injector.getInstance(ServiceImpl.class);
		service.execute();

	}

}
