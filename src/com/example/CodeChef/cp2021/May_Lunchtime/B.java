package com.example.CodeChef.cp2021.May_Lunchtime;

import java.util.*;

class B {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            char a[] =sc.next().toCharArray();                int sum=0;


            for(int i=1;i<n;i++)
            {
                if(a[i]!=a[i-1])
                    sum=sum+1;
                else
                    sum=sum+2;
            }
            while (k-->0)
            {
                int q=sc.nextInt();
                int p=0,c=0;
                if(q-2>=0) {
                    if (a[q - 1] != a[q - 2])
                        p += 1;
                    else
                        p += 2;
                }
                if(q<=n-1) {
                    if ( a[q - 1] != a[q])
                        p += 1;
                    else
                        p += 2;
                }
                if(a[q-1]=='1')
                    a[q-1]='0';
                else
                    a[q-1]='1';
                if(q-2>=0) {
                    if ( a[q - 1] != a[q - 2])
                        c += 1;
                    else
                        c += 2;
                }
                if(q<=n-1) {

                    if (a[q - 1] != a[q])
                        c += 1;
                    else
                        c += 2;
                }
                sum=sum-p+c;
                System.out.println(sum);

            }
        }

    }
}
