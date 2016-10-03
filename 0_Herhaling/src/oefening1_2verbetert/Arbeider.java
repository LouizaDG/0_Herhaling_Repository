package oefening1_2verbetert;

//verhuist naar Werknemer
//import java.text.DecimalFormat;

public class Arbeider extends Werknemer {
	
	private double uurloon;
	private int aantalUren;

	//DecimalFormat wordt gebruikt door zowel Bediende als Arbeider en hoort dus in Werknemer thuis.
	//DecimalFormat format = new DecimalFormat("#.###"); -> verhuist naar Werknemer

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
		//In principe is noch this noch super hier nodig maar als je deze ter verduidelijking wil gebruiken gebruike jeb best super. om aan te tonen dat deze uit de superclass komt
		//this.drukWerknemer();
		//super.drukWerknemer(); dit is beter, maar is ook dubbele code, dit hoort in de super klasse thuis

		// duplicate code in Bediende buiten string "bediende"
		//System.out.println("\tStatuut: bediende\n\tLoon: " + format.format(this.getMaandloon()) + " euros\n");
		
		//gemeenschapelijke code in super klasse, dus we roepen hier een methode van de super klasse op
		super.drukGegevens("arbeider");
	}

}
