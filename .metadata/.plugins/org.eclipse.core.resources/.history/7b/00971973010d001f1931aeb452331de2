package com.spring2.test;

import javax.annotation.Resource;

import com.spring2.dao.SampleDAO;
import com.spring2.dao.SampleDAOImp1;

public class TestResource {
	@Resource(name="testDAO") //@Autowired와 @Qualifier를 합쳐놓은것
	private SampleDAO sampleDAO;
	public TestResource() {
		this.sampleDAO = new SampleDAOImp1();
	}
}
