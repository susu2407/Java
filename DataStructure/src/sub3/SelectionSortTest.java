package sub3;
/*
 * 날짜 : 2025/07/08
 * 이름 : 이수연
 * 내용 : 선택 정렬 알고리즘 실습하기
 * 
 * 선택정렬
 *  - 알고리즘에서 배열의 원소를 정렬하는 가장 기본적인 방법
 *   - 정렬 알고리즘에는 선택정렬, 삽입정렬, 퀵정렬, 버블정렬 등이 있다.
 *   
 *   정렬단꼐
 *    1단계 : 배열의 첫번째 원소를 2,3,4,5번재 원소와 차례로 비교
 *    2단계 : 첫번재 원소보다 작은 원소를 찾으면 서로 자리 교환
 *    3단계 : 배열의 두번째 원소를 3,4,5번째 원소와 차례로 비교
 *    4단계 : 두번째 원소보다 작은 원소를 찾으면 서로 자리 교환
 *    5단계 : 위와 같이 최종 숫자가 하나 남을 때까지 반복 수행
 */

import java.util.Arrays;

public class SelectionSortTest {
	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0 ; i<4 ; i++) {
			
			for (int j = i+1 ; j<5 ; j++) {
				
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i]; //i와 j의 자리를 바꾼다.
					arr[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		// 정렬된 배열 출력하기
		for(int n : arr) {
			System.out.print( n + " ");
		}
	}

}
