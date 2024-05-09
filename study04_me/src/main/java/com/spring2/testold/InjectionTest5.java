package com.spring2.testold;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring2.dto.Warehouse;

public class InjectionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:InjectionContext5.xml");
		Warehouse w1 = ctx1.getBean("test5",Warehouse.class);
		System.out.println(w1.toString());
	}

}
