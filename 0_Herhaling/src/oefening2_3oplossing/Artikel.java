package oefening2_3oplossing;

import java.util.ArrayList;

public class Artikel extends AbstractArtikel{
	
	private ArrayList<String> auteurs;

	public Artikel(AfdrukbareTekst tekstInhoud, String auteur) {
		super(tekstInhoud);
		auteurs= new ArrayList<String>();
		this.auteurs.add(auteur);
	}
	
	public void voegAuteurToe(String auteur){
		auteurs.add(auteur);
	}
	
	public void drukAf(){
		for (String auteur : auteurs) {
			System.out.print(auteur + "\t");
		}
		System.out.println();
		super.drukAf();
	}
}
