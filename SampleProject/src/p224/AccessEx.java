package p224;

class Sample {
	public int a;
	private int b;
	int c;
	protected int d;
}

class sub extends Sample {
		
	public void method() {
		this.d = 10;
		d = 10; // this 생략 가능
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; // 접근 불가.
		sample.c = 10;
	} 

}
