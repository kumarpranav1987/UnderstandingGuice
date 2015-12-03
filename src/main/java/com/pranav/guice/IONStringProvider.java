package com.pranav.guice;

import com.google.inject.Provider;

public class IONStringProvider implements Provider<String>{

	@Override
	public String get() {	
		return "IONStringProvide";
	}

}
