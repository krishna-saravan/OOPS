package Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight Boxw = new BoxWeight();
        Box box1 = new Box(5,6,3);


        System.out.println(Boxw.lenght);
        System.out.println(Boxw.height);
        System.out.println(Boxw.breadth);

        Boxw.volume();

        Boxw.greeting();

//        box1.greeting() //parent object cannot access child class atributes


        BoxWeight B2 = new BoxWeight(Boxw);

//        B2.no_items; // private elements will not be able to access from another file

        System.out.println(box1.getItems());

    }
}
