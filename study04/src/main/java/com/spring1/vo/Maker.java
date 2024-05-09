package com.spring1.vo;

import java.util.List;

import com.spring1.dto.Store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Maker {
	private String part;
	private Integer partNum;
	private List<Store> stores; //Store은 이전의 예제들에서 내가 만들었던 예제클래스. 나중에 테스트할땐 새로 만들어서하기
}
