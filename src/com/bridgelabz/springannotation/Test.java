package com.bridgelabz.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(ExampleConfig.class);
		
		Example example= ctx.getBean(Example.class);
		
		example.setMsg("Dave Its Me!");
		example.getMsg();
	}
}
