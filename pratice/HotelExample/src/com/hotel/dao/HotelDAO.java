package com.hotel.dao;

import com.hotel.vo.Hotel;
// 생성자 없지? 메소드만 보여
public class HotelDAO {
	public int save(Hotel hotel) {
		return 1;
	}

	public int saveAll(Hotel[] hotels) {
		return 10;
	}

	public Hotel findById(String hotelId) {
//		return jdbc.executeQuery("select * from hotels where hotelId=${hotelId}");
		return new Hotel(1, 1);
	}

	public Hotel[] findAll() {
//		return jdbc.executeQuery("select * from hotels");
		return new Hotel[10];
	}
}
