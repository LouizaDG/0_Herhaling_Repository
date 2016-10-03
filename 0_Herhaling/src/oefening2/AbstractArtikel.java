package oefening2;

public abstract class AbstractArtikel {
	
	private AfdrukbareTekst tekstInhoud;
	private final int breedte = 20;
	
	public AbstractArtikel(AfdrukbareTekst tekstInhoud) {
		super();
		this.tekstInhoud = tekstInhoud;
	}
	
	public void drukAf(){
		this.tekstInhoud.print(breedte);
	}
}
