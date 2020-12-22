package practice;
public class Customer {
	private String id; // 멤버필드는 동일 패키지에서 접근이 되므로 private으로 접근 안되게
	private String pwd;
	private String name;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	/*
	 * Customer c = new Customer("id1", "p1", "최예만"); 
	 * String id = c.getid();
	 * sop(id); //id1
	 */	
	public Customer(String id,String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
//	}
	
}