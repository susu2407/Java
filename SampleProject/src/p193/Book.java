package p193;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 4-4 생성자 선언 및 활용 연습
 */

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrine = new Book("어린왕자", "생텍쥐페리");
		
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrine.title+ " " + littlePrine.author);
		System.out.println(loveStory.title + " " +loveStory.author);
		
	}

}
