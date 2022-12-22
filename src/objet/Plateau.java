package objet;
import objet.Case;

public class Plateau {
	private int NB_CASES = 63;
	private Case[] cases = new Case[NB_CASES];
	
	public Plateau() {
		for (int i = 1 ; i <= NB_CASES ; i++) {
			this.cases[i-1] = new Case(i);
		}
	}
	
	public Case caseDebutPartie() {
		return ;
	}
	
	public Case donnerCase(int numCase) {
		return this.cases[numCase];
	}

}
