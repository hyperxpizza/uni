
public class Node {
    private int data;
    private Node next;

    public Node(){
        System.out.println("Running constructor without parameters");
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node n){
        this.next = n;
    }
}