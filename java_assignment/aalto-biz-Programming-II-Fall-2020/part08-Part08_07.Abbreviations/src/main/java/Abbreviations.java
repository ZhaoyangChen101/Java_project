
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Abbreviations {
    private HashMap <String,String> abbr;
    public Abbreviations(){
        this.abbr = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation,String explanation){
        this.abbr.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return this.abbr.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return this.abbr.get(abbreviation);
        }
        return null;
    }
}
