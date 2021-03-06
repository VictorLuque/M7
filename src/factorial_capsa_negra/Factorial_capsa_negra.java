package factorial_capsa_negra;

public class Factorial_capsa_negra {

    private static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        System.out.println(factorial(Integer.parseInt(args[0])));
    }
    private static int factorial2(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    private static int prova(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * prova(n - 1);
    }
}
