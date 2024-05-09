package com.spring2.test;

import java.util.List;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring2.dto.Sample;
import com.spring2.service.SampleService;

@Controller
@RequestMapping("/test/")
public class TestController {
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="testList1.do", method=RequestMethod.GET)
	public String getTestList1(Model model) {
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		model.addAttribute("mapper", "테스트 목록1");
		return "test/testList";
	}
	
	@GetMapping("testList2.do")
	public String sdkljslfksdj(Model model) { //메소드의 이름은 아무래도 상관없다!!!!!!
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		model.addAttribute("mapper", "테스트 목록2");
		return "test/testList";
	}
	
	@GetMapping("insTest.do")
	public String insTest(Model model) {
		return "test/insTest";
	}
	
	@PostMapping("insTestPro.do")
	public String insTestPro(Model model) {
		//select num from (select * from sample order by num desc) where rownum=1;
		int maxNum = sampleService.maxNum() +1;
		
		
		return "redirect:testList.do";
	}
	
	@GetMapping("modTest.do")
	public String modTest(Model model) {
		return "test/modTest";
	}
	
	@GetMapping("modTestPro.do")
	public String modTestPro(HttpServlet Request, Model model) {
		return "test/modTest";
	}
	
}
