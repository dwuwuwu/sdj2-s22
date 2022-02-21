package dk.via.traffic;

public class SleepyDriver implements TrafficLightObserver {

    private Car car2;

    public SleepyDriver(Car car2){this.car2=car2;}
    @Override
    public void onLightChange(LightColor color) {
        switch(color) {
            case GREEN -> {
                if (!car2.isRunning()) car2.start();
                car2.start();
            }
            case YELLOW -> {
                car2.decelerate();
            }
            case RED -> {
                car2.stop();
            }
            case RED_YELLOW -> {
                car2.stop();
            }
        }
    }

    public Car getSleepyDriver() {
        return car2;
    }
}


