package DSA;

public class Fibo {
    public static int fib1(int n) {
        int a =0;
        int b=1;
        if(n==0) {
            return a;
        }
        else if(n==1) {
            return b;
        }
        else {
            int res = 0;
            int pos = 2;
            while(pos<=n) {
                res = a+b;
                a=b;
                b=res;
                pos++;
            }
            return res;
        }
    }
    public static int fib2(int N) {
        if(N <= 1){
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fib2(N-1);
        int slast = fib2(N-2);
        return last + slast;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("Nth("+n+") element of fibonacci_1 series is :"+fib1(n));
        System.out.println("Nth("+n+") element of fibonacci_2 series is :"+fib2(n));

    }
}
