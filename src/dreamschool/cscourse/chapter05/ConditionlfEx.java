package dreamschool.cscourse.chapter05;

public class ConditionlfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		
		if (age < 19) {
			System.out.println("19세 이상만 입장");
		    System.out.println("죄송합니다.");
		}
		
        if (age >= 19) {
        	System.out.println("성인입니다");
        	System.out.println("입장하세요.");
        }
	}

}
