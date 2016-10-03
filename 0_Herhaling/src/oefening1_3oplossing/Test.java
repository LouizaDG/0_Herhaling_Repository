package oefening1_3oplossing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Werknemer a1 = new Arbeider("A23", "Jan Janssens", new Datum(1,2,2008), 20, 140);
		Werknemer a2 = new Arbeider("A24", "Tim Janssens", new Datum(1,2,2006), 20, 160);
		Werknemer b1 = new Bediende("B23", "Tom Janssens", new Datum(1,2,2008), 2000);
		Werknemer b2 = new Bediende("B24", "Jon Janssens", new Datum(1,2,2006), 3500);
		
		List<Werknemer> werknemerList = new ArrayList<Werknemer>();
		werknemerList.add(a1);
		werknemerList.add(a2);
		werknemerList.add(b1);
		werknemerList.add(b2);
		
		List<Double> loonList = new ArrayList<Double>();
		Werknemer werknemerMetHoogsteLoon = a1;
		
		for (Werknemer werknemer : werknemerList) {
			werknemer.drukGegevens();
			loonList.add(werknemer.getMaandloon());
			if(werknemer.getMaandloon() > werknemerMetHoogsteLoon.getMaandloon()){
				werknemerMetHoogsteLoon = werknemer;
			}
		}
		
		System.out.println("De werknemer met het hoogste loon is: ");
		werknemerMetHoogsteLoon.drukGegevens();
		
	}
}
