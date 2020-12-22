import java.util.Scanner;

import com.dict.vo.Dictionary;

public class DictApp {

	public static void main(String[] args) {
//		class Dictionary {
//			   private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
//			   private static String[] eng = {"love", "baby", "money", "future","hope"};
//			   public static String kor2Eng(String word) { /*검색 코드 작성*/ }
//			}
//			한영 단어 검색 프로그램입니다.
//			한글 단어?희망
//			희망은 hope
//			한글 단어?아가
//			아가는 저의 사전에 없습니다.
//			한글 단어?아기
//			아기는 baby
//			한글 단어?그만
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String search = sc.next();
			if(search.equals("그만")) break;
			String eng = Dictionary.kor2Eng(search);
			if(eng.equals("false")) {
				System.out.println(search+"는 저의 사전에 없습니다.");
			} else {
				System.out.println(eng);
			}	
		}
		sc.close();
	}

}
