/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Book {
    private String author;
    private String name;
    private int pages;
    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.pages = pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        String s = this.author + ", " + this.name + ", " + this.pages + " pages";
        return s;
    }    
}
