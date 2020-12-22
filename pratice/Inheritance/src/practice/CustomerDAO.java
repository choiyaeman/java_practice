package practice;

public class CustomerDAO {
	private Customer[] customers; // customer는 맴버필드이며 위치상 멤버필드는 자동 초기화된다.자료형인 참조형일때 null값으로 자동초기화.
	private int cnt;
//	// 이렇게 호출 될 수 있도록 제공해라 DAO에 생성자를 만들어서 10개짜리방이나 5개짜리 방.. 생성자의 매개변수가지고 조절하면 된다.
//	new CustomerDAO(5); //최대 5명까지 저장 가능한 customers생성
//	new CustomerDAO(10); //최대 10명까지 저장 가능한 customers생성

	public CustomerDAO(int size) {
		this.customers = new Customer[size];//customer가 들어갈 길이가 size개인 배열 생성 customers라는 ㅏ멤버변수에 넣겠다
	}

	public Customer[] selectAll() {// Customer[] 타입을 리턴하는 인자가 없는 selectAll함수
		
		Customer[] a = new Customer[cnt]; //길이가 cnt인 Customeer배열 생성 커스텀 배열 타입 a변수에 넣겟다
		for (int i = 0; i < cnt; i++) {
			a[i] = customers[i];
			//a[0] = customers[0]
		}
		return a; //함수 호출한사람한테 돌려주겠다
	}

	public void insert(Customer c) {// 접근 제어자가 퍼블릭인 리턴타입이 없는 insert메소드를 호출하는데 Customer타입의 인자 하나를 주겠다
					// void 타입을 리턴하는 인자가 Customer 인스턴스인 insert함수// c는 new Customer("goldlife1","pass","yaeman")
		System.out.println(c.getId());
		customers[cnt] = c;
		cnt++;
	}

	// select * from customers_table where id = 'goldlife'
	public Customer selectById(String id) { //Customer타입을 리턴하는 인자가 String 인스턴스변수인 selectbyid함수
		Customer[] all = this.selectAll();
		System.out.println("주소값 세번째"+all[0]);
		for (int i = 0; i < all.length; i++) {
			if (all[i].getId().equals(id)) {
				return all[i];
			}
		}
		return null;

	}

}