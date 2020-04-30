package M1;

import java.util.ArrayList;
import java.util.HashMap;

import M2.Composant;

public class Glue {

	private InterfaceReq intReq;
	private InterfaceFourn intFourn;
	private Composant compo;
	private String motRecu;
	private ArrayList<InterfaceReq> interfacesDestinataires;
	
	private HashMap<Integer, String> stockage;
	
	
	public Glue(String mot, int roleNum, InterfaceReq intReq, InterfaceFourn intFourn, ArrayList<InterfaceReq> interfacesDestinataires) {
		this.compo = new Composant(mot, roleNum);
		this.intReq = intReq;
		this.intFourn = intFourn;
		this.motRecu = "";
		this.interfacesDestinataires = interfacesDestinataires;
		this.stockage= new HashMap<>();
	}
	

	public void recevoir() {		
		motRecu = this.intReq.getMots();
	}
	
	public void traitement() {
		motRecu = motRecu + " " + this.compo.getMot();
	}

	public void envoyer() {
		intFourn.setMot(motRecu);
		intFourn.envoyer(interfacesDestinataires);
	}

	public InterfaceReq getIntReq() {
		return intReq;
	}

	public void setIntReq(InterfaceReq intReq) {
		this.intReq = intReq;
	}

	public InterfaceFourn getIntFourn() {
		return intFourn;
	}

	public void setIntFourn(InterfaceFourn intFourn) {
		this.intFourn = intFourn;
	}

	public String getMotRecu() {
		return motRecu;
	}
	
	public void setMotRecu(String motRecu) {
		this.motRecu = motRecu;
	}

	public Composant getCompo() {
		return compo;
	}

	public void setCompo(Composant compo) {
		this.compo = compo;
	}
	
}
