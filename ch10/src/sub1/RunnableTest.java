package sub1;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 러너블 실습하기
 */

class Task extends Thread {

	@Override
	public void run() {
		
		for(int i =0;i<10; i++) {
			System.out.println("Task 실행...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class RunnableTest {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		
		tr1.start();
		tr2.start();
		
		System.out.println("프로그램 종료...");
	}
}
