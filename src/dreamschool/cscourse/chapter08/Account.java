package dreamschool.cscourse.chapter08;

public class Account {
	
	private String num ; 
	private int balance ;
	private double interestRate ;
	
	
	public Account(String num, int balance, double interestRate) {
		this.num = num;
		this.balance = balance;
		this.interestRate = interestRate;
		
		
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public String getNum() {
		return num;
	}
	
	public int calculateInterest() {
		int interest = (int)(this.balance * this.interestRate / 100 ) ;
		balance += interest;
		return interest;
	}
	
	
	

	}


