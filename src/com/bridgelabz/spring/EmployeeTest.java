package com.bridgelabz.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory factory = new XmlBeanFactory(resource); 
		
		Employee employee = (Employee) factory.getBean("emp");
		employee.show();
		System.out.println(employee.hashCode());
		
		Employee employee2 = (Employee)factory.getBean("emp");
		employee2.show();
		System.out.println(employee2.hashCode());
	
	}
	
}
