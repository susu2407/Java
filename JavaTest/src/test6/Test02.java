package test6;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 연습문제6.자바 총정리
 */

public class Test02 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 0; i < 7; i++) {
			
			if (i <= 3)
				count++;
			else
				count--;
			
			for (int j = 1; j < 5 - count; j++)
				System.out.print("☆");
			
			for (int k = 1; k<=(count*2-1) ; k++) // 빈칸 입력 : k<=(count*2-1)
				System.out.print("★");
			
			for (int j = 1; j < 5 - count; j++)
				System.out.print("☆");
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}
