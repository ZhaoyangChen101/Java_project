
import java.util.ArrayList;
import java.util.HashMap;
public class Country {
    private HashMap <String, String> map;
    private String countryName;
    private String capital;
    public Country(){
        this.map = new HashMap <String, String>();
    }
    public void add(String countryName, String capital){
        this.map.put(countryName, capital);
    }
    public String getCapital(String countryName){
        if(this.map.containsKey(countryName)){
            return map.get(countryName);
        }
        return null;
    }
    public String getCountry(String capital){
        String country = null;
        for(String key: this.map.keySet()){
            if(this.map.get(key).equals(capital)){
                country = key;
                
            }
        }
        return country;
    }
    public void remove (String countryName){
        if(this.map.containsKey(countryName)){
            this.map.remove(countryName);
        }else{
            System.out.println("Not found!");
        }
    }
    public ArrayList<String> CountryList(){
        ArrayList<String> countries = new ArrayList<>();
        for (String key: this.map.keySet()){
            countries.add(key + ": " + this.map.get(key));
        }
        return countries;
    }
}
