/**
 * Interface Heizung
 * 
 * @author Mehdi Jebali
 * @version 26.09.2022
 */

package smarthome;

public interface Heizung {
	
	/*
	 * Konstruktor
	 */
	// public Heizung() {}
	
	public void werteauslesen(Gebaeude gebaeude, Raum raum);
	
	public void checkSystem(Gebaeude gebaeude);
	
	public void exit(Gebaeude gebaeude);
	
	abstract interface Heizen {
		public void ruheZustand();

		public void heizunganMax();

		public void heizunganHalf();
		
		public void naechster_Zustand(Heizen neuer_zustand);
	}
	
	// Zustand RuheZustand
	interface RuheZustand extends Heizen {
		
		public void werteinlesen();
		
		public void temperaturvergleichen();
	}
	
	// Zustand HeizunganMax
	interface HeizunganMax extends Heizen {
		
		public void werteiMAxLeistung();
		
		public void temperaturvergleichen();
	}
	
	// Zustand HeizunganHalf
	interface HeizunganHalf extends Heizen {
		
		public void heizunganLessLeistung();
		
		public void temperaturvergleichen();
	}
}