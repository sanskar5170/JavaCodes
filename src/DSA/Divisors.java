package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public static void allFactors(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                res.add(i);
                if(n/i!=i) {
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        System.out.println(res.toString());
    }
    public static void gcd1(int a, int b) {
        int res = 0;
        int temp1=a;
        int temp2=b;
        while(temp1>0 && temp2>0) {
            if(temp1>=temp2) {
                temp1 = temp1-temp2;
            }
            else{
                temp2 = temp2-temp1;
            }
        }
        res = temp1!=0?temp1:temp2;
        System.out.println("GCD for "+a+" and "+b+" is: "+res);
    }

    public static void gcd2(int a, int b) {
        int res = 0;
        int temp1=a;
        int temp2=b;
        while(temp1>0 && temp2>0) {
            if(temp1>=temp2) {
                temp1 = temp1%temp2;
            }
            else{
                temp2 = temp2%temp1;
            }
        }
        res = temp1!=0?temp1:temp2;
        System.out.println("GCD for "+a+" and "+b+" is: "+res);
    }
    public static void main(String[] args) {
        int N = 72;
//        System.out.println("N: " + N);
//        allFactors(N);
        gcd2(20,15);
    }
}
