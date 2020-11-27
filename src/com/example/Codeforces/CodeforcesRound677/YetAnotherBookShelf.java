package com.example.Codeforces.CodeforcesRound677;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
public class  YetAnotherBookShelf{
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n =sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==0)
                    continue;
                for(int j=i+1;j<n;j++)
                {
                    if(a[j]==1) {
                        c += j - i - 1;
                        break;
                    }

                }
            }
            System.out.println(c);

        }
    }





}