package com.example.Codeforces.EducationalCodeforcesRound111;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Geeks
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int[] a, int n)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);

            }
        }
        int min=Integer.MAX_VALUE;
        int min1=Integer.MIN_VALUE;

        Set<Map.Entry<Integer,Integer>> set= map.entrySet();
        for(Map.Entry<Integer,Integer> i:set)
        {
            if(i.getValue()<min)
            {
                min=i.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> i:set)
        {
            if(i.getValue()==min)
            {
                if(i.getKey()>min1)
                    min1=i.getKey();
            }


        }


        return min1;

    }
}

// { Driver Code Starts.

// Driver class with main function
class C
{
    // Main function
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Iterating over testcases
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Geeks obj = new Geeks();
            System.out.println(Geeks.LargButMinFreq(arr, n));
        }
    }
}  // } Driver Code Ends