package com.example.Codeforces.CodeforcesRound712;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();

            int[] zeros =new int[n];
            int[] one =new int[n];
            if(a.charAt(0)=='0') {
                zeros[0] = 1;
                one[0]=0;
            }
            else
            {
                zeros[0] = 0;
                one[0]=1;
            }
            for(int i=1;i<n;i++)
            {
                if(a.charAt(i)=='0')
                {
                    zeros[i] = zeros[i-1]+1;
                    one[i]=one[i-1];
                }
                else
                {
                    zeros[i] = zeros[i-1];
                    one[i]=one[i-1]+1;
                }
            }
//            for (int i=0;i<n;i++)
//            {
//                System.out.print(zeros[i]+" ");
//            }
//            System.out.println();
//            for (int i=0;i<n;i++)
//            {
//                System.out.print(one[i]+" ");
//            }
            int flag=0;
            int p=0;
            int i=n-1;
            if(a.equals(b))
            {
                System.out.println("YES");
                continue;
            }
            while (i>=0)
            {
                if(zeros[i]==one[i])
                    break;
                else
                    i--;
            }
            if(i==-1)
            {
                System.out.println("NO");
                continue;
            }
            for( ;i>=0;i--)
            {
                if(a.equals(b))
                {
                    break;
                }
                if(zeros[i]==one[i])
                {
                    if(a.charAt(i)!=b.charAt(i))
                    {
                        p=0;

                    }
                    else
                        p=1;
                }
                else
                {
                    if(a.charAt(i)!=b.charAt(i)&&p==0)
                        continue;
                    else if(a.charAt(i)==b.charAt(i)&&p==1)
                        continue;
                    else {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}
