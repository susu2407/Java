package sub3;

public class CountThread extends Thread {

	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		
		for(int i =1; i<=100; i++ ) {
			
			// count.setNum(i); // Count class의 setNum 메서드와 연결되어 있음.setNum(int i)-> setNum()으로 변경하면서 맞춰서 수정함.
			count.setNum();		// 호출만 되도록 하여, 100번만 하도록 만듦.
			
		}
	}
}
