package interfaces;

public class CdPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Start the music");
    }

    @Override
    public void stop() {
        System.out.println("stopping the music");
    }
}
