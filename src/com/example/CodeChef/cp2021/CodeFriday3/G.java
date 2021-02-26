package com.example.CodeChef.cp2021.CodeFriday3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n=sc.nextInt();
            int flag=0;
            for(int i=1;i<=9;i++)
            {
                if(n%i==0)
                {
                    if(n/i>=1&&n/i<=9)
                    {
                        flag=1;
                    }
                }
            }
            if ((flag==1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }catch (Exception e){
            return;
        }
    }
}
