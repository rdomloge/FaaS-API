package com.example.faas.common;

import java.util.Properties;
import java.util.concurrent.Callable;

public interface Function<V> extends Callable<V>{
	
	V call();

	void setJobParams(Properties params);
	
	void setStaticConfig(Properties config);
}
