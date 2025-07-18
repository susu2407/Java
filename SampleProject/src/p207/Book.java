package p207;

//import java.util.Scanner;

public class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
//예제 4-4 필요
//public class BookArray {
//	public static void main(String[] args) {
//		Book [] book = new Book[2];
//		
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0; i< book.length; i++) {
//			System.out.println("제목>>");
//			String title = scanner.nextLine();
//			System.out.println("저자>>");
//			String author = scanner.nextLine();
//			book[i] = new Book(title, author);
//		}
//		
//		for(int i=0; i< book.length; i++) {
//			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
//		}
//	}
//}