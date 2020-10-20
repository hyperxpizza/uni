

public class Person{
    private String name;
    private String vorname;
    private boolean fuehrungsrolleUbernehmen;
    private int betrieb;
    private boolean azubi;
    private int gehalt;


    public Person(String name, String vorname, boolean fuehrungsrolleUbernehmen, int betrieb, boolean azubi, int gehalt){
        this.name = name;
        this.vorname = vorname;
        this.fuehrungsrolleUbernehmen = fuehrungsrolleUbernehmen;
        this.gehalt = gehalt;
        this.betrieb = betrieb;
        this.azubi = azubi;
    }

    public String toString(){
        String message = this.vorname + " " + this.name;
        return message;
    }
}