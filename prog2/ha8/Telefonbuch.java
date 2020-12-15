package ha8;

public class Telefonbuch {
    public BinTreeGen<E> tree = new BinTreeGen<Person extends Comparable<E>>();

    public int countEntries(){
    	int count = tree.countNodes();
    	return count;
    }

    public boolean insertPerson(Person p){

    }

    public Person searchPerson(String name){

    }
}