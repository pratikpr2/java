package com.bridgelabz.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {
	@Bean
	public Example getExample() {
		return new Example();
	}
}
