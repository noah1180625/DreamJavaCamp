package dreamschool.cscourse.workshop03;

public class Ship {
	public String modelName;
	public int maxSpeed;
	public int numberLimit;
	public int replacement;
	public boolean available;
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.replacement = replacement;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getNumberLimit() {
		return numberLimit;
	}
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	public int getReplacement() {
		return replacement;
	}
	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}




	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		System.out.println(" �� �� �� : " + replacement + "��");
	}
}
