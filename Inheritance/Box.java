package Inheritance;

public class Box {
    int lenght;
    int breadth;
    int height;
    private int no_items = 20;

    Box(){
        this.lenght = -1;
        this.breadth = -1;
        this.height = -1;
    }

    Box(int lenght, int breadth, int height) {
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    Box(int side){
        this.lenght = side;
        this.breadth = side;
        this.height = side;
    }

    int getItems(){
        return no_items;
    }

    void setNo_items(int items){
        this.no_items = items;
    }


    void volume(){
        System.out.println(lenght*breadth*height);
    }
}
