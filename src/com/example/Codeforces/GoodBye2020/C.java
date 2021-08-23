package com.example.Codeforces.GoodBye2020;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String s=sc.next();
            int l=s.length();
            int c=0;int i=0;
            if(s.length()==1)
            {
                System.out.println("0");
                continue;
            }
            while (i<l)
            {
                String w=""+s.charAt(i);

                for(int j=i+1;j<l;j++)
                {
                    w=w+s.charAt(j);
                    if(s.charAt(j)==s.charAt(i))
                    {
                        if(palindrome(w)) {
                            int rs=(j-i)/2;

                            if((j-i-1)!=0&&s.charAt(rs)==s.charAt(rs+1))
                                s = s.substring(0, rs) + "*" + s.substring(rs+1 );
                            else if(j-i-1==0||j-i-1==1)
                                s = s.substring(0, j) + "*" + s.substring(j + 1);
                            else
                                s = s.substring(0, rs-1) + "*" + s.substring(rs );
                            c++;
                        }
                        break;
                    }
                }
                i++;
            }
            if(palindrome(s))
                c++;
            System.out.println(c);
        }
    }
    public static boolean palindrome(String a)
    {
        String b="";
        int n=a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        return a.equals(b);
    }
}
