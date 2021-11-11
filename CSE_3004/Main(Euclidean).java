import java.util.*;
public class Main {
    public static void main(String[] args) {
        long n,sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextLong();
        System.out.println(" result :" +fib(n));
    }
    static long fib(long n) {
         if(n<=1){
             return n;
         }
         return fib(n-1)+fib(n-2);    
    }
}

