package reisenanbieter;

public interface Reiseanbieter {
	
	public static final int EGAL = 0;
	public static final int BUS = 1;
	public static final int BAHN = 2;
	
	//Entfernung in Km auf Strassen (Busreise)
	public static final double entfernungBus = 288.2;
	//entfernung in Km auf Schienen (Bahnreise)
	public static final double entfernungBahn = 310;
	
	public abstract boolean buchen(Kunde k, int transport);
	public abstract boolean buchen(Kunde[] gruppe, int transport);
	public abstract void buchungBestaetigen(Kunde k, int transport);
	public abstract void buchungAblehnen(Kunde k, int transport);
	
	public abstract boolean stornieren(Kunde k, int transport); 
	public abstract boolean stornieren(Kunde[] k, int transport); 
	public abstract void stornoBestaetigen(Kunde k, int transport);
	public abstract void stornoAblehnen(Kunde k, int transport);
	
	public abstract double preisErfragen(Kunde k, int transport);
	public abstract double dauerErfragen(Kunde k, int transport);
}