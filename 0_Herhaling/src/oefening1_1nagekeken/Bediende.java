package oefening1_1nagekeken;

//import java.text.DecimalFormat;

public class Bediende extends Werknemer {
	
	private double loon;

	//  deze kan je verhuizen naar de superclass Werknemer
//	DecimalFormat format = new DecimalFormat("#.###");

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
		// In principe is noch this noch super hier nodig maar als je deze ter verduidelijking wil gebruiken gebruike jeb best super. om aan te tonen dat deze uit de superclass komt
//		this.drukWerknemer();
		super.drukWerknemer();
//		drukWerknemer();

		// duplicate code in Arbeider buiten string "arbeider"
		System.out.println("\tStatuut: arbeider\n\tLoon: " + format.format(this.getMaandloon()) + " euros\n");
	}
	
}
