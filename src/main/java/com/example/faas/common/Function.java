package com.example.faas.common;

import java.util.Map;
import java.util.concurrent.Callable;

import com.example.faas.dto.JobRequest;

public interface Function<V> extends Callable<V>{
	
	V call();

	void setRequest(JobRequest request);
	
	void setConfig(Map<String, String> config);
}
