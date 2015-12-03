package com.pranav.guice;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class PojoToInjectImpl implements IPojoToInject{
	String s;

	@Inject
	public PojoToInjectImpl(@Named("ION")String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Feitooooo!!"+s.length();
	}
}
