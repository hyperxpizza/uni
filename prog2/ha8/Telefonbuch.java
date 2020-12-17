package ha8;

public class Telefonbuch {
	public BinTreeGen<Person> tree = new BinTreeGen<Person>();
	
	public int countEntries() {
		return tree.countNodes();
	}
	
	public boolean insertPerson(Person p) {
		boolean result = tree.insertNode(p);
		return result;
	}
	
	public void print() {
		tree.print2D();
	}
}