/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Archive {
    private String identifier;
    private String name;
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        return this.identifier.equals(comparedArchive.identifier); 
               // && this.name.equals(comparedArchive.name);
    }
}
