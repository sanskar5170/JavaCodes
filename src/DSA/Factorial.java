package DSA;

public class Factorial {

    public static void factorial1(int n) {
        int res = 1;
        if(n>0) {
            for(int i=1;i<=n;i++) {
                res *=i;
            }
        }
        System.out.println("Factorial_1 of first "+n+" numbers is "+res);
    }
    public static int factorial2(int n, int res) {
        if(n==0 || n==1) {
            return res;
        }
        else {
            return factorial2(n-1,res*n);
        }
    }

    public static int factorial3(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        return n * factorial3(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        factorial1(n);
        int res = factorial2(n,1);
        System.out.println("Factorial_2 of first "+n+" numbers is "+res);

        System.out.println("Factorial_3 of first "+n+" numbers is "+factorial3(n));
    }
}
