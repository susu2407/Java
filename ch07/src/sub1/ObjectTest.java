package sub1;
/*
 *  날짜 : 2025/07/21
 *  이름 : 이수연
 *  내용 : 자바 Object 클래스 실습하기
 */

public class ObjectTest {
	
	public static void main(String[] args) {
		// 4. class Apple 제작 후 입력.
		// 자바의 보든 클래스는 Object를 상속하기 때문에 Object 타입으로 업케스팅 가능.
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		
		// toString() - 객체 정보 조회
		System.out.println(a1.toString());
		System.out.println(a2);// toString()은 default 메서드이기 때문에 객체이름으로 출력가능
		
		// 객체 비교
		if(a1 == a2) {
			System.out.println("a1과 a2가 주소값 같다.");			
		}else {
			System.out.println("a1과 a2가 주소값 다르다.");			
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2가 객체가 같다.");
			
		}else {
			System.out.println("a1과 a2가 객체가 다르다.");
			
		}
		
		
		// 객체 해시값 확인 (객체 식별번호, 고유값, 컴퓨터마다 다를 수 있음)
		System.out.println("a1 해시값 : " + a1.hashCode()); //135721597
		System.out.println("a2 해시값 : " + a2.hashCode()); //455659002
		
		
		
		
		
		
		
		
		
	}

}
