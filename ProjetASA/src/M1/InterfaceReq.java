package M1;

import M2.InterfaceCompReq;

public class InterfaceReq {
	
	private InterfaceCompReq intComp;

	public InterfaceReq() {
		this.intComp = new InterfaceCompReq();
	}

	public void receiveMot(String mot) {
		intComp.addMot(mot);		
	}
	
	public String getMots() {
		return intComp.getMot();
	}

}
