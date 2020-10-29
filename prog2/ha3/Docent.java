// Class Docent inherits after class person
public class Docent extends Person{
    // Additional private attribute
	private int fachbereich;

    public Docent(){
        
    }

	// constructor
    public Docent(String vorname, String nachname, char geschlecht, int fachbereich){
        // invoke master class (Person) constructor
    	super(vorname, nachname, geschlecht);
        this.fachbereich = fachbereich;
    }

    // getter
    public int getFachbereich(){
        return this.fachbereich;
    }
    
    // setter
    public void setFachbereich(int fachbereich) {
    	this.fachbereich = fachbereich;
    }
    
    // prints out private attributes 
    public String toString(){
    	return this.getVorname() + " " + this.getNachname() + " fachbereich: " + this.getFachbereich();
    }
}