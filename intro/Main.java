package intro;

public class Main {

    static void swapName(Human a , Human b) {
        String temp = a.Name;

        a.Name = b.Name;
        b.Name = temp;
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println(a + " " + b);

        System.out.println(Human.population); // calling static vairables of a class

        Human krishna = new Human("krishna", 20);

        System.out.println(krishna.population); //calling static using object reference which should not be used

        Human chaintnaya = new Human("chaitanya", 19);

//        swapName(krishna, chaintnaya);

        System.out.println(krishna.Name + " " + chaintnaya.Name);

        God ganesh = new God("Ganesh", "Birth");

//        ganesh = chaintnaya;  //this will not work because both are different non-primitive types

        krishna = chaintnaya; //reassignment of object

        System.out.println(krishna.Name);

        krishna.Name= "tejesh";

        System.out.println(chaintnaya.Name);

    }
}
