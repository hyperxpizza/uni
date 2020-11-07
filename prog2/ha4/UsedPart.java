

public class UsedPart extends Component {
    private int operatingHours;

    public UsedPart(){
        super();
    }

    public UsedPart(double price, boolean aktiv, String description, int operatingHours){
        super(price, aktiv, description);
        this.operatingHours = operatingHours;
    }

    //setter
    public void setOperatingHours(int operatingHours){
        this.operatingHours = operatingHours;
    }

    //getter
    public int getOperatingHours(){
        return this.operatingHours;
    }

    public String toString(){
        String message = super.toString() + ", packaget:" + packaget;
        return message;
    }
}