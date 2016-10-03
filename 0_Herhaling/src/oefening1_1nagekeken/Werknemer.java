package oefening1_1nagekeken;

import java.text.DecimalFormat;

public abstract class Werknemer implements Bedrijf{
	
	private String nr;
	private String naam;
	private Datum datumInD;

	// Wordt gebruikt door zowel Arbeider als Bediende
	DecimalFormat format = new DecimalFormat("#.###");

	public Werknemer(String nr, String naam, Datum datumInD) {
		super();
		this.nr = nr;
		this.naam = naam;
		this.datumInD = new Datum(datumInD);
	}
	
	public void drukWerknemer(){
		System.out.printf("\tWerknemer: %s %s\n\tDatum in dienst: ", nr, naam);
		datumInD.drukDatum();
	}

	@Override
	public abstract double getMaandloon();

	@Override
	public abstract void drukGegevens();

}
