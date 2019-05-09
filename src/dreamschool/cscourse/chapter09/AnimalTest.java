package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3 , "야옹이" , "페르시안") ;
		
		System.out.println(cat);
		
		System.out.println("이름 : " + cat.getName());
		System.out.println("나이 : " + cat.getAge() + "살");
		System.out.println("종류 : " + cat.getKind());
		
	    cat.run();
	    cat.hunt();
	    cat.play();
	    
	    System.out.println();
	    
	    Dog dog = new Dog( 2 , "멍멍이" , "시베리안 허스키");
	   
	    System.out.println("이름 : " + dog.getName());
		System.out.println("나이 : " + dog.getAge() + "살");
		System.out.println("종류 : " + dog.getKind());
		
		dog.run();
		dog.hunt();
		

	}

}
