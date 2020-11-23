import java.util.EmptyStackException;

public class Queue implements QueueSchnittstelle {
    private Node first = null;
    private Node last = null;

    public void enqueue(int x){
        Node n = new Node(x);
        if(this.first == null){
            this.first = n;
        } else {
            this.last.setNext(n);
        }
        this.last = n;
    }

    public int dequeue() throws EmptyStackException{
        /*
        TODO
        */
    }

    public int first() throws EmptyStackException{
        if(first == null){
            throw new EmptyStackException();
        }

        return this.first.getData();
    }

    public boolean isEmpty(){
        if((this.first == null) && (this.last == null)){
            return true;
        }

        return false;
    }

    public String toString(){
        String msg = "<--- ";
        Node n = this.first;
        while(n != null){
            msg = msg + n.getData() + " ";
            n  = n.getNext();
        }

        msg = msg + "<---";

        return msg;
    }
    
}