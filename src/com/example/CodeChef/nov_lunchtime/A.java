package com.example.CodeChef.nov_lunchtime;


import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[] = new int[n];
            boolean flag=false;
            for(int i=0;i<n;i++) {

                a[i] = sc.nextInt();
            }
            int sum=a[0];int k=0;
            for(int i=1;i<n;i++)
            {
                if(sum>0) {
                    sum = sum + a[i] - 1;
                    k = k + 1;
                }
                else
                {
                    k=k+sum;
                    sum=0;

                    flag=true;
                    break;
                }
            }
            System.out.println(k+sum);


        }
    }
}
