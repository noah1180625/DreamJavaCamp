package dreamschool.cscourse.chapter10;

public class Iphone extends Mobile {
	private String color ;

	public Iphone(String production) {
		super(production);
		
	} 
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void charge(int time) {
		System.out.println("Iphone : " + time + "분 충전했더니 Full!!!");
	}
	
	

}
