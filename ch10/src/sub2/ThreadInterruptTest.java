package sub2;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 스레드 실습하기
 */

class SubThread extends Thread {
	
	@Override
	public void run() {
		
		int i = 1;
		
		try {
			while(true) {
				
				System.out.println("i : " + i);
				i++;
				
				Thread.sleep(1000); // 1초 대기
			}
		}catch(InterruptedException e) {
			e.printStackTrace();;
		}
	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		// 작업스레드 실행
		sub.start();
		
		try {
			// 메인스레드 5초 대기
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생 시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
	}

}
