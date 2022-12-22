package objet;

public class Case {
	protected int numCase;
	
	public Case(int numCase) {
		this.numCase = numCase;
	}
	
	public String getNom() {
		return " numero " + numCase ;
	}
	
	private Case caseSuivante(Oie oie , int numCaseDestination) {
		// renvoit sur quelle case aller
		Plateau plateau = oie.getPlateau();
		return plateau.donnerCase(numCaseDestination);
	}
	private Case arrivee(Oie oie) {
		// actions à effectuer quand l'oie tombe sur la case
		Plateau plateau = oie.getPlateau();
		return plateau.donnerCase(numCase);
	}
	public Case depart(Oie oie) {
		// appelle caseSuivante puis arrivee		
		Case caseDestination = caseSuivante(oie,this.numCase + oie.lancerDe() - 1);
		this.numCase = caseDestination.numCase;
		Case caseFinale = arrivee(oie);
		this.numCase = caseFinale.numCase;
		return arrivee(oie);
	}
}
