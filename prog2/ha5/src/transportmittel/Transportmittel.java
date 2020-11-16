package transportmittel;

public interface Transportmittel {
	/**
	 * liefert die Durchschnittsgeschwindigkeit des transportmittels zurueck
	 * 
	 * @return Durchschnittsgeschwindigkeit des Transportmittels
	 */
	public abstract double getGeschwindigkeit();

	/**
	 * liefert die maximale Anzahl der Plaetze fuer die Fahrgaeste in dem
	 * Transportmittel zurueck
	 * 
	 * @return Anzahl der Plaetze
	 */
	public abstract int getAnzahlPlaetze();
}