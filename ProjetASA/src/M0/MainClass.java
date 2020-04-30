package M0;

import java.util.ArrayList;

import M1.Glue;
import M1.InterfaceFourn;
import M1.InterfaceReq;

public class MainClass {
	public Glue glue1;
	public InterfaceFourn fourn1;
	public InterfaceReq req1; 
	
	public Glue glue2;
	public InterfaceFourn fourn2;
	public InterfaceReq req2;
	
	
	public Glue glue3;
	public InterfaceFourn fourn3;
	public InterfaceReq req3;
	
	
	public String output1;
	public String output2;
	public String output3;
	
	public MainClass() {
		fourn1 = new InterfaceFourn();
		req1 = new InterfaceReq();
		
		fourn2 = new InterfaceFourn();
		req2 = new InterfaceReq();
		
		fourn3 = new InterfaceFourn();
		req3 = new InterfaceReq();

		
		ArrayList<InterfaceReq> listeDest = new ArrayList<>();
		listeDest.add(req2);
		listeDest.add(req3);
		glue1 = new Glue("Hello ", 1, req1, fourn1, listeDest );
		
		ArrayList<InterfaceReq> listeDest2 = new ArrayList<>();
		glue2 = new Glue("World", 2, req2, fourn2, listeDest2 );
		
		
		ArrayList<InterfaceReq> listeDest3 = new ArrayList<>();
		glue3 = new Glue("Nantes", 3, req3, fourn3, listeDest3 );
		
		glue1.traitement();
		glue1.envoyer();
		
		glue2.recevoir();
		glue2.traitement();
		glue2.envoyer();
		
		glue3.recevoir();
		glue3.traitement();
		glue3.envoyer();
		
		output1 = glue2.getMotRecu();
		output2 = glue3.getMotRecu();
		
	}

	public static void main(String[] args) {
		MainClass mainc = new MainClass();
		System.out.println(mainc.output1);
		System.out.println(mainc.output2);

	}

}
