package Inheritance;

public class BoxWeight extends Box{
    int weight;

    //once you inherit
    //int length;
    //int breadth
    //int height;

    BoxWeight(){
        super();
        this.weight = 0;
    }

    BoxWeight(int length, int breadth, int height, int weight){
        super(length,breadth,height);
        this.weight = weight;
    }

    BoxWeight(int weight){
        super();
        this.weight = weight;
    }

    BoxWeight(int side, int weight){
        super(side);
        this.weight = weight;
    }

    // object type constructor
    BoxWeight(BoxWeight other){
        super(other.lenght, other.breadth, other.height);
        this.weight = other.weight;
    }


    void greeting(){
        System.out.println("this is box weight");
    }

}
