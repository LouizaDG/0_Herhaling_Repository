package oefening2;

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
			System.out.println(i + 1 + "\t" + inhoud.substring(i * breedte, i * breedte + breedte));
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
		if(this.code == afdrukbareTekst.code){
			return true;
		}else{
			return false;
		}
	}
}
