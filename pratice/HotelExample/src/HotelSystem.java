import com.hotel.dao.HotelDAO;
import com.hotel.vo.Hotel;
import com.hotel.vo.Person;

public class HotelSystem {
	
	public static void main(String[] args) {
		Person yaeman = new Person("최예만", 27, "KR", 'M');
		Person trump = new Person("Donald Trump", 50, "US", 'M');
		Person sunhee = new Person("최선희", 30, "KR", 'F');
		Person jaeboo = new Person("정재부", 37, "KR", 'M');
		Person nakamura = new Person("나카무라", 27, "JP", 'M');
		
		Hotel hotel = new Hotel(3, 10);
		System.out.println(">>1. 체크인 <<");
		hotel.checkIn(302, yaeman);
		hotel.checkIn(201, sunhee);
		hotel.checkIn(110, jaeboo);
		hotel.checkIn(105, trump);
		hotel.checkIn(207, nakamura);
		System.out.println(Hotel.name);
		System.out.println(hotel.getTotalPeople());
		System.out.println(hotel.info(110));
		
		System.out.println(">>체크아웃<<");
		System.out.println(hotel.checkOut(105));
		System.out.println(hotel.getTotalPeople());
		System.out.println(hotel.info(105));
		
		// DAO 있어서 database와 vo를 연결해주는경우
		HotelDAO dao = new HotelDAO();
		dao.save(hotel);
		dao.findById("hyatt");
		dao.findAll();
	}

}
