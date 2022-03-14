package dk.via.session3.exercise3_1;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Thread lightThread = new Thread(light);
        lightThread.start();
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Driver driverA = new Driver(carA);
        Driver driverB = new Driver(carB);
        Driver driverC = new Driver(carC);
        carA.start();
        carB.start();
        carC.start();
        Thread.sleep(1000);
        light.addObserver(driverA);
        light.addObserver(driverB);
        Thread.sleep(2000);
        light.addObserver(driverC);
    }
}
