package com.spring1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring1.dto.Store;
import com.spring1.service.StoreService;
import com.spring1.vo.Maker;

@RestController //@ResponseBody + @Controller과 동일
//이 문서는, 지금 return을 JSON으로 보내주겠다
@RequestMapping("/api/")
public class RestfulController {
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("api1.do")
	public Store getApi1() {
		Store store = new Store(1,"EmArt");
		return store;
	} //API로 넣어주면 반응을 JSON 으로 보임
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1,"EmArt");
		return store;
	}
	
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		List<Store> a = new ArrayList<>();
		Store store1 = new Store(1,"EmArt");
		Store store2 = new Store(2,"HoemPlus");
		Store store3 = new Store(3,"Costco"); 
		a.add(store1);
		a.add(store2);
		a.add(store3);
		return a;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		List<Store> a = new ArrayList<>();
		Store store1 = new Store(1,"EmArt");
		Store store2 = new Store(2,"HoemPlus");
		Store store3 = new Store(3,"Costco"); 
		a.add(store1);
		a.add(store2);
		a.add(store3);
		
		Maker maker = new Maker("멤버변수part",1,a);
		return maker;
	}
	
	
	@PostMapping("api5.do")
	public Store postApi5(@RequestBody Store store) { //@RequestBody : JAVA Script 객체로 받는것 = JSON객체로 받음		
		storeService.insStore(store);
		return store;
	}
	
}