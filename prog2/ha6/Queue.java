import java.util.EmptyStackException;

public class Queue extends Liste implements QueueSchnittstelle {
    private Node first; 
    private Node last;

    public Queue(){
        this.first = null;
        this.last = null; 
    }

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
        if(this.first == null){
            return null;
        }

        Node temp = this.first;
        this.first = this.first.getNext();

        if(this.first==null){
            this.last = null;
        }
        
        return temp.getData();
    } 

    public int first() throws EmptyStackException{
        if(first == null){
            throw new EmptyStackException();
        }

        return this.first.getData();
    }

    public boolean isEmpty(){
        if((this.top == null) && (this.last == null)){
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