package Abstract;

public class Main {
    public static void main(String[] args) {
        parent son = new Son();
        parent daughter = new Daughter();

        son.career();
        daughter.career();
        daughter.partner();

        son.normal();
        daughter.normal();

        parent.greeting(); // abstract class can have static methods
    }
}
