package oops1;

public class MainClass {
    public static void main(String[] args) {

//        Dog d1 = new Dog();
//        d1.name = "Sonu";
//        d1.bark();
//
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.walk();

//        Complex num1 = new Complex();
//        num1.a = 3;
//        num1.b = 5;
//        num1.print();
    }
}

//class Complex{
//    int a,b;
//
//    void print() {
//        System.out.println(a + " + " +b+"i");
//    }
//}

class Dog {
    String name;
    int age;
    String colour;

    void walk() {
        System.out.println(name + " is walking");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}
