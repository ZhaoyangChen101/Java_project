
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenzhaoyang
 */
public class Room {
    ArrayList<Person> persons;
    public Room(){
        this.persons = new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    //你看看是不是返回的list格式的内部值，没有那个框框
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortest = this.persons.get(0);
        for (Person person: persons){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    //take函数在shortest上的进阶功能，多了一个remove
    public Person take(){
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        //不是this.persons.shortest()也
        //并且remove(object)是可以的
        return shortest;
    }
}
