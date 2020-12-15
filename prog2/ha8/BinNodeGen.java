package ha8;

public class BinNodeGen<E>{
    E data;
    BinNodeGen<E> left, right;

    public BinNodeGen(E data){
        this.data = data;
        left = right = null;
    }

    public BinNodeGen(E data, BinNodeGen<E> left, BinNodeGen<E> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}