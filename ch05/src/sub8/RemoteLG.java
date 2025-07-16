package sub8;

public class RemoteLG implements RemoteControl { //인터페이스 구현
	
	@Override
	public void pownON() {
		System.out.println("LG pownOn...");		
	}
	
	@Override
		public void pownOff() {
		System.out.println("LG pownOff...");			
		}
	
	@Override
		public void chUp() {
		System.out.println("LG chUp...");			
		}
	
	@Override
		public void chDown() {
		System.out.println("LG chDown...");			
		}
	
	@Override
		public void soundUp() {
		System.out.println("LG soundUp...");			
		}
	
	@Override
		public void soundDown() {
		System.out.println("LG soundDown...");			
		}
	 
}
