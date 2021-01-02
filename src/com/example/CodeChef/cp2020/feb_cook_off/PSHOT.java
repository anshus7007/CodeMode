package com.example.CodeChef.cp2020.feb_cook_off;


import java.util.Scanner;

public class PSHOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                String s = sc.next();
                int A=0,B=0;
                char str[] = s.toCharArray();int flag=0;
                for(int i=0;i<str.length;i++)
                {


                    if(i%2==0)
                    {
                        if(str[i]=='1')
                            A++;

                    }
                    else
                    {
                        if(str[i]=='1')
                            B++;
                    }
//                    if(((i)%2!=0)&&(((str.length-1-i)/2)<Math.abs(A-B)))
//                    {
//                        System.out.println(i+1);
//                        flag=1;
//                        break;
//                    }
                    if((A-B)>(Math.ceil(((double)(str.length-i-1))/2)))
                    {
                        flag=1;
                        System.out.println(i+1);
                        break;
                    }
                    if((B-A)>((((double)(str.length-i-1))/2)))
                    {
                        flag=1;
                        System.out.println(i+1);

                        break;
                    }

                }
                if(flag==0)
                    System.out.println(2*n);
            }

        }
    }
}
