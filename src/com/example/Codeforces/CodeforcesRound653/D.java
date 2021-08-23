package com.example.Codeforces.CodeforcesRound653;

import java.lang.reflect.Array;
import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
           int n=sc.nextInt();
           int k=sc.nextInt();
           Integer[] a =new Integer[n];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();

           }
            Arrays.sort(a, Collections.reverseOrder());
           int x=0;
           int c=0;
           int ans=0;
           for(int i=0;i<10000000;i++)
           {
               for(int j=0;j<n;j++)
               {
                   if(a[j]%k==0)
                       ans++;

               }
           }
            System.out.println(c);

        }
    }
}
