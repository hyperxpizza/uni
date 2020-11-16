package reiseanbieter;

import kunden.Kunde;

public class TuiReisen implements Reiseanbieter{
	public static final int EGAL = 0;
	public static final int BUS = 1;
	public static final int BAHN = 2;
	public static final double entfernungBus = 288.2;
	public static final double entfernungBahn = 310;
	
	public TuiReisen() {
		System.out.println("Constructor!");
	}
	
	public boolean buchen(Kunde k, int transport) {
		if(transport > 2 && transport < 0) {
			return false;
		}
		
		return true;
	}
	
	public boolean buchen(Kunde[] gruppe, int transport) {
		if(transport > 2 && transport < 0) {
			return false;
		}
		
		return true;
	}
	
	public void buchungBestaetigen(Kunde k, int transport) {
		
	}
	
	public void buchungAblehnen(Kunde k, int transport) {
		
	}
	
	public boolean stornieren(Kunde k, int transport) {
		
	}
	
	public boolean stornieren(Kunde[] k, int transport) {
		
	}
	
	public void stornoBestaetigen(Kunde k, int transport) {
		
	}
	
	public void stornoAblehnen(Kunde k, int transport) {
		
	}
	
	
	public double preisErfragen(Kunde k, int transport) {
		
	}
	
	public double dauerErfragen(Kunde k, int transport) {
		
	}
	
}
