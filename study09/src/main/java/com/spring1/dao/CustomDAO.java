package com.spring1.dao;

import java.util.List;

import com.spring1.dto.Custom;

public interface CustomDAO {
	public List<Custom> getCustomList();
	public Custom getCustom(String id);
	public int maxNum();
	public void insCustom(Custom custom); //Custom custom
	public void changePw(String pw); //String pw
	public void changeInfo(Custom custom); //Custom custom
	public void delCustom(String pw); //Stirng id
}
