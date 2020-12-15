package ha8;

public class Buch{
	public String title, author;
    public int yearPublished;


    public Buch(){
        System.out.println("constructor without parameters");
    }

    public Buch(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
