package dreamschool.cscourse.chapter09;

public class Cat extends Animal {
	private String name ;
	
	

	
	public Cat(int age, String kind , String name) {
		super(age, kind);
		this.name = name ;
		

		
	}
	@Override
	public String toString() {
		return this.name + "梓端亜 硲窒鞠醸革推 せせせせせせせ";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	} 
	
	public void hunt () {
		System.out.println("巣研 説聖襖醤!!");
	}
	
	public void play () {
		System.out.println("乞柵 且戚亜 疏焼推~~");
	
	}

}
