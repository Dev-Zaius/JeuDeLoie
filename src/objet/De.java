package objet;
import java.util.Random;

public class De {
	public De() {
		// TODO Auto-generated constructor stub
	}
	public int lancer() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
}
