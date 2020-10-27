public class Docent extends Person{
    private int fachbereich;

    public Docent(String vorname, String nachname, char geschlecht, int fachbereich){
        super(vorname, nachname, geschlecht);
        this.fachbereich = fachbereich;
    }

    public int getFachbereich(){
        return this.fachbereich;
    }
    
    public void setFachbereich(int fachbereich) {
    	this.fachbereich = fachbereich;
    }

    public String toString(){
    	return this.getVorname() + " " + this.getNachname() + " fachbereich: " + this.getFachbereich();
    }
}