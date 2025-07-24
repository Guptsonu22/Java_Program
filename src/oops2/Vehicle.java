package oops2;

public class Vehicle {

    int gears = 0;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        v1.gears = 6;

    }

    int wheelsCount;

    String model;

    Vehicle() {
        System.out.println("creating a vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("creating vehicle with wheels");
    }

    void start() {
        System.out.println("Vehicle started");
    }

     final  void accelerate(){
        System.out.println("Vehicle is accelerate");
    }


}
