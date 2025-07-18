package test4.sub5;

public class Student {
	// 속성
	private String name;		// 학생 이름
	private String studentid;	// 학생 아이디
	private Subject[] subjects;	// 학생이 수강하는 과목 배열
	private int[] scores;		// 학생의 각 과목 성적 배열
	private int subjectCount;	// 현재 수강 중인 과목 수
	
	// 생성자
	public Student(String name, String studentid) {
		this.name = name; 			// 학생 이름
		this.studentid = studentid;	// 학생 아이디
		subjects = new Subject[10];	// 학생이 수강하는 과목 배열
		scores = new int[10];		// 학생의 각 과목 성적 배열
		subjectCount = 0;			// 현재 수강 중인 과목 수
	}
	
	// 메서드
	// 과목을 수강 신청
	public void enrollSubject(Subject subject) {
		
		//학생이 듣는 과목 배열(subject)의 다음 위치(subjectCount)에 새로운 과목을 저장
		subjects[subjectCount] = subject;
		
		// 과목의 학생 리스트에 학생 추가. 학생과 과목을 양방향 연결.
		subject.addStudent(this);
		
		scores[subjectCount++] = 0;
		
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청 완료");
		
	}
	
	// 특정 과목의 성적 입력
	public void setScore(Subject subject,int score) {
		
		for(int i=0 ; i<subjectCount ; i++) {
			
			if(subjects[i].equals(subject)) { // 배열원소의 subject와 입력된 subject가 같으면
				scores[i] = score;			
				System.out.println(name + " - " + subject.getSubName() + " 점수 입력 완료");
			}		
			
		}

	}
	
	
	// 출력 - 학생의 이름, ID, 수강 과목 및 성적
	public void printStudentInfo() {
		System.out.println("학생명 : " + this.name);
		System.out.println("아이디 : " + this.studentid);
		System.out.println("성적");
		
		for(int i=0 ; i<subjectCount ; i++) {			
			System.out.println(" - " + subjects[i].getSubName() + ":" + scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}
}
