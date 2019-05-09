package dreamschool.cscourse.chapter10;

public class Account {
	private String Num ;
	private String name ; 
	private int balance ;
		
	
	public Account(String num, String name, int balance) {
		Num = num;
		this.name = name;
		this.balance = balance;
		
		
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		String str = "";
		str += "°èÁÂ ¹øÈ£ : " + Num + "\n";
		str += "¿¹±ÝÁÖ : " + name + "\n";
		str += "ÀÜ¾× : " + balance + "\n";
		return str;
		
		
	
	

	}
	}
