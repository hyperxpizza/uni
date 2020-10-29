public class Person {
	// private attributes
	private String vorname;
    private String nachname;
    private char geschlecht;

    // Person class constructor
    public Person(String vorname, String nachname, char geschlecht){
        this.vorname = vorname;
        this.nachname = nachname;
        if(geschlecht == 'm' || geschlecht == 'f' || geschlecht == 'd'){
            this.geschlecht = geschlecht;
        }else{
            throw new IllegalArgumentException("wrong input given, please enter the valid input!");
        }
    }

    // getters
    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public char getGeschlecht(){
        return this.geschlecht;
    }
    
    // setters
    public void setVorname(String vorname) {
    	this.vorname = vorname;
    }
    
    public void setNachname(String nachname) {
    	this.nachname = nachname;
    }
    
    // toString method, prints out private attributes
    public String toString() {
    	return this.getVorname() + " " + this.getNachname();
    }
}