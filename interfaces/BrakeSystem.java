package interfaces;

public class BrakeSystem implements  Brake{
    @Override
    public void brake() {
        System.out.println("break has been applied");
    }
}
