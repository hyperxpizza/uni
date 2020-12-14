

public class BinTreeGen<E extends Comparable<E>> implements BinTreeGenInterface<E> {
    private BinNodeGen<E> root = null;

    public BinTreeGen(){
        root = null;
    }

    public BinTreeGen(BinNodeGen<E> root){
        this.root = root;
    }

    public int countNodes(){
        int count = countNodes(root);
        return count;
    }

    public int countNodes(BinNodeGen<E> k){
        int counter = 0;
        if(k != null){
            counter = 1 + countNodes(k.left) + countNodes(k.right);
        }

        return counter;
    }

    public String toString(){
        String msg = toString(root);
        return msg;
    }

    public String toString(BinNodeGen<E> k){

    }

    public BinNodeGen<E> find(E item){
        BinNodeGen<E> node = find(root, item);
        return node;

    }

    public BinNodeGen<E> find(BinNodeGen<E> root, E item){
        if(root != null){
            if(root.data == item){
                return root;
            } else {
                if(item.compareTo(root.data) < 0){
                    return find(root.left, item);
                } else if(item.compareTo(root.data) > 0){
                    return find(root.right, item);
                }
            }
        } 

        return null;
    }

    public boolean insertNode(E item){

    }
}