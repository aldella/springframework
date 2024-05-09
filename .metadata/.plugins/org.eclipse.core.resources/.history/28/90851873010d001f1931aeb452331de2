package com.spring2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring2.dto.Store;

public class InjectionTest1 {
	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:InjectionContext.xml");
		
		Store store1 = ctx1.getBean("store1", Store.class);
		System.out.println(store1.toString());
		
		Store store2 = ctx1.getBean("store2", Store.class);
		System.out.println(store2.toString());

		Store store3 = ctx1.getBean("store3", Store.class);
		System.out.println(store3.toString());
		
		Store store4 = ctx1.getBean("store4", Store.class);
		System.out.println(store4.toString());
	}
}
