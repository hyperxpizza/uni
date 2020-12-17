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
	
	public int countBooksUntil(int year) {
        return countBooksUntil(tree.root, year);
    }

    private int countBooksUntil(BinNodeGen<Buch> n, int year) {
        if(n == null)
            return 0;

        if(n.data.yearPublished <= year) {
            int count = 1 + (n.left == null ? 0 : tree.countNodes(n.left));
            if (n.data.yearPublished == year)
                return count;
            return count + countBooksUntil(n.right, year);
        }
        else return countBooksUntil(n.left, year);
    }
	
    
	
}
