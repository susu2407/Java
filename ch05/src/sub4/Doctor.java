package sub4;

public class Doctor extends Person {
	
	//속성
	private String specialty;
	
	//생성자
	public Doctor (String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	//메서드
	public void work() {
		super.introduce();
		System.out.println("의사이고 전공은 ["+specialty+"] 입니다.");
	}

}
