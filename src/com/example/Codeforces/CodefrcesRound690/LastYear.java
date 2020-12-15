package com.example.Codeforces.CodefrcesRound690;

import java.util.Scanner;

public class LastYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int p=s.indexOf('2');
            if(n>=4)
            {


             if(s.substring(n-4).equals("2020"))
            {

                System.out.println("YES");
            }
            else if(s.substring(0,4).equals("2020"))
            {
                System.out.println("YES");
            }
            else  if(s.charAt(0)=='2'&&s.substring(n-3).equals("020"))
                    System.out.println("YES");
            else if(s.substring(0,2).equals("20")&&s.substring(n-2).equals("20"))
                 System.out.println("YES");
             else if(s.substring(0,3).equals("202")&&s.substring(n-1).equals("0"))
                 System.out.println("YES");
//              else  if(s.substring(n-4).equals("2020")&&Integer.parseInt(s.substring(0,n-4))==0)
//             {
//                 System.out.println("YES");
//             }
            else
                System.out.println("NO");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
