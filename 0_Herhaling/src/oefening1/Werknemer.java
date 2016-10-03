package oefening1;

public abstract class Werknemer implements Bedrijf{
	
	private String nr;
	private String naam;
	private Datum datumInD;

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
