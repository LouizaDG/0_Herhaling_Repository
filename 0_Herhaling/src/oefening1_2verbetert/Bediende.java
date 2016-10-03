package oefening1_2verbetert;

//verhuist naar Werknemer
//import java.text.DecimalFormat;

public class Bediende extends Werknemer {
	
	private double loon;

	//DecimalFormat wordt gebruikt door zowel Bediende als Arbeider en hoort dus in Werknemer thuis.
	//DecimalFormat format = new DecimalFormat("#.###"); -> verhuist naar Werknemer

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
		//In principe is noch this noch super hier nodig maar als je deze ter verduidelijking wil gebruiken gebruike jeb best super. om aan te tonen dat deze uit de superclass komt
		//this.drukWerknemer();
		//super.drukWerknemer(); dit is beter, maar is ook dubbele code, dit hoort in de super klasse thuis

		// duplicate code in Arbeider buiten string "arbeider"
		//System.out.println("\tStatuut: arbeider\n\tLoon: " + format.format(this.getMaandloon()) + " euros\n");
		
		//gemeenschapelijke code in super klasse, dus we roepen hier een methode van de super klasse op
		super.drukGegevens("bediende");
	}
	
}
