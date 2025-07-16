package sub8;

public class RemoteSamsung implements RemoteControl {
	
	@Override
	public void pownON() {
		System.out.println("Samsung pownOn...");		
	}
	
	@Override
		public void pownOff() {
		System.out.println("Samsung pownOff...");			
		}
	
	@Override
		public void chUp() {
		System.out.println("Samsung chUp...");			
		}
	
	@Override
		public void chDown() {
		System.out.println("Samsung chDown...");			
		}
	
	@Override
		public void soundUp() {
		System.out.println("Samsung soundUp...");			
		}
	
	@Override
		public void soundDown() {
		System.out.println("Samsung soundDown...");			
		}
	


}
