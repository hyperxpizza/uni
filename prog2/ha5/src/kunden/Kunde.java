package kunden;

public interface Kunde {

	/**
	 * empfaengt eine Text-Nachricht und zaehlt die Anzahl der insgesamt
	 * empfangenen Nachrichten
	 * 
	 * @param Nachricht
	 *            , die vom Kunden empfangen wird
	 * @return Anzahl insgesamt empfangenen Nachrichten
	 */
	public abstract int empfangeNachricht(String nachricht);
}
