package objet;
import objet.*;
public class Oie {
	private String couleur;
	private Plateau plateau;
	private Journal journal;
	private Case casePlateau;
	
	public Oie(String s,Plateau plateau,De des) {
		this.couleur = s;
		this.plateau = plateau;
		this.casePlateau = this.plateau.donnerCase(0);
	}
	
	public Plateau getPlateau() {
		return this.plateau;
	}
	
	public int lancerDe() {
		De de = new De();
		return de.lancer();
	}
	public void ajouterMessage(String message) {
		this.journal.ajouterMessage(message);
	}
	public boolean action() {
		this.casePlateau.depart(this);
	}
}
