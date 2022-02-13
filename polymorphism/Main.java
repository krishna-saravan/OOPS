package polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes twoD = new shapes(5);

        shapes threeD = new shapes();

        circle circle = new circle(4);

        circle.area();

        circle.area(5);


        // overridding

        square obj = new square(10);

        obj.greeting();

        twoD.greeting();

        shapes obj2 =new circle(5);

        shapes obj3 = new sphere(4);

        circle obj4 =  new sphere(4);

        obj2.greeting();
        obj3.greeting();
        obj4.greeting();


        obj3.display();

    }


}
