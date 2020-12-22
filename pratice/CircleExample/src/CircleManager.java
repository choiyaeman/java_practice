import java.util.Scanner;

import com.circle.vo.Circle;

public class CircleManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
		int max = 0;
		for (int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius); // Circle 객체 생성
		}
//		for (int i = 0; i < c.length; i++) {
//			c[i].show();
//			sc.close();
//		}
		for (int i = 0; i < c.length; i++) {
			if (max < c[i].getRadius()) {
				max = c[i].getRadius();
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (max == c[i].getRadius()) {
				System.out.print("가장 면적이 큰 원은");
				c[i].show();
			}
			sc.close();
		}
	}
}
