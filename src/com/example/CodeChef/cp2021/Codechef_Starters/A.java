package com.example.CodeChef.cp2021.Codechef_Starters;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {

                int e=sc.nextInt();
int c=0;
                int k=sc.nextInt();
                while(true)
                {
                    if(e/k==0)
                        break;
                    else
                    {
                        e=e/k;
                        c++;
                    }
                }
                System.out.println(c+1);
            }


    }


    }

