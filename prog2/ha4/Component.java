
public class Component {
    private double price;
    private final boolean aktiv;
    private String description;

    // empty constructor
    public Component(){
        this.aktiv = false;
    }

    // constructor
    public Component(double price, boolean aktiv, String description){
        if(price<0){
            throw new IllegalArgumentException("price for a component cannot be negative.");
        }else{
            this.price = price;
        }
        this.aktiv = aktiv;
        this.description = description;
    }

    //setters
    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(boolean description){
        this.description = description;
    }
    
    //getters
    public boolean getAktiv(){
        return this.aktiv;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public String toString(){
        String message = "price: " + this.price, ", aktiv: " + this.aktiv + ", description: " + this.description; 
        return message;
    }

}