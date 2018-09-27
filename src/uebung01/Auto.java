package uebung01;

/*
 * Eine Klasse ist eine allgemeine Beschreibung von etwas.
 * Daraus werden dann einzelne Objekte erzeugt, die die Eigenschaften und 
 * 	Fähigkeiten (=Methoden) der Klasse haben
 */
public class Auto {
	
	//hier stehen globale Eigenschaften der Klasse
	//sie sind überall verfügbar, wenn kein "private" davor steht
	String marke;
	int baujahr;
	int ps;
	private String farbe;
	
	/*
	 * das is ein Konstruktor
	 * Er wird benutzt, um ein Objekt dieser Klasse zu erzeugen.
	 * Die Parameter müssen dabei gefüllt werden
	 */
	public Auto(String marke, int baujahr, int ps, String farbe) {
		//jetzt werden die Parameter an die Eigenschaften übergeben
		//das "this." macht den Code lesbarer --> this.marke bezieht sich auf die Eigenschaft, die global definiert wurde
		this.marke = marke;
		this.baujahr = baujahr;
		this.ps = ps;
		this.farbe = farbe;
	}
	
	//das ist ein Getter --> ein Helfermethode, die etwas zurückliefert
	//in diesem Fall ermöglicht diese MEthode den Zugriff auf die Farbe des Autos
	public String getFarbe() {
		return this.farbe;
	}
	
	//das ist ein Setter
	//wir ädern hier die Farbe des Autos, indem wir der MEthode die neue Farbe geben
	// und diese dann in den globalen Eigenschaften geändert wird
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	//diese Methode könnte das Auto geradeausfahren lassen, wenn sie gecalled wird
	public void fahreGeradeaus() {
		//hier könnte toller Code stehen
	}
	

}
