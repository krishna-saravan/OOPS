package ExceptionHandeling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            String name = "krishna";

            if(name != "krishna"){
                throw new MyExecption("do not use name Krishna");
            }
        }catch (MyExecption e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will run no matter");
        }
    }

    static int divide(int a, int b) throws  Exception{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }
}
