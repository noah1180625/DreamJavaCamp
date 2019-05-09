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
		System.out.println("���ͷ� :" + this.earningRate + "%");
		System.out.println("������ �߻��Ͽ����ϴ�.");
	}
	
	@Override
	public void openAccount() {
		System.out.println("���¸� �����մϴ�.");
		System.out.println("�ݵ� ���¹�ȣ : " + this.getNum());
		System.out.println("������ : " + this.getName());
		System.out.println("�ܾ� : " + this.getBalance() + "��");
		System.out.println("���ͷ� : " + this.earningRate + "%");
	
	}
	

}
