package oefening2_2verbetert;

public abstract class AbstractArtikel {
	
	private AfdrukbareTekst tekstInhoud;
	private final int breedte = 20;
	
	public AbstractArtikel(AfdrukbareTekst tekstInhoud) {
		super();
		this.tekstInhoud = tekstInhoud;
	}
	
	public void drukAf(){
		getTekstInhoud().print(getBreedte());
	}
	
	//getters toevoegen
	public AfdrukbareTekst getTekstInhoud() {
		return tekstInhoud;
	}

	public int getBreedte() {
		return breedte;
	}
}
