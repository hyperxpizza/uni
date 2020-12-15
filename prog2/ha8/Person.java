package ha8;

public class Person {
    String vorname, nachname, telefonnummer;

    public Person(){
        System.out.println("running constructor without parameters!");
    }

    public Person(String vorname, String nachname, String telefonnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
    }
}