package com.song.vo;

public class Song {
//	노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
//
//	- 노래의 제목을 나타내는 title
//	- 가수를 나타내는 artist
//	- 노래가 발표된 연도를 나타내는 year
//	- 국적을 나타내는 country
//
//	또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
//	- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
//	- 노래 정보를 출력하는 show() 메소드
//	- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
//	song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
//	1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
	
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public void show() {
		System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
	
	public Song(int year, String artist,String title , String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
