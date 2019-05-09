package dreamschool.cscourse.chapter09;

public class Student extends Person {
	private String department ; 
	
	public Student(String name , String phoneNum, String department) {
		super(name, phoneNum) ;
		this.department = department ; 
	}
	
	public void study() {
		System.out.println("공부을 해요.");
	
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("조별로 먹어요.");
	}

}
