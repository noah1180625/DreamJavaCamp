package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        System.out.println(americano);
        System.out.print( " ī��� �ֹ� ���� : " );
        int caffelatte = getUserInput();
        System.out.println(caffelatte);
        System.out.print( " ���̱� �ֹ� ���� : " );
        int beigeul = getUserInput();
        System.out.println(beigeul);
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheese = getUserInput();
        System.out.println(creamcheese);
        
        int ame = 2000 * americano;
        int latte = 3000 * caffelatte;
        int bei = 1500 * beigeul;
        int cheese = 500 * creamcheese;
       
        System.out.println("========= �ݾ� ==========");
        System.out.println(" �Ƹ޸�ī�� : " + ame + "��");
        System.out.println(" ī��� : " + latte + "��");
        System.out.println(" ���̱� : " + bei + "��");
        System.out.println(" ũ��ġ�� : " + cheese + "��");
        
        int total = ame + latte + bei + cheese;
                
        System.out.println("=========================");
        System.out.println("�� ���� �ݾ� : " + total + "��");
        if(total < 12000) {
        	System.out.println("����Ʈ : 0��"); 
        }else if(total >= 12000 && total <= 30000) {
        	System.out.println("����Ʈ : " + total/100 * 1 + "��");
        }else if( total >= 30000) {
        	System.out.println("����Ʈ : " + total/100 * 2 + "��");
        	
        }
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
