package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dto.Sample;


@Repository
public class SampleDAOImp1 implements SampleDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Sample> getSampleList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("sample.getSampleList");
		//sqlSession(mybatis와 SQL을 연결해주는것)를 사용하여 selectList를 해줄건데 그렇게 호출하는 메소드는 우리가 sampleMapper에 등록해줬던 getSampleList메소드(근데 namespace가 sample이므로) sample.getSampleList <- 문자열로 넣어줘야함
	}

	@Override
	public Sample getSample(int num) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("sample.getSample", num);
	}

	@Override
	public void insSample(Sample sample) {
		// TODO Auto-generated method stub
		sqlSession.insert("sample.insSample",sample);
	}

	@Override
	public void upSample(Sample sample) {
		// TODO Auto-generated method stub
		sqlSession.update("sample.upSample",sample);
	}

	@Override
	public void delSample(Sample sample) {
		// TODO Auto-generated method stub
		sqlSession.delete("sample.delSample",sample);
	}

}
