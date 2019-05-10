package com.example.demo.domain;

import java.util.List;

public class Questionnaire {

	private String name;
	private String email;
	private String sex;
	private List<String> hobbyList;
	private String lang;
	private String other;
	
	// name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// sex
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// hobby
	public List<String> getHobbyList() {
		return hobbyList;
	}
	
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
	
	// lang
	public String getLang() {
		return lang;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	// other
	public String getOther() {
		return other;
	}
	
	public void setOther(String other) {
		this.other = other;
	}
	
}
