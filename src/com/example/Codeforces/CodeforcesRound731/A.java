package com.example.Codeforces.CodeforcesRound731;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s=sc.next();
            int p=s.indexOf('a');
            if(p==-1)
            {
                System.out.println("NO");
                continue;
            }
            char ch=s.charAt(p);

            int i=p,j=p,x=i,y=j;
            int flag=0;
            while(true)
            {

                char ch1='A',ch2='A';
                if(x<=s.length()-2)
                 ch1=s.charAt(x+1);
                if(y>=1)
                 ch2=s.charAt(y-1);
//                System.out.println((int)ch1-ch+" "+(ch2-(ch)));
                if(ch1!='A'&&ch1-ch==1)
                {
//                    System.out.print(ch1+" ");
                    x++;
                    p=x;
                    ch=ch1;
                }
                if(ch2!='A'&&ch2-ch==1) {
//                    System.out.print(ch2+" ");
                    y--;
                    p=y;
                    ch=ch2;
                }
                if(x==s.length()-1&&y==0)
                    break;
                if(x==i&&y==j)
                {
//                    System.out.println(x+" "+y);
//                    System.out.println("J");

                    flag=1;

                    break;}
                else
                {

                    i=x;
                    j=y;
                }


//                System.out.println("H");



            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }

}
