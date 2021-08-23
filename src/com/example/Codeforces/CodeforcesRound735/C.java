package com.example.Codeforces.CodeforcesRound735;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod=(long)1e9+7;
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            int[] c =new int[n];
            c[0]=k;
            for(int i=1;i<n;i++)
            {
                if(b[i]==b[i-1])
                {
                    if(c[i-1]==0)
                        c[i]=0;
                    else
                    c[i]=c[i-1]-1;

                }
                else
                {
                    c[i]=k;

                }
            }
            int[] z =new int[n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(b[j]==a[i])
                    {
                        if(c[j]!=-1) {
                            z[i] = c[j];
                            c[j] = -1;
                            break;
                        }
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(z[i]+" ");
            }
            System.out.println();
        }
        
    }

}
