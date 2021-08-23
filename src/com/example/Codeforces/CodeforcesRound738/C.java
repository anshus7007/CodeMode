package com.example.Codeforces.CodeforcesRound738;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int p=-1,q=-1;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
//                if(a[i]==0&&i==(n-2))
//                    p=i+1;
//                if(a[i]==1&&i==1)
//                    q=i+1;
            }
            int x=-1,y=-1;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]==0&&a[i+1]==1)
                {
                    x=i+1;
                    break;
                }

            }
            if(a[0]==1)
            {
                System.out.print((n+1)+" ");
                for(int i=1;i<=n;i++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            else if(a[n-1]==0)
            {
                for(int i=1;i<=n+1;i++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
//            else if(p==n-1&&a[n-1]==1)
//            {
//                for(int i=1;i<=p;i++)
//                {
//                    System.out.print(i+" ");
//                }
//                System.out.print((n+1)+" "+n);
//                System.out.println();
//            }
            else if(x>-1)
            {
                for(int i=1;i<=x;i++)
                {
                    System.out.print(i+" ");
                }
                System.out.print((n+1)+" ");
                for(int i=x+1;i<=n;i++)
                    System.out.print(i+" ");
                System.out.println();
            }
//            else if(a[0]==0&&q==2&&a[n-1]==1)
//            {
//                System.out.print(1+" "+(n+1)+" ");
//                for(int i=2;i<=n;i++)
//                    System.out.print(i+" ");
//                System.out.println();
//            }

            else
                System.out.println("-1");
        }
        
    }

}
