package intro;

public class Human {
    String Name;
    int age;
    static int population = 0;

    public Human(String name, int age){
        this.Name = name;
        this.age = age;
        population++;
    }

    public Human(){
        this.Name = "new Born";
        this.age = 0;
        population++;
    }

    void fun(){
        greeting();
    }

    static void fun2(){
//        greeting(); //this will not work as object needs to be created


        // create new object or reference object to use non-static methods

        Human main = new Human("new born", 0);

        main.greeting();
    }

    void greeting(){
        System.out.println(this.Name + " says hello");
    }
}
