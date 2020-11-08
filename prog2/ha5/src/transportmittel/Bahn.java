package transportmittel;

public class Bahn implements Transportmittel {
    private double geschwindigkeit;
    public int plaetze;

    public Bahn(){
        System.out.println("WARNING!!! CONSTRUCTOR WITHOUT ANY PARAMETERS!!!");
    }

    public Bahn(double geschwindigkeit, int plaetze){
        this.geschwindigkeit = geschwindigkeit;
        this.plaetze = plaetze;
    }
}