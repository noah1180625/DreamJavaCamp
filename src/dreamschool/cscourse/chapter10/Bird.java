package dreamschool.cscourse.chapter10;

public class Bird extends Animal implements Flyable {
	
	private String habitat ;

	public Bird(String kind, int age, String habitat) {
		super(kind, age);
		this.habitat = habitat ;
		// TODO Auto-generated constructor stub
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void fly() {
		System.out.println("���ư���.");
		
	}

	@Override
	public void spreadWings() {
		// TODO Auto-generated method stub
		System.out.println("������ ��ģ��.");
		
	} 
	
	

}
