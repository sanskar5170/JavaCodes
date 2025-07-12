package DSA;/*A subsequence is a sequence derived from an array where elements appear in the same relative order,
but they don’t have to be contiguous.*/

/*Subarray has to be a contiguous sequence of an array and thus original array's order matters here.
Elements in a subarray are consecutive, so order matters and they must appear together in the original array.*/

/*A subset is any combination of elements from the array, regardless of order or position.
A subset includes the empty set and the array itself.*/


//Subarrays: Contiguous, order matters, only consecutive elements.
//Subsequences: Non-contiguous allowed, only relative order matters.
//Subsets: Non-contiguous allowed, order doesn’t matter.

//Every subarray is both a subsequence and a subset


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence
{
    static List<Integer> input=new ArrayList<>();

    public static void subSe(int i,List<Integer> res)
    {
        if(i>=input.size())
        {
            System.out.println(res.toString());
            return;
        }
        res.add(input.get(i));
        subSe(i+1,res);
        res.removeLast();
        subSe(i+1,res);
    }

    public static void main(String[] args)
    {
        input=new ArrayList<>(Arrays.asList(1,2,3,4));
        subSe(0,new ArrayList<Integer>());
    }

}