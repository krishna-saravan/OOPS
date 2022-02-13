package polymorphism;

public class sphere extends circle{


    sphere(int radius) {
        super(radius);
    }

    @Override
    void greeting(){
        System.out.println("i am in sphere class");
    }
}
