package DSA;


public class CountDigits {
    static int countDigits(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
