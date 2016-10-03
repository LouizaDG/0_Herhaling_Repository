package oefening1_3oplossing;

public class Arbeider extends Werknemer {
	
	private double uurloon;
	private int aantalUren;

	public Arbeider(String nr, String naam, Datum datumInD, double uurloon, int aantalUren) {
		super(nr, naam, datumInD);
		this.uurloon = uurloon;
		this.aantalUren = aantalUren;
	}

	@Override
	public double getMaandloon() {
		if(aantalUren <= 160) {
			return aantalUren * uurloon;
		} else {
			return 160 * uurloon + (aantalUren - 160) * uurloon * 1.5;
		}
	}

	@Override
	public void drukGegevens() {
		super.drukGegevens("arbeider");
	}

}
