
import java.util.ArrayList;
public class Menu {
    private ArrayList<IceCream> creams;
    private int maxNum;
    public Menu(){
        this.creams = new ArrayList<>();
        this.maxNum = 10;
    }
    public void setMax(int maxNum){
        this.maxNum = maxNum;
    }
    public void addIceCream(IceCream cream){
        if(this.creams.size() < this.maxNum){
            this.creams.add(cream);
        }
    }
    public void removeIceCream(IceCream cream){
        this.creams.remove(cream);
    }
    public int numbeIceCream(){
       return this.creams.size();
    }
    public void printMenu(){
        System.out.println("Menu:");
        for(IceCream cream: creams){
            System.out.println(cream);
        }
    }
    
}
