package com.bridgelabz.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
}

class Anno{
	@MyAnnotation(value = 10)
	public void myAnno() {
		System.out.println("My Annotation");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, RuntimeException, IllegalAccessException, InvocationTargetException {
		Anno anno = new Anno();
		Method method = anno.getClass().getMethod("myAnno");
		MyAnnotation myAno = method.getAnnotation(MyAnnotation.class);
		System.out.println("Value is: "+ myAno.value());
	}
	
}
