package com.hotel.vo;

public class Person {

	private String name; // 이름
	private int age; // 나이
	private String country; // 국가
	private char gender; // 성별

	public Person(String name, int age, String country, char gender) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.gender = gender;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + ", gender=" + gender + "]";
	}
	
}
