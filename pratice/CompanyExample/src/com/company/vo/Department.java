package com.company.vo;

public class Department {
	private String departName;
	private Employee[] employees; //직원리스트
	
	public Department(String departName, int employeeSize) {
		this.departName = departName;
		this.employees = new Employee[employeeSize]; //객체를 생성할때는 new
	}
	
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {//set할때는 아무것도없으니 void
		this.departName = departName;
	}
	// 직원수 출력해주는 메소드
	public void printEmployeeList() {
		for(int i=0; i<employees.length; i++) { 
			System.out.println(employees[i]);
		}
		
	}
	// index랑 employee받아서 배열에 저장하는 메소드
	public void addEmployee(int index, Employee e) { // Employee e는 넘겨받고싶은거를 쓸때
		employees[index] = e;
	}
	// 인덱스 받아서 배열에서 없애는 메소드
	public void removeEmployee(int index) {
		employees[index] = null;
	}

	public Employee getEmployee(int i) {
		return employees[i];
	}

}
