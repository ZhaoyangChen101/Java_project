
import java.util.ArrayList;
public class IceCream {
    private int scoop;
    private String flavor;
    private ArrayList<String> toppings;
    public IceCream(){
        this.scoop = 1;
        this.flavor = "vanilla";
        this.toppings = new ArrayList<>();
    }
    public IceCream(String flavor){
        this.scoop = 1;
        this.flavor = flavor;
        this.toppings = new ArrayList<>();
    }
    public IceCream(int scoop, String flavor){
        this.scoop = scoop;
        this.flavor = flavor;
        this.toppings = new ArrayList<>();
    }
    public void addScoop(int scoop){
        this.scoop ++;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public void addToppings(ArrayList<String> toppings){
        for (String topping: toppings){
            this.toppings.add(topping);
        }
    }
    @Override
    public String toString(){
        if(this.toppings.isEmpty()){
            return this.flavor + " flavored ice cream," + this.scoop + " scoops";
        }
        String toppings = "";
        for(String topping: this.toppings){
            toppings = topping + ", ";
        }
        return this.flavor + " flavored ice cream," + this.scoop + " scoops,"
                + "topped with " + toppings;
    }
}
