package objet;

public class Journal {
	private String message;
	public Journal() {
		
	}
	public void ajouterMessage(String texte) {
		this.message += texte;
	}
	
	public void afficherMessage() {
		System.out.println(message);
		this.message = "";
	}
}
