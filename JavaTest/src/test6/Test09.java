package test6;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 연습문제6.자바 총정리
 */

enum Gender {
	MALE, FEMALE
}
class Man {
	public void print() {
		System.out.println("남자 입니다.");
	}
}
class Woman {
	public void print() {
		System.out.println("여자 입니다.");
	}
}
public class Test09 {
	public static void main(String[] args) {
		Object human1 = makeHuman(Gender.MALE);
		Object human2 = makeHuman(Gender.FEMALE);
		
		if (human1 instanceof Man) { // 빈칸 채우기 : instanceof
			Man man = (Man) human1;
			man.print();
		}
		
		if (human2 instanceof Woman woman) { // 빈칸 채우기 : instanceof
			woman.print();
		}
	}
	
	public static Object makeHuman(Gender gender) { // 빈칸 채우기 : Object (자바 오류 프로그램 도움 받음_이해50%)
		if (gender == Gender.MALE) {
			return new Man();
		} else if (gender == Gender.FEMALE) {
			return new Woman();
		}
		return null;
	}
}
