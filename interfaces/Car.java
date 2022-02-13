package interfaces;

public class Car implements Engine,Brake,Media {


    @Override
    public void brake() {
        System.out.println("break is used");
    }

    @Override
    public void start() {
        System.out.println("Engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Engine has stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("car is acclerating");
    }
}
