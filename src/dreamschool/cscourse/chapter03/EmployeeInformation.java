package dreamschool.cscourse.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String enterYear = "2002";
		int thisYear = 2019;
		
		int intEnterYear = Integer.parseInt(enterYear);
		int emYear = thisYear - intEnterYear;
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + enterYear);
		System.out.println("�ٹ���� : " + emYear);
		
		System.out.println("�ٹ���� : " + (thisYear - intEnterYear));
		
		
		

	}

}
