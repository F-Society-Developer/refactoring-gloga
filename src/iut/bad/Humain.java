package iut.bad;

public class Humain implements Consommation {
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
	    System.out.println(toString());
	}
	public String toString() {
		return nom + " " + prenom + " " + age;
	}
	@Override
	public void manger() { System.out.println(nom + " mange."); }
	@Override
	public void boire()  { System.out.println(nom + " boit."); }
}