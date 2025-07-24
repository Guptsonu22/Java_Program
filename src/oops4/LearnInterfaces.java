package oops4;

import java.sql.SQLOutput;

public class LearnInterfaces {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.drinks();

        System.out.println(Animal.LEGS);
    }
//    Animal a1 = new Animal() ;
}

interface Pet{
    void string();
    void drinks();
}

interface Animal {
    int LEGS = 4;


   void eats ();
   void drinks();
    default void walk(){
        System.out.println("Animal is walking");
    }
}

class Monkey implements Animal , Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void string() {
        System.out.println("Monkey is singing");

    }
    public void drinks(){
        System.out.println("Monkey is drinking");
    }
}

