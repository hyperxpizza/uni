package ha8;

public class Antiquariat {
	public BinTreeGen<Buch> tree = new BinTreeGen<Buch>();

	public boolean insertBook(Buch p) {
		boolean result = tree.insertNode(p);
		return result;
	}

	public int countBooks() {
		return tree.countNodes();
	}
	
	
	public void print() {
		tree.print2D();
	}
	
	
	
}
