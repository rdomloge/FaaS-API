package com.example.faas.common;

import java.util.Map;
import java.util.concurrent.Callable;

public interface Function<V> extends Callable<V>{
	
	V call();

	void setJobParams(Map<String, String> params);
	
	void setStaticConfig(Map<String, String> config);
}
