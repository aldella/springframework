package com.spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring1.dao.StoreDAO;
import com.spring1.dto.Store;

@Service
public class StoreServiceImp implements StoreService {
	
	@Autowired
	private StoreDAO storeDAO;
	@Override
	public List<Store> getStoreList() {
		// TODO Auto-generated method stub
		return storeDAO.getStoreList();
	}

	@Override
	public Store getStore(int storeNum) {
		// TODO Auto-generated method stub
		return storeDAO.getStore(storeNum);
	}

	@Override
	public int maxNum() {
		// TODO Auto-generated method stub
		return storeDAO.maxNum();
	}

	@Override
	public void insStore(Store store) {
		// TODO Auto-generated method stub
		storeDAO.insStore(store);
	}

	@Override
	public void upStore(Store store) {
		// TODO Auto-generated method stub
		storeDAO.upStore(store);
	}

	@Override
	public void delStore(Store store) {
		// TODO Auto-generated method stub
		storeDAO.delStore(store);
	}

}