public class Main {


    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println("resultatet er " + factorial(5)+" N o");
        System.out.println("Fiber " + fibernachi(10));
    }

    private static int factorial(int n){

            if(n==1){
                return 1;
            }
            else{
                return n * factorial((n-1));
            }

    }



    static int fibernachi(int n){

        if(n<2){
            return 1;
        }
        else{
            return (fibernachi(n-1)+fibernachi(n-2));
        }

    }



}
