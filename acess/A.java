package acess;

public class A {
    public int num;
    protected String name;
    int [] arr;

    final int n= 0;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }

    final void greeting(){
        System.out.println("this from class a");
    }

    public static void main(String[] args) {
        A obj = new A(10,"krishna");

        int a = 10;

    }
}
