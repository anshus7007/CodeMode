package com.example.CodeChef.cp2021.July_Challenge;

import java.util.Scanner;

class B {
   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {
                int  n=sc.nextInt();
                long[] a =new long[n];
               long[] b =new long[n];
               for(int i=0;i<n;i++)
               {
                   a[i]=sc.nextLong();
               }
               for(int i=0;i<n;i++)
               {
                   b[i]=sc.nextLong();
               }
               long k=a[0];
               long min=Long.MAX_VALUE;
               int c=0;
               int p=0;
               for(int i=0;i<n;i++)
               {
                   if(((k+b[i])%n)<=min) {
                       min = ((k + b[i]) % n);
                   }

               }
               for(int i=0;i<n;i++)
               {
                   if(((k+b[i])%n)==min) {
                       p=i;
                       c++;
                   }
               }
               int q=0;
               int m=0;
               if(c==1)
               {
                   for(int i=p;i<n+p;i++)
                   {
                       System.out.print((a[m]+(b[i%n]))%n+" ");
                       m++;
                   }
                   System.out.println();
                   continue;
               }
               if(c==2)
               {
                   for(int i=0;i<n;i++)
                   {
                       if(((k+b[i])%n)==min&&p!=i) {
                           q=i;
                       }
                   }

               }
               long[] c1 =new long[n];
               long[] c2 =new long[n];
               int j=0;
               for(int i=p;i<p+n;i++)
               {
                   c1[j]=(a[j]+b[i%n])%n;
                   j++;
               }
//               for(int i=0;i<n;i++)
//               {
//                   System.out.print(c1[i]+" ");
//               }
                j=0;
               for(int i=q;i<q+n;i++)
               {
                   c2[j]=(a[j]+b[i%n])%n;
                   j++;
               }
//               for(int i=0;i<n;i++)
//               {
//                   System.out.print(c2[i]+" ");
//               }
               int flag=-1;
               for(int i=0;i<n;i++)
               {
                   if(c1[i]!=c2[i])
                   {
                       if(c1[i]<c2[i]) {
                           flag = 0;
                           break;
                       }
                       if(c1[i]>c2[i]) {
                           flag = 1;
                           break;
                       }
                   }
               }
               if(flag==-1)
               {
                   for(int i=0;i<n;i++)
                   {
                       System.out.print(c1[i]+" ");
                   }
               }
               if(flag==0)
               {
                   for(int i=0;i<n;i++)
                   {
                       System.out.print(c1[i]+" ");
                   }
               }
               if(flag==1)
               {
                   for(int i=0;i<n;i++)
                   {
                       System.out.print(c2[i]+" ");
                   }
               }
               System.out.println();




           }


   }
}
