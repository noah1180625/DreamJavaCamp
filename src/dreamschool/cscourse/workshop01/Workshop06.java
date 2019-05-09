package dreamschool.cscourse.workshop01;

public class Workshop06 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myDan = 9;
		for(int i = 1 ; i <= 9 ; i++) {
			for(int dan = 2 ; dan <= 9 ; dan++) {
				int result  = dan * 1 ;
				if (dan == myDan) {
					System.out.println(dan + " * " + i + " = " + result) 	;	
			} else {
				System.out.print(dan + " * " + i + " = " + result + " , " + "\t");
			}
		}
			System.out.println();

	}

}
}
