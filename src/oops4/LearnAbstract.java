package oops4;

public class LearnAbstract {

    public static void main(String[] args) {
//        Vehicle v1 = new Car(); // Abstract reference, Concrete object

//        v1.accelerate();
//        int result = v1.breaks(4);
//        System.out.println("Brakes called for wheels: " + result);

        Car c1 = new Car();
        c1.accelerate();
        c1.breaks(4);
        c1.honks();
    }
}

 abstract class Human{
   void speaks(){

   }

   abstract void eat();


 }

abstract class Vehicle {
    abstract void accelerate();
    abstract int breaks(int wheels);

    void honks(){
        System.out.println("Vehicle honks");
    }


}
class Scooter extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int breaks(int wheels) {
        return 0;
    }
}


class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car is accelerated");
    }

    void honks(){
        System.out.println("Car is honked");
    }

    @Override
    int breaks(int wheels) {
        System.out.println("Car brakes are pushed");
        return wheels;
    }


}


