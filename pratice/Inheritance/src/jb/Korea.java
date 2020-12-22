package jb;

public class Korea {
	// public int population; //인구 //public -> 누구든지 쓸 수 있다.
	private int population; // 인구 //private -> 가장 접근 범위가 좁은곳. 해당 클래스에서만 쓸 수 있다
	String language; // 언어 //default상태 또는 package상태. 같은 패키지에서만 접근할 수 있는 범위, 즉 world.asia 패키지에서만 접근 가능
	public String capital; // 수도 //public -> 누구나 접근 가능
	
	public Korea() {
		
	}

	void k() {
		population = 10; // 다른 클래스에서 접근할수 있도록 통로를 마련
		language = "한국어";
		capital = "서울";
	}

	public void put(int population) { // 직접 접근x 우회적으로접근. 올바른 값을 대입할때만 값을 바꾸는작업
		if (population <= 0) {
			System.out.println("인구는 1명 이상이어야 합니다.");
			return;
		}
		this.population = population;// 매개변수의 값이 현재 population에 대입
	}

	public int take() { // 직접 접근x 우회적으로접근.
		return population;
	}
	
	public int takeAdd() {
		return population+1;
	}
	
	public double takeDouble() {
		return (double)population;
	}
}