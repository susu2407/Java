package sub4;

public class Engineer extends Person {
	
	//속성
	private String field;
	
	//생성자
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;

	}

	
	 
	 //메서드
	 public void work() {
		 super.introduce();
		 System.out.println("저는 [" + field + "] 엔지니어 입니다.");
	 }
}
