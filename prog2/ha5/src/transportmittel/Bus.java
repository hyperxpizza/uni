package transportmittel;

public class Bus implements Transportmittel {
    private double geschwindigkeit;
    public int plaetze;

    public Bus(){
        System.out.println("WARNING!!! CONSTRUCTOR WITHOUT ANY PARAMETERS!!!");
    }

    public Bus(double geschwindigkeit, int plaetze){
        this.geschwindigkeit = geschwindigkeit;
        this.plaetze = plaetze;
    }
    
    public double getGeschwindigkeit() {
    	return this.geschwindigkeit;
    }
    
    public int getAnzahlPlaetze() {
    	return this.plaetze;
    }
}