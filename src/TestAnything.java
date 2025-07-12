import java.util.*;
public class TestAnything {

    public static void printNumberOfYears(int inMonths) {
        String years = String.valueOf(inMonths/12);
        String months = String.valueOf(inMonths%12);

            System.out.println("Years: "+years);

            System.out.println("Months: "+months);
    }

    public static void reverseWords(String s) {
        System.out.println("Original: "+s);
        StringBuilder res = new StringBuilder();
        int len = s.length();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<len;i++) {
            char ch = s.charAt(i);
            if(ch=='-') {
                if(!res.isEmpty()) {
                    res.insert(0, word + "-");
                }
                else {
                    res = new StringBuilder(word.toString());
                }
                word = new StringBuilder();
            }
            else if(i==len-1){
                word.append(ch);
                res.insert(0, word + "-");
            }
            else {
                word.append(ch);
            }
        }
        System.out.println("Changed: "+res);
    }

    public static void reverseWords2(String s) {
        System.out.println("Original: "+s);
        String[] parts = s.split("-");
        Collections.reverse(Arrays.asList(parts));
        String res = String.join("-", parts);
        System.out.println("Changed: "+res);
    }

    public static void main(String[] args) {
        //printNumberOfYears(37);
        reverseWords2("2025-12-31");
    }
}
