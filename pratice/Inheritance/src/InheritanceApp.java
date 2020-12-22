class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	// Overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2)+v3; // this는 자기 자신을 가리킨다. 자기 자신의 sum메서드를 실행시킨 결과 에다가 v3를 더한 것.
	}
}

class Cal3 extends Cal{ // Cal 클래스가 가지고 있는 변수와 메소드를 확장해서 상속해서 다른 클래스가 갖도록 하는것 => 재사용성을 높이고 유지보수 편이성을 높이고 가독성 높이고 코드의 양을 줄이는 목적을 달성
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding => 부모 클래스의 기능을 올라타서 덮어쓰기한것 즉 메서드를 재정의
	public int sum(int v1, int v2) { 
		System.out.println("Cal3!!!");
		return super.sum(v1,v2); // 부모 클래스인 Cal에 sum을 가리키게 된다. super는 부모
	}

}

public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2,1,1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,2));
		System.out.println(c3.minus(2,1));
		
		
	}

}
class Cal2 {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}
