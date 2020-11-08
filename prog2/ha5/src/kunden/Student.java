package kunden;

public class Student extends Privatperson {
    String hochschule;

    public Student(){
        super();
    }

    public Student(Sring vorname, String nachname, String hochschule){
        super(vorname, nachname);
        this.hochschule = hochschule;
    }

    public void setHochschule(String hochschule){
        this.hochschule = hochschule;
    }

    public String getHochschule(){
        return this.hochschule;
    }
}