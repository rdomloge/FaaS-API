package com.example.faas.common;

import java.util.Map;

public abstract class AbstractFunction<V> implements Function<V> {

	protected Map<String, String> params;
	
	protected Map<String, String> config;
	
	@Override
	public void setJobParams(Map<String, String> params) {
		this.params = params;
	}

	@Override
	public void setStaticConfig(Map<String, String> config) {
		this.config = config;
	}

}
