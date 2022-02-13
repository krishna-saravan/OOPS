package acess;

public class B {

    int a;
    int b;

    public B(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public boolean equals(B obj) {
        if(obj.a == a){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public String toString() {
//        String mes = "";
//        mes += this.a;
//       return mes;
//    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object has been removed");
    }
}
