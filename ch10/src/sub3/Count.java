package sub3;

public class Count {
	
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	
	//synchronized : 동기화 블럭, 스레드의 경합(Race Condition)을 막고 순차적으로 스레드 실행
	public synchronized void setNum() {
		// 임계영역 : 하나의 스레드가 해당 영역게 들어올 때 Lock 걸고 영영을 빠져나갈 때 해제
		this.num++; // (this 를 빼먹어서 최종 결과가 0이 되었음.)
		
	}

	// (과제)관심 있는 사람은 세마포어 로 내부 관계자를 이용하는 방법으로 진행하는 것도 해보면 좋을 것 같다.
	
}
