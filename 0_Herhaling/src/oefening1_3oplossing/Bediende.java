package oefening1_3oplossing;

public class Bediende extends Werknemer {
	
	private double loon;

	public Bediende(String nr, String naam, Datum datumInD, double loon) {
		super(nr, naam, datumInD);
		this.loon = loon;
	}

	@Override
	public double getMaandloon() {
		return loon;
	}

	@Override
	public void drukGegevens() {
		super.drukGegevens("bediende");
	}
	
}
