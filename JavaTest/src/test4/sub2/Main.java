package test4.sub2;
/*
 * 날짜 : 2025/07/17
 * 이름 : 이수연
 * 내용 : 자바 클래스 문제 (자바 연습문제4 - 문제 2.)
 */

public class Main {
	public static void main(String[] args) {
		Product product = new Product("P001", "키보드", 35000, 10);
		
		product.printProductInfo();
		System.out.println("--------------------");
		
		product.updatePrice(30000);
		System.out.println("--------------------");
		
		product.printProductInfo();
		System.out.println("--------------------");
		
		product.addStock(5);
		System.out.println("--------------------");
		
		product.printProductInfo();
		System.out.println("--------------------");		
	}
}
