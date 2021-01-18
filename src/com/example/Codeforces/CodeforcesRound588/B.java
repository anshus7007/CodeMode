package com.example.Codeforces.CodeforcesRound588;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String w=sc.next();
        char s[]=w.toCharArray();
        if(n==1&&k>=1)
            System.out.println("0");
        else
        {


                int i;
                for (i = 0; i < s.length; i++) {
                    if (s[i] == '1' && i == 0)
                        continue;
                    else if (s[i] == '0')
                        continue;
                    else
                        break;

                }
                for (int j = i; j < s.length; j++) {
                    if (k <= 0)
                        break;
                    if (j == 0) {
                        s[j]='1';
                        k--;

                    } else {
                        if(s[j]!='0') {
                            s[j]='0';
                            k--;
                        }

                    }

                }
                System.out.println(s);

        }
    }
}
