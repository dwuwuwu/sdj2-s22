package dk.via.traffic;

public class Pedestrian  implements TrafficLightObserver {

    private Car pedestrian;


    @Override
    public void onLightChange(LightColor color) throws InterruptedException {

        switch(color) {
            case GREEN -> {
                if (!pedestrian.isRunning()) pedestrian.start();
                pedestrian.wait();
            }
            case YELLOW -> {
                pedestrian.accelerate();
            }
            case RED -> {
                pedestrian.start();
            }
            case RED_YELLOW -> {
                pedestrian.accelerate();
            }
        }
    }

    public Car getPedestrian() {
        return pedestrian;
    }
}

