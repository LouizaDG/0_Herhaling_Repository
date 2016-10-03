package oefening1;

import java.text.DecimalFormat;

public class Bediende extends Werknemer {
	
	private double loon;
	DecimalFormat format = new DecimalFormat("#.###");

	public Bediende(String nr, String naam, Datum datumInD, double loon) {
		super(nr, naam, datumInD);
		this.loon = loon;
	}

	@Override
	public double getMaandloon() {
		return loon;
	}

	// implementatie hiervan in Werknemer drukGegevens(type = bediende)
	@Override
	public void drukGegevens() {
		this.drukWerknemer();
		System.out.println("\tStatuut: arbeider\n\tLoon: " + format.format(this.getMaandloon()) + " euros\n");
	}
	
}
