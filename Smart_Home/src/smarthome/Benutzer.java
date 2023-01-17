package smarthome;

/**
 * Interface Benutzer
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

public interface Benutzer {
	
	
	/*
	 * Konstruktor
	 */
	// public Benutzer() {}

	/**
	 * Methode, die Daten eines User aktualisieren
	 * 
	 * @param name Name der User
	 * @return void
	 */
	public void datenaktualisieren(String name) ;	

	/**
	 * Methode, die Daten eines neuen User hinzufuegen
	 * 
	 * @param name Name der User
	 * @param handy handy von User zurueckgibt
	 * @param adresse adresse von User zurueckgibt
	 * @return void
	 */
	public void neueUserEinfuegen(String name, String handy, String adresse);
	
	/**
	 * Methode, die die Name von User zurueckgibt
	 * 
	 * @return Name der User
	 */
	public String getname() ;
	
	/**
	 * Methode, die die handy von User zurueckgibt
	 * 
	 * @return Handy der User
	 */
	public String handy() ;
	
	/**
	 * Methode, die die adresse von User zurueckgibt
	 * 
	 * @return Adresse der User
	 */
	public String adresse() ;
}
