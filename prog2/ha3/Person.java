public class Person {
    private String vorname;
    private String nachname;
    private char geschlecht;

    public Person(String vorname, String nachname, char geschlecht){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
    }

    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public char getGeschlecht(){
        return this.geschlecht;
    }
}