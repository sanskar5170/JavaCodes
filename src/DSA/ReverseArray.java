package DSA;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse1(int[] a, int pos) {
        if(pos>a.length/2) {
            return;
        }
        int left = pos;
        int right = a.length-1-left;
        int temp = a[pos];
        a[left] = a[right];
        a[right] = temp;
        reverse1(a,++pos);
    }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("Original array: "+ Arrays.toString(a));
        reverse1(a,0);
        System.out.println("Reversed array: "+ Arrays.toString(a));
    }
}
