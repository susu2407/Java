package sub1;
/*
 * 날짜 : 2025/07/08
 * 이름 : 이수연
 * 내용 : 배열 실습하기
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 배열
		int[] arr1 = { 1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		boolean[] arr4 = {true, false, true, true, false};
		
		// 배열 원소
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr2[1]);
		System.out.println("arr1[2] : " + arr3[2]);
		
		// 배열 길이
		System.out.println("arr1 배열 길이 : " + arr1.length); // length : 배열의 원소(칸)의 개수
		System.out.println("arr2 배열 길이 : " + arr2.length);
		System.out.println("arr3 배열 길이 : " + arr3.length);
		
		// 배열 반복문
		for(int i=0 ; i < arr1.length; i++) {			
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		for(int num : arr1) {
			System.out.println("num : " + num);
		}
		
		for(char name : arr2) { 
			System.out.println("name : " + name);
		}
		
		for(String city : arr3) {
			System.out.println("city : " + city);
		}
		
		// 1차원 배열 : 수직선
		int[] scores = { 80, 60, 78, 62, 92};
		
		int total = 0;
		
		for(int score : scores) { 
			total += score;
		}
		System.out.println("총합 : " + total);
		
		// 2차원 배열 : x축, y축 or 3*3행렬
		int[][] arr2d = {{1,2,3},
						 {4,5,6},
						 {7,8,9}};
		
		for(int i=0; i<arr2d.length; i++) {
			
			for(int j=0 ; j<arr2d[i].length; j++) {
				System.out.printf("arr2d[%d][%d] : %d\n", i, j, arr2d[i][j]);
				//실전성은 없다. 데이터 구조를 익히기 위해서 학습 중.
			}
		}
		
		// 3차원 배열 : x,y,z축
		int[][][] arr3d = {{{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}},
						   {{10, 11, 12},
							{13, 14, 15},
							{16, 17, 18}},
						   {{19, 20, 21},
							{22, 23, 24},
							{25, 26, 27}}};
		
		for(int a=0 ; a<arr3d.length; a++) {
			
			for(int b=0 ; b<arr3d.length ; b++) {
				
				for(int c=0; c<arr3d.length ; c++) {
					
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);
					
				}
			}
		}
		
		
		
	}

}//의지!!
