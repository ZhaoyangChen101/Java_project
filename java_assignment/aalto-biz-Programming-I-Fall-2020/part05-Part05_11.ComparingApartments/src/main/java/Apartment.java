
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int price = this.pricePerSquare * this.squares;
        int priceCompared = compared.pricePerSquare * compared.squares;
        if (price >= priceCompared){
            return price - priceCompared;
        }
        return priceCompared - price;
    }
    public boolean moreExpensiveThan(Apartment compared){
        int price = this.pricePerSquare * this.squares;
        int priceCompared = compared.pricePerSquare * compared.squares;
        if (price > priceCompared){
            return true;
        }
        return false;
    }
    
}
