package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAdditionEx {
	
	public static void main(String[] args) 		{
	int num1 = 5;
	int num2 = 10;
	
	ArrayList<Integer> list = new ArrayList();
	list.add(num1);
	list.add(num2);
	list.add(100);
	list.add(130);
	list.add(new Integer(56));
	
	
	int a = list.get(4);
	System.out.println(a);
	
	for(int i = 0 ; i < list.size() ; i++) {
		System.out.println(i);

}
	for(int i : list) {
		System.out.println(i);
	}
}
}
