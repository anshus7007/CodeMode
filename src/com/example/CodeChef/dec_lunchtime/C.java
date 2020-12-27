package com.example.CodeChef.dec_lunchtime;

import java.util.Arrays;
import java.util.Scanner;

 class C
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String p=sc.next();
            int one=0,zero=0,o=0,z=0;
            for(int i=0;i<n;i++)
            {
                char ch1=s.charAt(i);
                if(ch1=='1')
                    one++;
                else
                    zero++;
            }
            for(int i=0;i<n;i++)
            {
                char ch1=p.charAt(i);
                if(ch1=='1')
                    o++;
                else
                    z++;
            }
//            System.out.println(one+" "+zero);
//            System.out.println(o+" "+z);
            if(one==o&&zero==z) {
                int k[]=new int[n];
                Arrays.fill(k,-1);
                int j=0;
                int flag=1;boolean m=true;
                for(int i=0;i<n;i++)
                {
                    if(s.charAt(i)!=p.charAt(i))
                    {
                        k[j]=i;
                        j++;
                    }

                }
//                int i;
//                for( i=0;i<n;i++)
//                {
//                    if(k[i]==-1)
//                        break;
//                }
                if(j==0)
                {
                    System.out.println("Yes");
                    continue;
                }
                if((j) % 2 != 0)
                    System.out.println("No");
                else
                {
                    int r=0;
                    for(int l=0;l<j;l++)
                    {
//                        System.out.println(r);
                        if(r<0)
                            break;
                        if(s.charAt(k[l])=='1')
                            r++;
                        else
                            r--;
                    }
                    if(r<0) {
//                        System.out.println("hel");
                        System.out.println("No");
                    }
                    else
                        System.out.println("Yes");
                }
            }
            else
            {
                System.out.println("No");
            }

        }
    }
}
