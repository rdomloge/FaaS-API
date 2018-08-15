package com.example.faas.common;

import java.util.Map;
import java.util.Properties;

public abstract class AbstractFunction<V> implements Function<V> {

	protected Map<String, String> params;
	
	protected Properties config;
	
	@Override
	public void setJobParams(Map<String, String> params) {
		this.params = params;
	}

	@Override
	public void setStaticConfig(Properties config) {
		this.config = config;
	}

}
