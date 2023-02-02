/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Stats {
    private String countryName;
    private int activeCases;
    private int closedCases;
    private int totalInfected;
    public Stats(String countryName){
        this.countryName = countryName;
        this.activeCases = 0;
        this.closedCases = 0;
        this.totalInfected = 0;
    }
    public Stats (String countryName, int activeCases, int closedCases){
        this.countryName = countryName;
        this.activeCases = activeCases;
        this.closedCases = closedCases;
        this.totalInfected = activeCases + closedCases;
    }
    public void infect(int n){
        this.activeCases += n;
        this.totalInfected += n;    
    }
    public void heal(int n){
        this.activeCases -= n;
        this.closedCases += n;
        this.totalInfected = this.activeCases + this.closedCases;
        
    }
    public void setInfect(int n){
        this.activeCases = n;
        this.totalInfected += n;
    }
    @Override
    public String toString(){
        return "Statistics for "+ this.countryName + ":" + "\n"+
                "Active cases: " + this.activeCases + "\n" +
                "Closed cases: " + this.closedCases + "\n" +
                "Total infected: " + this.totalInfected;
    }
}
