package ha8;


public class Person implements Comparable<Person>{
	
    public String vorname, nachname, telefonnummer;
    public String key = this.nachname;

    public Person(){
        System.out.println("running constructor without parameters!");
    }

    public Person(String vorname, String nachname, String telefonnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
    }
    
	@Override
	public int compareTo(Person arg0) {
		
		return 0;
	}
	
	
	
	
}