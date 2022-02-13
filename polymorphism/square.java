package polymorphism;

public class square extends shapes {

    square(int side){
        super(side);
    }

    square(int side, int height){
        super((float) side,height);
    }

    void greeting(){
        System.out.println("in am in square class");
    }
}
