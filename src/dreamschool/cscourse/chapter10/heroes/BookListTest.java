package dreamschool.cscourse.chapter10.heroes;

import java.util.ArrayList;

import dreamschool.cscourse.chapter11.Book;

public class BookListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("Java의 정석" , 346, 15000));
		list.add(new Book("Oracle 11g" , 560, 18000));
		list.add(new Book("JSP 따라하기" , 271 , 12000));
		
		Book book = list.get(0);
		book.setName());
		
		for(int i = 0 ; i < list.size() ; i++) {
			Book book = list.get(i);
			System.out.println((i + 1) + " . " + 
			book.getName() + " ( " + book.getPage() + "page ) : " + book.getPrice() + "원");
			
		}

	}

} 
