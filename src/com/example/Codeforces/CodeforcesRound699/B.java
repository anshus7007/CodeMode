package com.example.Codeforces.CodeforcesRound699;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a = new int[n];
            int[] b =new int[n];
            int[] c =new int[m];
            HashMap<Integer,Integer> map1= new HashMap<>();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

                    map1.put(a[i],i);

            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                if(a[i]!=b[i])
                    set.add(b[i]);
            }
            HashMap<Integer,Integer> map= new HashMap<>();
            Set<Integer> set1=new HashSet<>();

            for(int i=0;i<m;i++)
            {
                c[i]=sc.nextInt();
                set1.add(c[i]);
                if(map.containsKey(c[i]))
                    map.put(c[i],map.get(c[i])+1);
                else
                    map.put(c[i],1);

            }

            int flag=0;
            for(int i=0;i<n;i++)
            {

                if(a[i]!=b[i])
                {

                    if(map.containsKey(b[i]))
                    {
                        if(map.get(b[i])!=0) {
                            map.put(b[i], map.get(b[i]) - 1);
                        }
                        else

                        {
                            flag=1;
                            System.out.println("NO");
                            break;
                        }

                    }
                    else
                    {
                        flag=1;
                        System.out.println("NO");
                        break;

                    }
                }
            }
            int fla0;

//            for(int i:set1)
//            {
//                for(int j:set)
//                    if(i==j)
//
//            }

            int k[]=new int[m];
            if(flag==0)
            {
                System.out.println("YES");
              for(int i=0;i<m;i++) {
                  for (int j = 0; j < n; j++) {
                      if (a[j] != b[j]) {
                        if(c[i]==b[j]) {
                            a[j]=b[j];
                            k[i] = j + 1;
                            break;
                        }
                      }
                  }
              }
              for(int i=0;i<m;i++)
              {
                  if(k[i]==0)
                  {
                      if(map1.containsKey(c[i]))
                      k[i]=map1.get(c[i])+1;
                      else
                          k[i]=k[i-1];
                  }
                  System.out.print(k[i]+" ");
              }


            }



        }
    }
}
