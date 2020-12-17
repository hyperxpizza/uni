package ha8;


public class Person implements Comparable<Person>{
	
    public String vorname, nachname, telefonnummer;

    public Person(){
        System.out.println("running constructor without parameters!");
    }

    public Person(String vorname, String nachname, String telefonnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
    }
    
	@Override
	public int compareTo(Person p) {
		if(this.nachname == p.nachname) {
			return 0;
		}
		return this.nachname.compareTo(p.nachname);
	}
	
	public String toString() {
		return this.nachname;
	}
}