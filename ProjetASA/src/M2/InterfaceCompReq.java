package M2;

public class InterfaceCompReq implements Interface{
	private String motEnStock;
	
	public InterfaceCompReq() {
		this.motEnStock = "";
	}
	public void addMot(String mot) {
		this.motEnStock = motEnStock + " " + mot;
		
	}
	public String getMot() {
		return this.motEnStock;
	}

}
