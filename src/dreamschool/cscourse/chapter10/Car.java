package dreamschool.cscourse.chapter10;

public class Car implements Washer {
	private int OilSize;
	
	public void go(int distance) {
		System.out.println(distance + "km �̵��մϴ�");
	}

	public int getOilSize() {
		return OilSize;
	}

	public void setOilSize(int oilSize) {
		OilSize = oilSize;
	}

	@Override
	public void wash() {
		System.out.println("�����մϴ�.");
		
	}
	

	}
	
	


