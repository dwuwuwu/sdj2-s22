package dk.via.traffic;

public class TaxiDriver implements TrafficLightObserver {

private Car car1;

public TaxiDriver(Car car1){this.car1= car1;}





    @Override
    public void onLightChange(LightColor color) {
        switch(color) {
            case GREEN -> {
                if (!car1.isRunning()) car1.start();
                car1.accelerate();
            }
            case YELLOW -> {
                car1.accelerate();
            }
            case RED -> {
                car1.stop();
            }
            case RED_YELLOW -> {
                car1.start();
            }
        }
    }

    public Car getTaxiDriver() {
        return car1;
    }
}


