package com.tv.vo;

public class TV {
	private String name;
	private int year;
	private int size;
	
	public TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(name+","+year+","+size);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "TV [name=" + name + ", year=" + year + ", size=" + size + "]";
	}	

}
