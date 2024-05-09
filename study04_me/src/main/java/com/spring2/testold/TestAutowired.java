package com.spring2.testold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring2.dao.SampleDAO;
import com.spring2.dao.SampleDAOImp1;

@Service
public class TestAutowired {

	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {
		this.sampleDAO = new SampleDAOImp1();
	}
}
