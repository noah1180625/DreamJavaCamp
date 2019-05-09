package dreamschool.cscourse.chapter10;

public class FundAccount extends Account {
	private double earningRate ;
	private int principal;

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
		
		
		
	} 
	public FundAccount(String num, String name, int balance , double earningRate ) {
		super(num, name, balance);
		this.earningRate = earningRate ; 
		this.principal = balance;
		
	}

	public void earnMoney () {
		this.setBalance(this.getBalance() + 
				(int)(this.getBalance() * this.earningRate/100));
	}
	
	@Override
	public String toString() {
		String str = "" ;
		str += "°èÁÂ ¹øÈ£ : " + this.getNum() + "\n";
		str += "¿¹±İÁÖ : " + this.getName() + "\n";
		str += "ÀÜ¾× : " + this.getBalance() + "\n";
		str += "¼öÀÍ·ü : " + this.earningRate + "( " + this.principal + "¿ø )" ;
		return str;
	}
	

}
