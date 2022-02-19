package generics;

import java.util.Arrays;

public class arraylist {
    private int [] data ;
    private int INITIAL_CAPACITY = 10;
    private int size = 0; //this also works as index

    public arraylist(){
        data = new int[INITIAL_CAPACITY];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int [data.length * 2];
        for(int i = 0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return (size == data.length);
    }

    public int poll(){
        int number = data[--size];
        return number;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
