package com.spring2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring2.dto.Shop;

public class InjectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:InjectionContext2.xml");
		
		Shop shop1 = (Shop) ctx1.getBean("shop1", Shop.class);
		System.out.println(shop1.toString());
		
		Shop shop2 = (Shop) ctx1.getBean("shop2", Shop.class);
		System.out.println(shop2.toString());

		Shop shop3 = (Shop) ctx1.getBean("shop3", Shop.class);
		System.out.println(shop3.toString());
	}

}
