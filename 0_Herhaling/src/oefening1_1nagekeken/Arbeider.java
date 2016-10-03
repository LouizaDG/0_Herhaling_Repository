package oefening1_1nagekeken;

//import java.text.DecimalFormat;

public class Arbeider extends Werknemer {
	
	private double uurloon;
	private int aantalUren;

	// deze kan je verhuizen naar de superclass Werknemer
//	DecimalFormat format = new DecimalFormat("#.###");

	public Arbeider(String nr, String naam, Datum datumInD, double uurloon, int aantalUren) {
		super(nr, naam, datumInD);
		this.uurloon = uurloon;
		this.aantalUren = aantalUren;
	}

	@Override
	public double getMaandloon() {
		if(aantalUren <= 160){
			return aantalUren * uurloon;
		}else{
			return 160 * uurloon + (aantalUren - 160) * uurloon * 1.5;
		}
	}

	@Override
	public void drukGegevens() {
		this.drukWerknemer();

		// duplicate code in Bediende buiten string "bediende"
		System.out.println("\tStatuut: bediende\n\tLoon: " + format.format(this.getMaandloon()) + " euros\n");
	}

}
