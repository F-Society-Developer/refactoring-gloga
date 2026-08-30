package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
	private List<Humain> amis = new ArrayList<>();
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
	
	

	public void ami(Humain autre, int duree) {
	    this.amis.add(autre);
	    autre.amis.add(this);
	}
}