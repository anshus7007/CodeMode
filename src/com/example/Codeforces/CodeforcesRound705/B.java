package com.example.Codeforces.CodeforcesRound705;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int h=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int a[]={0,1,2,-1,-1,5,-1,-1,8,-1};
            int  hr=Integer.parseInt(s.substring(0,2));
            int mm=Integer.parseInt(s.substring(3));
            int x=hr;
             x=hr%10;
            int y=hr/10;
            int p=mm;
             p=mm%10;
            int q=mm/10;


            if(a[y]==-1||a[x]==-1)
            {

                int i;
                for( i=hr;i<h;i++)
                {
                    if(i==h-1)
                        i=0;
                    if(a[(i%(h-1))%10]!=-1&&a[(i%(h-1))/100]!=-1)
                    {
                        String w="";
                        String k=String.valueOf(i);
                        char[] try1 = k.toCharArray();

                        for (int j = try1.length - 1; j >= 0; j--)
                            w=w+try1[j];
                        if(w.length()!=2)
                            w=w+"0";
                        if(w.charAt(0)=='2')
                            w="5"+w.substring(1);
                        if(w.charAt(1)=='2')
                            w=w.substring(0,1)+"5";
                        if(w.charAt(0)=='5')
                            w="2"+w.substring(1);
                        if(w.charAt(1)=='5')
                            w=w.substring(0,1)+"2";
                        if(Integer.parseInt(w)<m)
                            break;


                    }

                }
                if(i==0)
                    System.out.print("00:");
                else if(i>=1&&i<=9)
                    System.out.print("0"+i+":");
                else
                System.out.print(i+":");
            }
            else
            {
                int i=hr;

                if(i!=0) {
                    for (i = hr; i < h; i++) {
                        if (i == h - 1)
                            i = 0;
                        if (a[(i % (h - 1)) % 10] != -1 && a[(i % (h - 1)) / 100] != -1) {
                            String w = "";
                            String k = String.valueOf(i);
                            char[] try1 = k.toCharArray();

                            for (int j = try1.length - 1; j >= 0; j--)
                                w = w + try1[j];
                            if (w.length() != 2)
                                w = w + "0";
                            if (w.charAt(0) == '2')
                                w = "5" + w.substring(1);
                            if (w.charAt(1) == '2')
                                w = w.substring(0, 1) + "5";
                            if (w.charAt(0) == '5')
                                w = "2" + w.substring(1);
                            if (w.charAt(1) == '5')
                                w = w.substring(0, 1) + "2";
                            if (Integer.parseInt(w) < m)
                                break;


                        }

                    }
                }
                 if(i==0)
                    System.out.print("00:");
                 else if(i>=1&&i<=9)
                     System.out.print("0"+i+":");
                else
                    System.out.print(i+":");


            }
            if(a[p]==-1||a[q]==-1)
            {
                int i;
                for( i=mm;i<m;i++)
                {
                    if(i==m-1)
                        i=0;
                    if(a[(i%(m-1))%10]!=-1&&a[(i%(m-1))/100]!=-1)
                     {
                         String w="";
                         String k=String.valueOf(i);
                         char[] try1 = k.toCharArray();

                         for (int j = try1.length - 1; j >= 0; j--)
                             w=w+try1[j];
                         if(w.length()!=2)
                             w=w+"0";
                         if(w.charAt(0)=='2')
                             w="5"+w.substring(1);
                         if(w.charAt(1)=='2')
                             w=w.substring(0,1)+"5";
                         if(w.charAt(0)=='5')
                             w="2"+w.substring(1);
                         if(w.charAt(1)=='5')
                             w=w.substring(0,1)+"2";
                         if(Integer.parseInt(w)<h)
                             break;
                     }

                }
                if(i==0)
                    System.out.print("00");
                else if(i>=1&&i<=9)
                    System.out.print("0"+i);


                else
                    System.out.print(i);

                System.out.println();

            }
            else
                {
                    int i=mm;

                    if(i!=0) {
                        for (i = mm; i < m; i++) {
                            if (i == m - 1)
                                i = 0;
                            if (a[(i % (m - 1)) % 10] != -1 && a[(i % (m - 1)) / 100] != -1) {
                                String w = "";
                                String k = String.valueOf(i);
                                char[] try1 = k.toCharArray();

                                for (int j = try1.length - 1; j >= 0; j--)
                                    w = w + try1[j];
                                if (w.length() != 2)
                                    w = w + "0";
                                if (w.charAt(0) == '2')
                                    w = "5" + w.substring(1);
                                if (w.charAt(1) == '2')
                                    w = w.substring(0, 1) + "5";
                                if (w.charAt(0) == '5')
                                    w = "2" + w.substring(1);
                                if (w.charAt(1) == '5')
                                    w = w.substring(0, 1) + "2";
                                if (Integer.parseInt(w) < h)
                                    break;
                            }

                        }
                    }
                     if(i==0)
                        System.out.print("00");
                    else if(i>=1&&i<=9)
                        System.out.print("0"+i);
                    else
                        System.out.print(i);
                    System.out.println();

                }




        }
    }
}
