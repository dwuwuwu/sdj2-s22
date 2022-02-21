package dk.via.traffic;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Thread lightThread = new Thread(light);
        lightThread.start();
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Car carD = new Car("D");
        Car carE = new Car("E");
        Car carF = new Car("F");
        Car carG = new Car("G");
        Driver driverA = new Driver(carA);
        Driver driverB = new Driver(carB);
        Driver driverC = new Driver(carC);
        TaxiDriver driverD = new TaxiDriver(carD);
        TaxiDriver driverE = new TaxiDriver(carE);
        SleepyDriver driverF = new SleepyDriver(carF);
        SleepyDriver driverG = new SleepyDriver(carG);
        carA.start();
        carB.start();
        carC.start();
        carD.start();
        carE.start();
        carF.start();
        carG.start();
        Thread.sleep(1000);
        light.addObserver(driverA);
        light.addObserver(driverB);
        light.addObserver(driverD);
        light.addObserver(driverE);
        light.addObserver(driverF);
        light.addObserver(driverG);
        Thread.sleep(2000);
        light.addObserver(driverC);
    }
}
