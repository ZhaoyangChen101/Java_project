
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    private int totalWeight;
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }
    public void addItem(Item item){
        int previousWeight = 0;
        if(this.items.isEmpty()){
            if(item.getWeight() <= maxWeight){
                this.items.add(item);
                this.totalWeight += item.getWeight();                
            }
        }else{
            for (Item itemOne: this.items){
                previousWeight += itemOne.getWeight();
            }
            if((item.getWeight() + previousWeight) <= maxWeight){
                this.items.add(item);
                this.totalWeight += item.getWeight();
            }
        }  
    }
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.items.size() == 1){
            return "1 item " + "(" + this.totalWeight + " kg)";
        }
        return this.items.size() + " items" + " (" 
                + this.totalWeight + " kg)";
           
    }
    public void printItems(){
        //print一般都是void，直接sout值
        for (Item item: this.items){
            System.out.println(item.getName() + " ("+ item.getWeight() + " kg)");
        }        
    }
    public int totalWeight(){
        return this.totalWeight;
    }
    public Item heaviestItem(){
        //这一部分总是忘记，在遍历前，对比前，要先确认list是否为空
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(Item itemOne: items){
            if(itemOne.getWeight() > heaviestItem.getWeight()){
                heaviestItem = itemOne;
            }
        }
        return heaviestItem;
    }   
}
