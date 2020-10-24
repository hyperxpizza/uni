public class Docent extends Person{
    private int fachbereich;

    public Docent(String vorname, String nachname, char geschlecht){
        super(vorname, nachname, geschlecht);
        this.fachbereich = fachbereich;
    }

    public int getFachbereich(){
        return this.fachbereich;
    }

    public String toString(){
        String message = "Docent\n" + "Vorname: " + this.getVorname() + "\n Nachname: " + this.getNachname() + "\n Geschlecht: " + this.getGeschlecht() + "\n Fachbereich: " + this.getFachbereich();

        return message;
    }
}