package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computerScience = getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double JavaProgramming = getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double sing = getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double exercise = getUserInput();
        System.out.println( "==============================" );
        
        double total = (computerScience + JavaProgramming + math + sing + exercise) /5 ;
        System.out.println( "������ " + total + "�� �Դϴ�." );
        if(total >= 3.7 ) {
        }else if (computerScience >= 2.5 && JavaProgramming >= 2.5 && math >= 2.5 && sing >= 2.5 && exercise >= 2.5  )
        System.out.println("���� �б� ���б� ����� �Դϴ�");
        }
    

    
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
   }
}
