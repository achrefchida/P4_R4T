package smarthome;

/**
 * Interface Geb�ude
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

public interface Gebaeude {

	/*
	 * Konstruktor
	 */
	// public Geb�ude() {}

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
	 * Methode, die die w�nschwerte einstellen
	 * 
	 * @param raeume ist die R�ume von einer Gebaude
	 * @param anzahlRaum ist die anzahl der R�ume in einer Gebaude
	 * @return void
	 */
	void wunschwerte(RaumO[] raeume);	
	
	/**
	 * @return die Fl�sche einer Geb�ude
	 */
	public String getFlaeche() ;

	/**
	 * @param flaeche die Fl�sche einer Geb�ude
	 */
	public void setFlaeche(String flaeche) ;

	/**
	 * @return die Adresse einer Geb�ude
	 */
	public String getAdresse() ;

	/**
	 * @param adresse die Adresse einer Geb�ude
	 */
	public void setAdresse(String adresse) ;

	/**
	 * @return die Etagen einer Geb�ude
	 */
	public int getEtagen() ;

	/**
	 * @param etagen die Etagen einer Geb�ude
	 */
	public void setEtagen(int etagen) ;
	
	/**
	 * @return der anzahl der R�ume in einer Gebaude
	 */
	public int getAnzahlRaum() ;

	/**
	 * @param anzahlRaum der Anzahl der R�ume in einer Gebaude
	 */
	public void setAnzahlRaum(int anzahlRaum) ;

}
