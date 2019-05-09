package dreamschool.cscourse.chapter09;

public class FundAccount extends Account {
	private double earningRate ;

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
		
		
		
	} 
	public FundAccount(String num, String name, int balance , double earningRate) {
		super(num, name, balance);
		this.earningRate = earningRate ; 
		
	}

	public void earnMoney () {
		System.out.println("수익률 :" + this.earningRate + "%");
		System.out.println("수익이 발생하였습니다.");
	}
	
	@Override
	public void openAccount() {
		System.out.println("계좌를 개설합니다.");
		System.out.println("펀드 계좌번호 : " + this.getNum());
		System.out.println("예금주 : " + this.getName());
		System.out.println("잔액 : " + this.getBalance() + "원");
		System.out.println("수익률 : " + this.earningRate + "%");
	
	}
	

}
