import java.util.EmptyStackException;

public class Stack extends Liste implements StackSchnittstelle {
    private Node top = null;

    public void push(int data){
        Node n = new Node(data);
        n.setNext(this.top);
        this.top = n;
    }

    public int pop() throws EmptyStackException{
        if(top == null){
            throw new EmptyStackException();
        }

        Node n = this.top;
        this.top = top.getNext();
        return n.getData();
    }

    public int top() throws EmptyStackException{
        if(this.top == null){
            throw new EmptyStackException();
        }

        return this.top.getData();
    }

    public String toString(){
        Node n = this.top;
        String msg = "";
        while (n != null){
            msg = msg + n.getData() + "\n";
            n = n.getNext();
        }

        return msg;
    }
}
