package M2;

public class Composant {
	private String mot;
	private int roleNum;
	
	public Composant(String mot, int roleNum) {
		this.mot = mot;
		this.roleNum = roleNum;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public int getRoleNum() {
		return roleNum;
	}

	public void setRoleNum(int roleNum) {
		this.roleNum = roleNum;
	}

}
