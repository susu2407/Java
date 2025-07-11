package sub2;

public class QueueTest {
	
	public static void main(String[] args) {
		
		int[] queue = new int[5];
				
		int front = 0;
		int rear = 0;
		
		// 데이터 삽입(enqueue)
		queue[rear++] = 10;
		queue[rear++] = 20;
		queue[rear++] = 30;
		queue[rear++] = 40;
		queue[rear++] = 50;
		
		for(int num : queue) {
			System.out.println(num + ", ");
		}
		System.out.println();
		
		// 데이터 삭제(dequeue)
		int removed = queue[front++];
		System.out.println("삭제 값 : " + removed);
		
		
	} // main end
	


}
