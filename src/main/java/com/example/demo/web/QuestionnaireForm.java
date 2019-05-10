package com.example.demo.web;

import java.util.List;

public class QuestionnaireForm {
	private String name;
	private String email;
	private String sex;
	private List<Integer> hobbyList;
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
	
	
	// hobby
	public List<Integer> getHobbyList() {
		return hobbyList;
	}
	
	public void setHobbyList(List<Integer> hobbyList) {
		this.hobbyList = hobbyList;
	}	
	
	// other
	public String getOther() {
		return other;
	}
	
	public void setOther(String other) {
		this.other = other;
	}

	// sex
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// lang
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
