
import java.util.ArrayList;
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Country capitalCities = new Country();
        capitalCities.add("Finland", "Helsinki");
        capitalCities.add("England", "London");
        capitalCities.add("Norway", "Oslo");
        System.out.println(capitalCities.getCountry("Helsinki"));
        System.out.println(capitalCities.getCapital("Germany"));
        capitalCities.remove("Japan");
        System.out.println("");
        ArrayList<String> list = capitalCities.CountryList();
        for(String country: list) {
            System.out.println(country);
        }
        
        

    }
}
