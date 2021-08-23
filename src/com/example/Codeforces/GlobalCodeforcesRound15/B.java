package com.example.Codeforces.GlobalCodeforcesRound15;

import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
            int n=sc.nextInt();
            int[][] a =new int[n][5];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<5;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            if(n==1)
            {
                System.out.println("1");
                continue;
            }
            int[][] ans =new int[5][n];
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    for(int k=i+1;k<n;k++)
                    {
                        if(a[i][j]<a[k][j])
                            ans[j][i]+=1;
                        else if(a[i][j]>a[k][j])
                            ans[j][k]+=1;
                    }
                }
            }
//            for(int i=0;i<5;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(ans[i][j]+" ");
//                }
//                System.out.println();
//            }
            int flag=0;
            int m=-2;

               for(int j=0;j<n;j++) {
                   int c = 0;

                   for (int k = 0; k < 5; k++) {
//                       if (ans[k][j] >= 3) {
                           c+=ans[k][j];
//                       }
                   }
                   if ((int)Math.round(c/(double)3)>(n-1)) {
                       flag = 1;
                       m = j;
                       break;
                   }
               }



               System.out.println(m+1);
       }
    }
}