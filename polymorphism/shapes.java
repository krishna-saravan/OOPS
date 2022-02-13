package polymorphism;

public class shapes {
    float side;
    int height;

    shapes(){
        this.side =0;
        this.height =0;
    }

    shapes(float side, int height){
        this.side = side;
        this.height = height;
    }

    shapes(int side){
        this.side =(float)side;
    }

    shapes(int side, float height){

    }

    void greeting(){
        System.out.println("in am in shapes class");
    }

    static void display(){
        System.out.println("hii is this display");
    }

}
