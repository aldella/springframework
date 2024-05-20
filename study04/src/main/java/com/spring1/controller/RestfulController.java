package com.spring1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.spring1.dto.Classroom;
import com.spring1.dto.Store;
import com.spring1.dto.Student;
import com.spring1.service.StoreService;
import com.spring1.vo.Maker;

@RestController //@ResponseBody + @Controller과 동일
//이 문서는, 지금 return을 JSON으로 보내주겠다
@RequestMapping("/api/")
public class RestfulController {
	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
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
	
	@PostMapping("api6.do")
	public String postStudent(@RequestBody Student std) {
		String response = String.format("\n학생정보\n이름 : %s\n번호 : %d\n나이:%d", std.getName(),std.getStdNumber(),std.getAge());
		log.info("postStudent response:"+response);
		return response;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student>	stds) {
		String response = "\n학생 정보\n";
		int i=1;
		for (Student s:stds) {
			response += String.format("학생%d\n학생정보\n이름 : %s\n번호 : %d\n나이:%d", i, s.getName(),s.getStdNumber(),s.getAge());
			i++;
		}
		log.info("postAllStudent response:"+response);
		return response;
	}
	
	@PostMapping("api8.do")
	public String postClassroom(@RequestBody Classroom cls) {
		String response = "\n팀 정보\n";
		response += String.format("팀 이름 : %s\n팀 번호 : %d\n학생 정보 출력\n", cls.getPart(), cls.getClassNum());
		int i=1;
		for (Student s:cls.getStudents()) {
			response += String.format("학생%d\n학생정보\n이름 : %s\n번호 : %d\n나이:%d\n", i, s.getName(),s.getStdNumber(),s.getAge());
			i++;
		}
		log.info("postClassroom response:"+response);
		return response;
	}
	
	@PostMapping("api9.do") //simple-json을 활용한 JsonString -> Student객체
	public Student convertStringToStudent1(@RequestBody String jsonStr) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
		
		Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()), jsonObject.get("name").toString() , Integer.valueOf(jsonObject.get("age").toString()) );
		log.info("convertStringToStudent1:"+std);
		return std;
	}
	
	@PostMapping("api10.do") //simple-json을 활용한 Student -> JsonString
	public String convertStudentToString1(@RequestBody Student std) throws ParseException {
		JSONObject jsonPlayer = new JSONObject();
		jsonPlayer.put("stdNumber", std.getStdNumber());
		jsonPlayer.put("name", std.getName());
		jsonPlayer.put("age", std.getAge());
		String jsonStr = jsonPlayer.toJSONString();
		log.info("convertStudentToStudent1 : " + jsonStr);
		return jsonStr;
	}
	

    @PostMapping(value="api11.do", produces="application/json;charset=UTF-8") //gson을 활용한 JsonString -> Student
    public Student convertStringToStudent2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Student std = gson.fromJson(jsonStr, Student.class);
        log.info("convertStringToStudent2 result : "+std);
        return std;
    }

    //gson을 활용한 JsonString -> Classroom
    @PostMapping(value="api12.do", produces="application/json;charset=UTF-8") 
    public Classroom convertStringToClassroom2(@RequestBody String jsonStr) {
        Gson gson = new Gson();
        Classroom team = gson.fromJson(jsonStr, Classroom.class);
        log.info("convertStringToClassroom2 result : "+team);
        return team;
    }

    //gson을 활용한 Classroom -> JsonString
    @PostMapping(value="api13.do", produces="application/json;charset=UTF-8")
    public String convertClassroomToString2(@RequestBody Classroom team) {
        Gson gson = new Gson();
        String jsonStr = gson.toJson(team);
        log.info("convertClassroomToString2 : "+jsonStr);
        return jsonStr;
    }

    @PostMapping("api14.do")   //jackson을 활용한 JsonString -> Classroom
    public Classroom convertStringToClassroom3(@RequestBody String jsonStr) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> teamMap = objectMapper.readValue(jsonStr, new TypeReference<>(){});
        Classroom team = new Classroom(
                teamMap.get("part").toString(),
                Integer.valueOf(teamMap.get("classNum").toString()),
                (ArrayList<Student>) teamMap.get("students"));
        log.info("convertStringToClassroom3 result : "+team);
        return team;
    }

    @PostMapping("api15.do") //jackson을 활용한 Classroom -> JsonString
    public String convertClassroomToString3(@RequestBody Classroom team) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(team);
        log.info("convertClassroomToString3 result : "+jsonStr);
        return jsonStr;
    }
	
	
}
