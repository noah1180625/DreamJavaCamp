package dreamschool.cscourse.chapter05;

public class ConditionIfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int age = 2;
		
		if(age >= 19) {
			System.out.println("성인입니다");
			System.out.println("입장하세요");
		}
		else if (age >= 13) {
			System.out.println("청소년입니다");
			System.out.println("조금만기다려주세요");
		}
		else {
			System.out.println("어린이입니다");
			System.out.println("나가노세요");
		}
	}

}
