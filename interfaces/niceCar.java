package interfaces;

public class niceCar {
    private Engine engine;
    private Brake brake = new BrakeSystem();
    private Media player = new CdPlayer();

    public niceCar(){
        this.engine = new petroleEngine();
    }

    public niceCar(Engine engine) {
        this.engine = engine;
    }

    void upgradeEngine(Engine newEngine){
        this.engine = newEngine;
    }

    void StartEngine(){
        engine.start();
    }
    void StopEngine(){
        engine.stop();
    }
    void Accelerate(){
        engine.accelerate();
    }

    void Break(){
        brake.brake();
    }

    void startMusic(){
        player.start();
    }
    void stopMusic(){
        player.stop();
    }
}
