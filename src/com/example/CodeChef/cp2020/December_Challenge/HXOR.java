package com.example.CodeChef.cp2020.December_Challenge;

import java.util.Scanner;

public class HXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0)
            {
                int n=sc.nextInt();
                int x=sc.nextInt();
                long a[] = new long[n];
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextLong();
                }
                int i=0,j;int c=0;

                while (i<n-1)
                {
                    if(a[i]==0)
                    {
                        i++;
                    }
                    int p= (int) ((Math.log10(a[i]))/Math.log10(2));

                    for(j=i+1;j<n;j++)
                    {
                        if((a[j]/((int)Math.pow(2,p)))%2==0)
                        {
                            if(j==n-1)
                                break;

                        }
                        else
                            break;
                    }



                        a[i]=a[i]^(int)Math.pow(2,p);
                        a[j]=a[j]^(int)Math.pow(2,p);

                    c++;
                    if(x==c)
                    {
                        break;
                    }
                    if(a[i]==0)
                    {
                        i++;
                    }

                    else if(a[i]==0&&a[j]==0)
                    {
                        j++;
                        i=j;
                    }
                }
                if(n==2&&(x-c)%2==1)
                {
                    i=0;
                    j=1;
                    a[i]=a[i]^1;
                    a[j]=a[j]^1;
                }
                for(int k=0;k<n;k++)
                {
                    System.out.print(a[k]+" ");
                }
            }
        }
}
