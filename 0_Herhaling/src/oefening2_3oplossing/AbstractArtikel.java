package oefening2_3oplossing;

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
	
	public AfdrukbareTekst getTekstInhoud() {
		return tekstInhoud;
	}

	public int getBreedte() {
		return breedte;
	}
}
