package oefening1_3oplossing;

import java.text.DecimalFormat;

public abstract class Werknemer implements Bedrijf {
	
	private String nr;
	private String naam;
	private Datum datumInD;

	DecimalFormat format = new DecimalFormat("#.###");

	public Werknemer(String nr, String naam, Datum datumInD) {
		super();
		this.nr = nr;
		this.naam = naam;
		this.datumInD = new Datum(datumInD);
	}
	
	public void drukWerknemer() {
		System.out.printf("\tWerknemer: %s %s\n\tDatum in dienst: ", nr, naam);
		datumInD.drukDatum();
	}

	@Override
	public abstract double getMaandloon();

	@Override
	public abstract void drukGegevens();
	
	protected void drukGegevens(String typeWerknemer) {
		drukWerknemer();
		System.out.println("\tStatuut: " + typeWerknemer + "\n\tLoon: " + format.format(getMaandloon()) + " euros\n");
	}

}
