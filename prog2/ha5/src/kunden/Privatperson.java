package kunden;

public class Privatperson implements Kunde {
    String vorname;
    String nachname;

    public Privatperson(){
        System.out.println("WARNING!!! CONSTRUCTOR WITHOUT ANY PARAMETERS!!!");
    }

    public Privatperson(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }
    
}