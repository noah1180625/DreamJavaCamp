package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int compNo = getHiddenNumber();
		
		for(int i = 1 ; i <= 10 ; i++) {
			int userNo = getUserInput();
			if (userNo == compNo) {
				System.out.println("�����մϴ�!!");
				System.out.println(i + "��° ��ȸ�Դϴ�. ���ڸ� �Է��ϼ��� : ");
			} else if (userNo > compNo) {
				System.out.println(userNo + "���� �۽��ϴ�");
			} else if (userNo < compNo) {
				System.out.println(userNo + " ���� Ů�ϴ�");
			}
		}
		System.out.println("�����մϴ�. ByeBye");
		

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
