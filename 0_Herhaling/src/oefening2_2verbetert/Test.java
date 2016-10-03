package oefening2_2verbetert;

public class Test {

	public static void main(String[] args) {
		
		AfdrukbareTekst afdrukbareTekst = new AfdrukbareTekst("a123", "Nor shapes of men nor beasts we ken the ice was all between.");
		afdrukbareTekst.print(10);
		
		Artikel artikel = new Artikel(new AfdrukbareTekst("a123", "Nor shapes of men nor beasts we ken the ice was all between."),"S. Coleridge");
		artikel.voegAuteurToe("J. Gillman");
		artikel.voegAuteurToe("W. Wordsworth");
		artikel.drukAf();
	}

}
