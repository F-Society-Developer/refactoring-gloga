package iut.bad;

public class Humain {
	protected String nom;
	protected String prenom;
	protected int age;

	public Humain() {
		super();
	}
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public void details() {
	    System.out.println(nom + " " + prenom + " " + age);
	}
}