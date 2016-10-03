package oefening2_2verbetert;

public class AfdrukbareTekst implements Afdrukbaar{
	
	private String code;
	private String inhoud;
	
	public AfdrukbareTekst(String code, String inhoud) {
		super();
		this.code = code;
		this.inhoud = inhoud.replaceAll("\n", " ");
	}

	@Override
	public void print(int breedte) {
		for(int i = 0; i < getAantallijnen(breedte) ;i++){
			System.out.println(i + 1 + "\t" + getInhoud().substring(i * breedte, i * breedte + breedte));
		}
	}

	@Override
	public int getAantallijnen(int breedte) {
		int lijnen = inhoud.length() / breedte;
		if(inhoud.length() % breedte != 0){
			lijnen ++;
		}
		return  lijnen;
	}
	
	public boolean equals(AfdrukbareTekst afdrukbareTekst){

		// 1. Het vergelijken van 2 objecten laat je best over aan het object zelf. Daarom best de equals method van het object gebruiken
		// 2. Better practice is getters gebruiken ipv rechtstreeks de fields aan te spreken
			return afdrukbareTekst.getCode().equals(getCode());
		
		// 	Dit mag dan weg
		// 	if(this.code == afdrukbareTekst.code){
		//		return true;
		//	}else{
		//		return false;
		//	}
	}

	// Better practice is getters gebruiken ipv rechtstreeks de fields aan te spreken
	public String getCode() {
		return code;
	}
	
	//toevoegen
	public String getInhoud() {
		return inhoud;
	}
}
