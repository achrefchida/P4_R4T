package smarthome;

/**
 * Interface Gebäude
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

public interface Gebaeude {

	/*
	 * Konstruktor
	 */
	// public Gebäude() {}

	/**
	 * Methode, die das System ausschaltet
	 * 
	 * @return boolean
	 */
	public void  sysEin();

	/**
	 * Methode, die das System einschaltet
	 * 
	 * @return boolean
	 */
	public void sysAus();

	/**
	 * @return Zustand des System
	 */
	public boolean getzustandSys ();
	
	
	/**
	 * Methode, die die wünschwerte einstellen
	 * 
	 * @param raeume ist die Räume von einer Gebaude
	 * @param anzahlRaum ist die anzahl der Räume in einer Gebaude
	 * @return void
	 */
	void wunschwerte(RaumO[] raeume);	
	
	/**
	 * @return die Fläsche einer Gebäude
	 */
	public String getFlaeche() ;

	/**
	 * @param flaeche die Fläsche einer Gebäude
	 */
	public void setFlaeche(String flaeche) ;

	/**
	 * @return die Adresse einer Gebäude
	 */
	public String getAdresse() ;

	/**
	 * @param adresse die Adresse einer Gebäude
	 */
	public void setAdresse(String adresse) ;

	/**
	 * @return die Etagen einer Gebäude
	 */
	public int getEtagen() ;

	/**
	 * @param etagen die Etagen einer Gebäude
	 */
	public void setEtagen(int etagen) ;
	
	/**
	 * @return der anzahl der Räume in einer Gebaude
	 */
	public int getAnzahlRaum() ;

	/**
	 * @param anzahlRaum der Anzahl der Räume in einer Gebaude
	 */
	public void setAnzahlRaum(int anzahlRaum) ;

}
