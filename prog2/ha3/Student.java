public class Student extends Person {
    private int matrikelnummer;

    public Student(String vorname, String nachname, char geschlecht,int matrikelnummer){
        super(vorname, nachname, geschlecht);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikelnummer(){
        return this.matrikelnummer;
    }
    
    public void setMatrikelnummer(int matrikelnummer) {
    	this.matrikelnummer = matrikelnummer;
    }

    public String toString(){
       return this.getVorname() + " " + this.getNachname() + ", matriculation number: " + this.getMatrikelnummer();
    }
}