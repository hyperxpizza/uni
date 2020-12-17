package ha8;

public class Buch implements Comparable<Buch>{
	public String title, author;
    public int yearPublished;
    public int key = this.yearPublished;


    public Buch(){
        System.out.println("constructor without parameters");
    }

    public Buch(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

	@Override
	public int compareTo(Buch o) {
		if(this.yearPublished < o.yearPublished) {
			return -1;
		}
		else if(this.yearPublished > o.yearPublished) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return String.valueOf(this.yearPublished);
	}
	
}
