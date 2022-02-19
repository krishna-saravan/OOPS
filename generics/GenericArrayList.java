package generics;

import java.util.Arrays;

public class GenericArrayList <T>{
    private Object [] data ;
    private int INITIAL_CAPACITY = 10;
    private int size = 0; //this also works as index

    public GenericArrayList(){
        data = new Object[INITIAL_CAPACITY];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object [] temp = new Object[data.length * 2];
        for(int i = 0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return (size == data.length);
    }

    public T poll(){
        T number = (T) data[--size];
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
