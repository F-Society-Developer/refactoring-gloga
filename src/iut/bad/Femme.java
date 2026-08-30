package iut.bad;

public class Femme extends Humain{
	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	public static void main(String[] args) {
	    Homme h = new Homme("Rakoto", "Jean", 25);
	    Femme f = new Femme("Rasoa", "Lisa", 22);
	    h.ami(f, 100);
	}
}
