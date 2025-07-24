package oops2;

public class Car extends Vehicle {

    String color;


    void start(){
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this);
        System.out.println("Car is starting");

    }
    Car breaking(){
        return this;
    }

    Car() {
        super(4);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
//        System.out.println(obj.wheelsCount);
//        obj.wheelsCount = 4;  // inherited from Vehicle
//        obj.model = "I10";// inherited from Vehicle
//        obj.color = "Red";
//        obj.start();// inherited from Vehicle
    }
}

class Scooter {

    void braking(Car car){
        System.out.println(car.model+" is breaking");
    }

}

