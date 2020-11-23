
public interface QueueSchnittstelle {
    public abstract void enqueue();
    public abstract int dequeue();
    public abstract int first();
    public abstract boolean isEmpty();
    public abstract String toString();    
}