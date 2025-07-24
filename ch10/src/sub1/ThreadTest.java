package sub1;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 스레드 실습하기
 */

class SubThread extends Thread {
	private String name;
	public SubThread(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() { // 자식 스레드가 실현됨
		
		for (int i = 0; i<10; i++) {
			System.out.println(name + "작업 스레드 실행 : " + i);
		}
		
		System.out.println(name + "작업 스레드 종료...");
	}
}


public class ThreadTest {
	
	public static void main(String[] args) {
		
		// 작업 스레드 객체 생성
		SubThread st1 = new SubThread("ST1");
		SubThread st2 = new SubThread("ST2");
		
		// 작업 스레드 실행
		st1.start();
		st2.start();
		
		for (int i = 0; i<10; i++) {
			System.out.println("메인 스레드 실행 : " + i);
		}
		
		System.out.println("프로그램 종료...");		
		
	}
}
