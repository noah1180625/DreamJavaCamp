package dreamschool.cscourse.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan = 2; dan <= 5 ; dan++) {
			for(int i = 1; i <= 9 ; i++) {
				if(dan * i % 2 == 1) {
					System.out.println(dan + "*" + i + "=" + dan*1 );
				}
			}
		}

	}

}
