package com.example.CodeChef.cp2020.may_cook_off;


import java.util.*;
class CHEFRECP {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            int[] freq = new int[1001];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                freq[a[i]]++;

            }
            int[] uni = new int[1001];
            int flag=0;
            for(int i=0;i<1001;i++)
            {
                if (freq[i]>0)
                    uni[freq[i]]++;
            }
            for(int i:uni)
            {
                if(i>1)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("NO");
            }
            else
            {
                int[] visited =new int[1001];
                visited[a[0]]=1;int i=0;
                for( i=1;i<n;i++)
                {
                    if(a[i]==a[i-1])
                        continue;
                    if(visited[a[i]]==1)
                        break;

                    visited[a[i]]=1;
                }
                if(i==n)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
