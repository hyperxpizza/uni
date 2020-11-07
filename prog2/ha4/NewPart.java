
public class NewPart extends Component{
    private boolean packaget;

    public NewPart(){
        super();
    }

    public NewPart(String description, double price, boolean aktiv, boolean packaget){
        super(description, price, aktiv);
        this.packaget = packaget;
    }

    //getter
    public boolean isPackaget() {
        return this.packaget;
    }

    //setter
    public void setPackaget(boolean packaget) {
        this.packaget = packaget;
    }

    public String toString() {
        String message = super.toString() + ", packaget:" + packaget;
        return message;
    }
}