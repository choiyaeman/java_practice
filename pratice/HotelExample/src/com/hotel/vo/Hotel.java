package com.hotel.vo;

public class Hotel {
	 private Person[][] rooms;
	 private int totalPeople;
	 public static final String name = "하얏트";
	 
	 public Hotel(int numFloor, int numRoom) { //numFloor:층 수 numRoom:방 수
		 //변수 초기화
		 this.rooms = new Person[numFloor][numRoom];
		 this.totalPeople = 0;
	 }
	 
	 // 행동 정의 = 메소드
	 public boolean checkIn(int roomNum, Person person) {
		 int i = roomNum/100-1;
		 int j = roomNum%100-1;
		 // roomNum = 803
		 if(i >= rooms.length || j >= rooms[0].length) { // 3개의 층 10개 방이므로 층수 길이는 3 즉 rooms.length, 층번호는 10 rooms[0].length
			 System.err.println("찾는방이 없습니다.");
			 return false;
		 }
		 // roomNum = 302 >> i=2(3층), j=1(2호)
		 rooms[i][j] = person;
		 totalPeople++;
		 return true;
	 }
	 
	 public Person checkOut(int roomNum) { // Person타입의 리턴하는 인자가 roomNum인 checkOut함수, 체크아웃하는 것 이므로 방번호만 알면 된다.
		 int i = roomNum/100-1;
		 int j = roomNum%100-1;
		 // roomNum = 803
		 if(i >= rooms.length || j >= rooms[0].length) {
			 System.err.println("찾는방이 없습니다.");
			 return null;
		 }
		 // 사람이 있는 방일수도있고, 없는 방일수도있어 예를들어 303호에 사람이 없는데 체크아웃하면 null이 뜬다
		 Person checkoutPerson = rooms[i][j];
		 if(checkoutPerson != null) {
			 totalPeople--;
		 }
		 rooms[i][j] = null;
		 return checkoutPerson;
	 }
	 
	 public int getTotalPeople() {
		 return totalPeople;
	 }
	 
	 /**
	  * 방번호를 받아서 방에 있는 사람을 리턴
	  * 
	 * @param roomNum
	 * @return 투숙객 또는 방에 사람이 없을경우 null
	 */
	public Person info(int roomNum) {
		 int i = roomNum/100-1;
		 int j = roomNum%100-1;
		 // roomNum = 803
		 if(i >= rooms.length || j >= rooms[0].length) {
			 System.err.println("찾는방이 없습니다.");
			 return null;
		 }
		 return rooms[i][j];
	 }
	
}
