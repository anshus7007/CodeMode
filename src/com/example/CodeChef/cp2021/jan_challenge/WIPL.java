package com.example.CodeChef.cp2021.jan_challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WIPL
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            Integer a[]= new Integer[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a, Comparator.reverseOrder());
            int flag=0;
            int tower1=0,tower2=0,c1=0,c2=0;
            int i;
            for( i=0;i<n;i+=2)
            {
                if(tower1>=k) {
                    flag=1;
                    break;
                }
                if(tower2>=k)
                {
                    flag=2;
                    break;
                }
                if(tower1<k) {
                    tower1 = tower1 + a[i];
                    c1++;
                }
                if(tower2<k) {
                    if(i+1<n) {
                        tower2 = tower2 + a[i + 1];
                        c2++;
                    }
                    else
                        break;
                }
            }

            if(flag==1)
            {
                for(int j=i;j<n;j++)
                {
                    if(tower2>=k)
                        break;
                    tower2=tower2+a[j];

                    c2++;
                }
            }
            if(flag==2)
            {
                for(int j=i;j<n;j++)
                {
                    if(tower1>=k)
                        break;
                    tower1=tower1+a[j];
                    c1++;
                }
            }
            System.out.println(tower1+" "+tower2);
            if(tower1<k||tower2<k)
                System.out.println("-1");
            else
                System.out.println(c1+c2);

        }
    }

}
