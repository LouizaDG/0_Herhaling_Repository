package oefening1_2verbetert;

//import voor DecimalFormat verhuist van Arbeider en Bediende naar Werknemer
import java.text.DecimalFormat;

public abstract class Werknemer implements Bedrijf{
	
	private String nr;
	private String naam;
	private Datum datumInD;

	// DecimalFormat wordt gebruikt door zowel Bediende als Arbeider en hoort dus hier thuis.
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
	
	// dit is de gemeenschapelijk code van de arbeider en bediende klasse
	protected void drukGegevens(String typeWerknemer){
		drukWerknemer();
		System.out.println("\tStatuut: " + typeWerknemer + "\n\tLoon: " + format.format(getMaandloon()) + " euros\n");
	}

}
