package Classwork.Jul23;
// 3. Create a multilever inheritance program: vehicle -> Car -> Electric Car.
//     Implements method: start, stop, charge

class Vehicle {

     void start() {
        System.out.println("Vehicle started");
    }

     void stop() {
        System.out.println("Vehicle stopped");
    }
}
 class Car extends Vehicle {

     void start() {
        System.out.println("Car started");
    }

     void stop() {
        System.out.println("Car stopped");
    }
}

 class ElectricCar extends Car {
     void charge() {
        System.out.println("Electric car is charging");
    }
}


public class MultilevelDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.charge();
        electricCar.stop();
    }
}
