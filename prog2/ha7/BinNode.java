
public class BinNode{
    int data;
    BinNode left;
    BinNode right;

    public BinNode(int d){
        data = d;
        left = right = null;
    }

    public BinNode(int d, BinNode l, BinNode r){
        data = d;
        left = l;
        right = r;
    }
}