package com.bridgelabz.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class); 
		TextEditor teditor= ctx.getBean(TextEditor.class);
		
		teditor.spellChecker();
	}
	
}
