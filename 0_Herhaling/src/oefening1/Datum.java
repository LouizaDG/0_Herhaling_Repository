package oefening1;

public final class Datum {
	
	private int dag;
	private int maand;
	private int jaar;
	
	public Datum(int dag, int maand, int jaar) {
		super();
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	public Datum(Datum datum) {
		this(datum.dag, datum.maand, datum.jaar);
	}
	
	public void drukDatum(){
		System.out.printf("%d/%d/%d\n", dag, maand, jaar);
	}
}
