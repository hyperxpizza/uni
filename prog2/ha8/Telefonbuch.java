package ha8;

public class Telefonbuch {
	public BinTreeGen<Person> tree = new BinTreeGen<Person>();
	
	public int countEntries() {
		return tree.countNodes();
	}
}