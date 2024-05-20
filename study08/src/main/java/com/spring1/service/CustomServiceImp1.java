package com.spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring1.dao.CustomDAO;
import com.spring1.dto.Custom;

public class CustomServiceImp1 implements CustomService {
	
	@Autowired
	private CustomDAO customDAO; 
	
	@Override
	public List<Custom> getCustomList() {
		return customDAO.getCustomList();
	}

	@Override
	public Custom getCustom(String id) {
		return customDAO.getCustom(id);
	}

	@Override
	public int maxNum() {
		return customDAO.maxNum();
	}

	@Override
	public void insCustom(Custom custom) {
		customDAO.insCustom(custom);		
	}

	@Override
	public void changePw(String pw) {
		customDAO.changePw(pw);		
	}

	@Override
	public void changeInfo(Custom custom) {
		customDAO.changeInfo(custom);
	}

	@Override
	public void delCustom(String id) {
		customDAO.delCustom(id);		
	}

}
