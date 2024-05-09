package com.spring2.testold;

import com.google.inject.Inject;
import com.spring2.dao.SampleDAO;
import com.spring2.dao.SampleDAOImp1;

public class TestInject {

	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO = new SampleDAOImp1();
	}
}
