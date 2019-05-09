package dreamschool.cscourse.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building build = new Building();
		build.name = "국제선 타워" ; 
		build.address = "김포동" ;
		build.totalFloor = 5 ;
		
		System.out.println("건물 명 : " + build.name);
		System.out.println("주소 : " + build.address);
		System.out.println("전체 층 수 : " + build.totalFloor);
		
		build.moveElevator();
		build.changeAddress("비행로");
		
		System.out.println("새 주소 : " + build.address);

	}

}
