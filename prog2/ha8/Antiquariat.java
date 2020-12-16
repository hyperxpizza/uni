package ha8;

public class Antiquariat {
	public BinTreeGen<Buch> tree = new BinTreeGen<Buch>();

	public boolean insertBook(Buch p) {
		boolean result = tree.insertNode(p);
		return result;
	}
	
	public void print() {
		tree.print2D();
	}
	
	public int countBooks() {
		return tree.countNodes();
	}
	
	
}
