package com.example.faas.common;

import java.util.Properties;

public abstract class AbstractFunction<V> implements Function<V> {

	protected Properties params;
	
	protected Properties config;
	
	@Override
	public void setJobParams(Properties params) {
		this.params = params;
	}

	@Override
	public void setStaticConfig(Properties config) {
		this.config = config;
	}

}
