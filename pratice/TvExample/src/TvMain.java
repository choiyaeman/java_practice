import com.tv.vo.TV;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//		public static void main(String[] args) {
//		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
//		   myTV.show();
//		}
//		LG에서 만든 2017년형 32인치 TV
		TV myTV = new TV("LG", 2017, 32);
		System.out.println(myTV.getName()+","+myTV.getYear()+","+myTV.getSize());
		myTV.show();
	}

}
