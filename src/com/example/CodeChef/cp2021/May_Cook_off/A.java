package com.example.CodeChef.cp2021.May_Cook_off;

import java.util.Scanner;

 class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[][]=new int[1000][1000];
        a[0][0]=1;
        for(int i=0;i<1000;i++)
        {
            for(int j=0;j<1000;j++)
            {
               if(j!=0)
                a[i][j] =a[i][j-1]+i+j;

                if(i!=0&&j==0)
                {
                    a[i][j]=a[i-1][j]+i+1;
                }
            }
        }

        int t=sc.nextInt();
        while (t-->0)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            x1=x1-1;
            x2=x2-1;
            y1=y1-1;
            y2=y2-1;
            long sum=0;
            for(int i=x1;i<=x2;i++)
            {
                sum=sum+a[i][y1];
            }
            for(int i=y1+1;i<=y2;i++)
            {
                sum=sum+a[x2][i];
            }
            System.out.println(sum);

        }
    }
}
