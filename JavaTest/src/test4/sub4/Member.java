package test4.sub4;
	//속성
public class Member {
	private String name;		// 회원 이름
	private String memberId;	// 회원 아이디
	private Book borrowedBook;	// 회원이 대출한 도서
	
	// 생성자 - 매개변수, 초기화
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		borrowedBook = null;
	}
	
	////////////////////////////////////
	// 메서드
	// 도서를 대출하고, 회원이 갖는 대출 도서에서 추가
	public void borrowBook(Book bb) {
		borrowedBook = bb;		// 못 적음
		bb.borrowBook();		
	}
	
	
	// 도서를 반납하고, 회원이 갖는 대출 도서에서 제거
	public void returnBook(Book rb) {
		borrowedBook = null;	// 못 적음
		rb.returnBook();		
	}
	
	
	// 회원의 정보를 출력 (이름, 회원 ID, 대출한 도서)
	public void getMemberInfo() {
		System.out.println("회원명 : " 		+ name);
		System.out.println("아이디 : " 		+ memberId);
		
		// if 문 못 적음!!
		if(borrowedBook != null) {
			System.out.println("대출한 도서 : " + borrowedBook.getTitle()); // 못 적음.
		} else {
			System.out.println("대출한 도서 : 없음" );	// 그냥 '없음' 하면 되는지 몰랐음.
		}
	}
	
	
	
}

