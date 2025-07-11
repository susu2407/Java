package test1;
/*
 * 날짜 : 2025/07/08
 * 이름 : 이수연
 * 내용 : 자바 반복문 실습하기
 */

public class Test09 {
	public static void main(String[] args) {
		
		int count;
		
		for(int i=1 ; i<=9 ; i++) {
			
			if(i<=5) {
				count = i;
			}else {
				count = 10-i;
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");		
			
		}
	}

}
