package test4.sub5;

public class Subject {
	// 속성
	private String subName;		// 과목 이름
	private Student[] students;	// 과목을 수강하는 학생 배열
	private int studentCount;	// 현재 수강 중인 학생 수
	
	// 생성자
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}

	//메서드
	//학생을 과목에 추가
	public void addStudent(Student std) {
	
		students[studentCount++] = std;
		
	} 
	
	//과목 이름과 수강한 학생들의 이름 출력
	public void printSubjectInfo() {
		
		System.out.println("과목명 : " + this.subName);
		
		System.out.print("수강생 : ");
		
		for(int i =0; i<studentCount; i++) {
			System.out.print(students[i].getName() + ", ");
		}
		
		System.out.println(); // 개행
	}
	
	//속성 subName의 Getter
	public String getSubName() {
		return subName;
	}

}
