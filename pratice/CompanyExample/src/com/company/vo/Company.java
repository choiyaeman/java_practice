package com.company.vo;

public class Company {
	private String companyName;	//회사명
	private Department[] departments; //부서리스트
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Company(String companyName, int departmentSize) {
		this.companyName = companyName;
		this.departments = new Department[departmentSize];
	}
	//부서 리스트 출력하기
	public void printDepartmentList() {
		for(int i=0; i<departments.length; i++) {
			System.out.println(departments[i]);
		}
	}
	//부서 추가하기
	public void addDepartment(int index, Department d) {
		departments[index] = d;
	}
	//부서 없애기
	public void removeDepartment(int index) {
		departments[index] = null;
	}
	public Department getDepartment(int i) {
		return departments[i];
		
	}
}
