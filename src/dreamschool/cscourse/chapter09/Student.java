package dreamschool.cscourse.chapter09;

public class Student extends Person {
	private String department ; 
	
	public Student(String name , String phoneNum, String department) {
		super(name, phoneNum) ;
		this.department = department ; 
	}
	
	public void study() {
		System.out.println("������ �ؿ�.");
	
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("������ �Ծ��.");
	}

}
