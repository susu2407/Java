package sub8;

// 인터페이스 - 클래스 구현을 위한 오직 추상 메서드만 갖는 구조체
public interface RemoteControl {
	
	// interface 안에서는 추상메서드(abstract)만 선언 가능
	public abstract void pownON();
	public abstract void pownOff();
	
	public void chUp();		//abstract 생략
	public void chDown();
	
	public void soundUp();
	public void soundDown();

}

// 이제 구현클래스를 만들어야 함.
// RemoteLG class
// RemoteSamsung class