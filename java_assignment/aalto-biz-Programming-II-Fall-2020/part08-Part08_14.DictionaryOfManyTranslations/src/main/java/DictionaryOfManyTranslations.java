
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    //添加的时候要先判断word是否存在，如果不存在就要先创建
    public void add(String word, String translation){
        /*if(!(this.dictionary.containsKey(word))){
            this.dictionary.put(word, new ArrayList<>());            
        }*/
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);       
    }
    public ArrayList<String> translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }
    public void remove(String word){
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }        
    }
}
