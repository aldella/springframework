package com.spring2.testold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring2.dao.SampleDAO;
import com.spring2.dao.SampleDAOImp1;

public class TestQualifier {

	@Autowired
	@Qualifier("testDAO") //지시자(밑의 sampleDAO 로 선언된것과 이름이 달라서 autowired가 힘들 경우, Qualifier로 "이 이름으로 찾아라"라고 정해주는것
	private SampleDAO sampleDAO;
	
	public TestQualifier() {
		this.sampleDAO = new SampleDAOImp1();
	}
}
