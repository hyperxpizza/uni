

public class BinTree {
    private BinNode root = null;

    public BinTree(){
        root = null;
    }

    public BinTree(BinNode rn){
        root = rn;
    }

    public int countNodes(BinNode k){
        int counter = 0;
        if(k != null){
            counter = 1 + countNodes(k.left) + countNodes(k.right);
        }

        return counter;
    }
}