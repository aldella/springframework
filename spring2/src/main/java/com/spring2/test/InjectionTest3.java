package com.spring2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring2.dto.Market;

public class InjectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:InjectionContext3.xml");
		Market m = ctx1.getBean("market1",Market.class);
		System.out.println(m.toString());
	}

}
