import com.company.vo.Company;
import com.company.vo.Department;

public class CompanyMain {
//	(직원)Employee 클래스
//	 - 이름
//	 - 나이
//	 - 성별
//	 * Getters/Setters
//
//	(부서)Department 클래스
//	 - 부서명
//	 - 직원 여러명
//	 * 부서명 Get/Set
//	 * 직원리스트 출력하기
//	 * 직원 추가하기
//	 * 직원 짜르기
//
//	(회사)Company 클래스
//	 - 회사명
//	 - 부서 여러개
//	 * 회사명 Get/Set
//	 * 부서 리스트 출력하기
//	 * 부서 추가하기
//	 * 부서 없애기
//
//	메인 클래스
//	회사를 3개(삼성,SK,현대)
//	삼성은 부서가 1개
//	SK는 부서가 2개
//	현대는 부서가 3개
//	각 부서별 직원을 2명씩
	public static void main(String[] args) {
		Company c1 = new Company("삼성",1);
		Department d1 = new Department("인사팀", 2);
		c1.addDepartment(0, d1);
		c1.printDepartmentList();
		c1.getCompanyName();
		Company c2 = new Company("SK",2);
		Department d2 = new Department("총무팀", 2);
		Department d3 = new Department("인사팀", 2);
		c2.addDepartment(0, d2); //company에 있는 메소드 호출
		c2.addDepartment(1, d3);
//		d2.addEmployee(index, e);
		
		Company c3 = new Company("현대",3);

		c3.addDepartment(0, new Department("총무팀", 2));
		c3.addDepartment(1, new Department("인사팀", 2));
		c3.addDepartment(2, new Department("안부팀", 2));
		//c3.getDepartment(0).addEmployee(0, e);
		c3.printDepartmentList();
		c3.getDepartment(0).printEmployeeList();
		c3.getDepartment(1).printEmployeeList();
		
	}

}
