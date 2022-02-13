package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("starting electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("stopping electric Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("electric engine is accelerating car");
    }
}
