package com.example.CodeChef.cp2021.April_Challenge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BOLT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            float a=sc.nextFloat();
            float b=sc.nextFloat();
            float c=sc.nextFloat();
            float v=sc.nextFloat();
            double ans=100/(a*b*c*v);
            double scale = Math.pow(10, 2);
            float number= (float) (Math.round(ans * scale) / scale);
            float d= (float) 9.58;
            if(number<d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
