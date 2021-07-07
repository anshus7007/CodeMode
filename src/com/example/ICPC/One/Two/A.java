package com.example.ICPC.One.Two;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int c=0;


            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch!='.') {
                    c++;
                }
            }
            int crrct[]=new int[c];
            int initial[]=new int[c];
            int final_p[]=new int[c];
            int flag=0;
            int k=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                    if(ch!='.') {
                        initial[k] = (i - Integer.parseInt(String.valueOf(ch)))<0?0:(i - Integer.parseInt(String.valueOf(ch)));

                        final_p[k] = i + Integer.parseInt(String.valueOf(ch))>=s.length()?s.length()-1:i + Integer.parseInt(String.valueOf(ch));
                        crrct[k] = i;
                        k++;
                        if (k == c)
                            break;
                    }


            }

            for(int i=0;i<c;i++)
            {
                for(int j=i+1;j<c;j++)
                {
                    if(final_p[i]-initial[j]>=0)
                    {
//                        if((crrct[j]-crrct[i]-1)%2==1&&((final_p[j]-crrct[j])+(crrct[i]-initial[i]))%2==1)
//                        {
                            flag=1;
                            break;
//                        }
                    }
                }
            }
            if(flag==1)
                System.out.println("unsafe");
            else
                System.out.println("safe");
        }
    }
}
