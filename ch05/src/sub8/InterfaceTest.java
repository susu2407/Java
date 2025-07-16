package sub8;
/*
 * 날짜 : 2025/07/16
 * 이름 : 이수연
 * 내용 : 인터페이스 실습하기
 */

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		// 인터페이스 역할1 - 통일된 표준화 설계
		
		RemoteControl lg = new RemoteLG();
		lg.pownON();
		lg.chUp();
		lg.soundDown();
		lg.pownOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.pownON();
		samsung.chUp();
		samsung.soundDown();
		samsung.pownOff();

		// 인터페이스 역할2 - 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new Power(bulb); // 업캐스팅
		
		socket.switchOn();
		socket.switchOff();
		
		
		// 인터페이스 역할3 - 다중상속 효과
		SmartTv smartTv = new SmartTv(); // 업캐스팅을 할 수 없음. 부모격에 해당되는 클래스 중 무엇을 해야할지 정할 수 없기 때문에.
		smartTv.procoess();
		
	}
	

}
