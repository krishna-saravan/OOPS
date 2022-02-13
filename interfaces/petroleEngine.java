package interfaces;

public class petroleEngine implements Engine {

    @Override
    public void start() {
        System.out.println("starting petrol Engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping petrol Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("petrol engine is accelerating car");
    }
}
