package test4.sub4;
	//속성
public class Book {
	private String title;		// 도서제목
	private String author; 		// 저자
	private String isbn;		// 도서번호
	private boolean isBorrowd;	// 도서 대출 여부
	
	// 생성자 - 매개변수 초기화
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	////////////////////////////////
	//메서드
	
	// 도서가 대출되지 않은 상태라면 대출
	public void borrowBook() {
		
		if(this.isBorrowd) { // this 생각 못함
			System.out.println(this.title + " 이미 대출됨"); // else 생각 못함!!
			
		} else {
			this.isBorrowd = true;
			System.out.println("도서대출 : " + this.title);
		}
	}
	
	// 도서가 대출된 상태라면 반납
	public void returnBook() {
		System.out.println("도서반납 : " + this.title);		
	}
	
	// 도서의 정보를 출력(제목, 저자, ISBN, 대출 여부)
	public void getBookInfo() {
		System.out.println("도서명 : " 	+ title);
		System.out.println("저자 : " 	+ author);
		System.out.println("ISBN : "	+ isbn);
		System.out.println("대출여부 : " 	+ (isBorrowd ? "불가능" : "가능"));
	}
	
	
	
	// 속성 title's Getter
	public String getTitle() {
		return title;
	}
	

}
