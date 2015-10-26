package com.example;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private List<String> interests;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<String> getInterests() {
		return interests;
	}
	
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
}
