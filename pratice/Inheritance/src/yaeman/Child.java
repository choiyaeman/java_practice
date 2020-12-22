package yaeman;

import jb.Korea;
import practice.Customer;
import practice.CustomerDAO;

public class Child {
	public static void main(String[] args) throws Exception{
		CustomerDAO dao = new CustomerDAO(10);
		Customer aa = new Customer("goldlife","pass","yaeman");
		System.out.println("주소값 첫번째"+aa);
		dao.insert(aa);//Custoemr 인스턴스를 생성자 호출하는데 String타입의 3개짜리를 호출하겠다. 그러면 Customer인스턴스 하나가 생겼다. 이 인자를 insert메서드로 전달
		dao.insert(new Customer("silverlife","pass","yaeman"));
		dao.insert(new Customer("bronzelife","pass","yaeman"));
		System.out.println(dao.selectAll());
		System.out.println("주소값 두번째"+dao.selectAll()[0]);
		System.out.println(dao.selectById("silverlife"));
	}
}
