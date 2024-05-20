package com.spring1.util;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring1.dto.Check;

public class CheckValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Check.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Check check = (Check) obj;
		ValidationUtils.rejectIfEmpty(errors, "id", "check.id.empty","아이디를 입력해주세요");
		ValidationUtils.rejectIfEmpty(errors, "pw", "check.pw.empty","비밀번호를 입력해주세요");
		
		//패턴을 만들어 넣어주는 메소드 = Pattern.complie
		//아이디 입력패턴
		Pattern pat1=Pattern.compile("^[a-z0-9]{5,12}$", Pattern.CASE_INSENSITIVE);
		//비밀번호 입력패턴
		Pattern pat2=Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);
		
		//pat1의 패턴과 check객체의 Id가 matches() 되느냐 의 not 조건 붙임 = ID가 패턴과 일치하지 않으면
		if (!(pat1.matcher(check.getId()).matches())) {
			errors.rejectValue("id", "check.id.invaild");
		}
		
		//pat2의 패턴과 check객체의 Pw가 matches() 되느냐 의 not 조건 붙임 = Pw가 패턴과 일치하지 않으면
		if (!(pat2.matcher(check.getPw()).matches())) { 
			errors.rejectValue("id", "check.id.invaild");
		}
	}
}
