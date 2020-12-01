package com.example.CodeChef.nov_lunchtime;


import java.util.HashMap;
import java.util.Scanner;

class GasolineIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            int freq[] = new int[100];
            int i=0,j=0;
            while(j<n)
            {
                if(a[i]==a[j])
                    j++;
                else
                {
                    if(freq[a[i]]==-1)
                    {
                        j++;
                        continue;
                    }

                    if((j-i)<=k)
                        freq[a[i]]++;
                    else
                        freq[a[i]]=-1;
                    i=j;
                }
            }
            for(int m=0;m<100;m++)
            {
                System.out.println(m+"->"+freq[m]);
            }



//        int t=sc.nextInt();
//        while(t-->0)
//        {
//            int n=sc.nextInt();
//            int a[] = new int[n];
//            boolean flag=false;
//            int max=Integer.MIN_VALUE;
//            for(int i=0;i<n;i++) {
//
//                a[i] = sc.nextInt();
//                if(a[i]>max)
//                    max=a[i];
//            }
//            int b[] = new int[n];
//            int min=Integer.MAX_VALUE;
//            int p=-1;
//            for(int i=0;i<n;i++)
//            {
//                b[i]=sc.nextInt();
//                if(a[i]==max)
//                {
//                    if(b[i]<min) {
//                        min = b[i];
//                        p=i;
//                    }
//
//                }
//            }
//            int sum=a[p];
//            int coin=a[p]*b[p];
//            int i=(p+1)%n;
//            for( ;i<(n+p);i++)
//            {
//                if(sum>0)
//                {
//                    sum=sum-1;
//                    if(sum<=0)
//                    {
//                        coin=coin+a[i%n]*b[i%n];
//                    }
//                    sum=sum+a[i%n];
//
//                }
//                else
//                {
//                    coin=coin+a[i%n]*b[i%n];
//                }
//            }
//            System.out.println(coin);



        }
    }
}
