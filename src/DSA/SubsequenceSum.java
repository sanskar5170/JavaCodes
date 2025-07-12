package DSA;

import java.util.*;
public class SubsequenceSum {
    static List<Integer> input;
    static List<List<Integer>> res=new ArrayList<>();
    static int k;
    public static void checkSum(int i,int sum,List<Integer> r)
    {
        if(sum==k)
             System.out.println(r.toString());

        if(i>=input.size())
        {
            res.add(r);
            return;
        }
        r.add(input.get(i));
        checkSum(i+1,sum+input.get(i),r);
        r.removeLast();
        checkSum(i+1,sum,r);

    }
    public static void main(String[] args)
    {
        input=new ArrayList<>(Arrays.asList(1,2,3,4));
        k=6;
        checkSum(0,0,new ArrayList<>());
        System.out.println("\n\n");
        for(List<Integer> t:res)
            System.out.println(t.toString());
    }
}
