package polymorphism;

public class circle extends shapes {
    int radius;

    circle(int radius){
        super();
        this.radius = radius;
    }

    void area(){
        System.out.println(3.14*radius*radius);
    }

    void area(int side){
        System.out.println(side*side);
    }

    @Override
    void greeting(){
        System.out.println("in am in circle class");
    }


}
