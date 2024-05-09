package com.spring2.test;

import com.spring2.dto.Market;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InjectionAnnotation3 {
	private int data1;
	private String data2;
	private Market marketBean1;
	public InjectionAnnotation3(int data1, String data2, Market marketBean1) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.marketBean1 = marketBean1;
	}
	public InjectionAnnotation3() {}
}
