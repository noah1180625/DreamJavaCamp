package dreamschool.cscourse.chapter10;

public class Teacher extends Person {
	private String subject ; 
	
	public Teacher(String name , String phoneNum, String subject) {
	   super(name , phoneNum) ;
	   this.subject = subject ;
	}
	public void teach() {
		System.out.println("수업을 해요.");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("다 같이 먹어요.");
	}

}
