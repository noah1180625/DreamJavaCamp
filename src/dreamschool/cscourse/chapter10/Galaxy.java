package dreamschool.cscourse.chapter10;

public class Galaxy extends Mobile implements GooPlay{
	
	private String osVersion ;

	public Galaxy(String production) {
		super(production);
		
	}
	
	
	public String getOsVersion() {
		return osVersion;
	}


	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}


	@Override
	public void charge(int time) {
		System.out.println("Galaxy : 보조배터리 " + time + "분 충전");
	}


	@Override
	public void buy(String kind, int price) {
		// TODO Auto-generated method stub
		System.out.println("Galaxy : " + kind + "앱 을 " + price + "원에 구입하였습니다.");
		
	}
	

	
		
		
		
	}
	
	
	


