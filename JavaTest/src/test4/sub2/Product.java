package test4.sub2;

public class Product {
	
	private String productId;	// 상품 아이디
	private String productName;	// 상품 이름
	private int price;			// 상품 가격
	private int quantity;		// 재고 수량
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 새로운 가격을 받아 상품 가격을 수정A
	public void updatePrice(int newPrice) {
		this.price = newPrice;
		System.out.println(this.productName + " 가격 수정 됨");
	}
	
	//추가할 재고 수량을 받아 재고를 증가
	public void addStock(int addQuantity) {
		this.quantity += addQuantity;
		System.out.println(this.productName + " " +quantity + "개 재고 추가 됨");
	}
	
	
	// 상품 ID, 상품 이름, 가격, 재고 수량을 출력
	public void printProductInfo() {
		System.out.println("상품 Id : " + productId);
		System.out.println("상품 Id : " + productName);
		System.out.println("상품 Id : " + price);
		System.out.println("상품 Id : " + quantity);
	}

}
