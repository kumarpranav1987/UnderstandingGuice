package com.pranav.guice;

import com.google.inject.Inject;

public class ServiceImpl implements IService {

	private final IPojoToInject pojo;

	@Inject
	public ServiceImpl(PojoToInjectImpl pojo) {
		this.pojo = pojo;
	}

	/* (non-Javadoc)
	 * @see com.pranav.guice.IService#execute()
	 */
	@Override
	public void execute() {
		System.out.println(pojo.toString());
	}
}
