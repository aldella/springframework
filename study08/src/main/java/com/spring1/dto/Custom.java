package com.spring1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Custom {
/*create table custom(
 * id varchar2(20) primary key, 
 * pw varchar2(400) not null, 
 * name varchar2(50) not null, 
 * email varchar2(200), 
 * tel varchar2(18), 
 * addr varchar(200), 
 * postcode varchar(10));*/
	private String id;
	private String pw;
	private String name;
	private String email;
	private String tel;
	private String addr;
	private String postcode;
	private String resdate;
}
