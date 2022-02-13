package interfaces;

public class Main {
    public static void main(String[] args) {
        Media car = new Car();

//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();


        niceCar mycar = new niceCar();
        Engine electric = new ElectricEngine();

        mycar.startMusic();
        mycar.StartEngine();
        mycar.upgradeEngine(electric);
        mycar.StartEngine();


    }
}
