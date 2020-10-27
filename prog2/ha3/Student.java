//Class Student inherits after class Person
public class Student extends Person {
	// Additional private attribute
    private int matrikelnummer;

    // constructor
    public Student(String vorname, String nachname, char geschlecht,int matrikelnummer){
    	// invoke master class (Person) constructor
    	super(vorname, nachname, geschlecht);
        this.matrikelnummer = matrikelnummer;
    }

    // getter
    public int getMatrikelnummer(){
        return this.matrikelnummer;
    }
    
    // setter
    public void setMatrikelnummer(int matrikelnummer) {
    	this.matrikelnummer = matrikelnummer;
    }
    
    // toString method, prints out private attributes
    public String toString(){
       return this.getVorname() + " " + this.getNachname() + ", matriculation number: " + this.getMatrikelnummer();
    }
}