package M1;

import java.util.ArrayList;

public class InterfaceFourn {

	private String mot;
	public InterfaceFourn() {
		this.mot="";
	}

	

	public String getMot() {
		return mot;
	}



	public void setMot(String mot) {
		this.mot = mot;
	}



	public void envoyer(ArrayList<InterfaceReq> interfacesDestinataires) {
		for(InterfaceReq req: interfacesDestinataires) {
			req.receiveMot(mot);
		}
	}
	
	
}
