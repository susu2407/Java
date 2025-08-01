package test6;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 연습문제6.자바 총정리
 */

class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}


class Student extends Person { // 빈칸 풀기 : extends Person
	protected String school;
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("학교 : " + this.school);
	}
}


class SalaryStudent extends Student { // 빈칸 풀기 : extends Student
	private String job;
	
	public SalaryStudent(String name, int age, String school, String job) {
		super(name, age, school);
		this.job = job;
	}


	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("학교 : " + this.school);
		System.out.println("직업 : " + this.job);
	}
}


public class Test08 {
	public static void main(String[] args) {
		
		Person kim = new Person("김유신", 24);
		Student kang = new Student("강감찬", 26, "부경대");
		SalaryStudent lee = new SalaryStudent("이순신", 27, "부산대", "개발자");
		
		Person[] people = { kim, kang, lee }; // 빈칸 풀기 : (컨닝 by 옆)Person[]
		 
		for (Person person : people) {
			person.show();
		}
	}
}
