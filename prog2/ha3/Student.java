public class Student extends Person {
    private int matrikelnummer;

    public Student(String vorname, String nachname, char geschlecht,int matrikelnummer){
        super(vorname, nachname, geschlecht);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikelnummer(){
        return this.matrikelnummer;
    }

    public String toString(){
        String message = "Student: \n" + "Vorname: " + this.getVorname() + "\nNachname: " + this.getNachname() + "\nGeschlecht: " + this.getGeschlecht() + "\nMatrikelnummer: " + this.getMatrikelnummer();

        return message;
    }
}