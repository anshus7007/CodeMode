package com.example.Codeforces.CodeforcesRound736;

import java.lang.reflect.Array;
import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        HashMap<Integer,Boolean> map1=new HashMap<>();
//        for(int i=1;i<=n;i++)
//        {
//            ArrayList<Integer> arr=new ArrayList<>();
//            map.put(i+1,arr);
//        }
        for(int i=0;i<m;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (map.containsKey(x) ) {
                ArrayList<Integer> arr = map.get(x);
                arr.add(y);
                map.put(x, arr);



            }
            else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(y);
                map.put(x, arr);
            }
             if(map.containsKey(y))
            {
                ArrayList<Integer> arr2 = map.get(y);
                arr2.add(x);
                map.put(x, arr2);
            }
            else {

                ArrayList<Integer> arr2 = new ArrayList<>();
                arr2.add(x);
                map.put(y, arr2);


            }
        }
           int q=sc.nextInt();
           for(int i=0;i<q;i++) {
               int x=sc.nextInt();
               if(x==1) {
                   int d=sc.nextInt();
                   int e=sc.nextInt();
                   ArrayList<Integer> arr = map.get(d);
//                   for(int k:arr)
//                       System.out.print(k+" ");

                   if(arr!=null) {
                       if(!arr.contains(e))
                       arr.add(e);
                   }
                   else
                   {
                       arr=new ArrayList<>();
                       arr.add(e);
                   }
                   map.put(d, arr);

                   ArrayList<Integer> arr2 = map.get(e);
                   if(arr2!=null) {
                       if(!arr2.contains(d))
                           arr2.add(d);
                   }
                   else
                   {
                       arr2=new ArrayList<>();
                       arr2.add(d);
                   }
                   map.put(e, arr2);
               }
               if(x==2) {
                   int d=sc.nextInt();
                   int e=sc.nextInt();
                   ArrayList<Integer> arr = map.get(d);
                   if(arr.contains(e)) {
                       arr.remove(new Integer(e));
                       map.put(d, arr);
                   }
                   ArrayList<Integer> arr2 = map.get(e);
//                   for(int k:arr2)
//                       System.out.print(k+"Y");
//                   System.out.println();
                   if(arr2.contains(d)) {
                       arr2.remove(new Integer(d));
                       map.put(e, arr2);
                   }
               }
               if(x==3)
               {
                   Set<Map.Entry<Integer,ArrayList<Integer>>> set=map.entrySet();
                   for(Map.Entry<Integer,ArrayList<Integer>> j:set)
                   {
                       ArrayList<Integer> arr=j.getValue();
                       int flag=0;
                       int c=0;
//                       System.out.print(j.getKey()+"K ");
                       for (int k:arr)
                       {
//                           System.out.print(k+" ");
                           if(map1.containsKey(k)) {
                               c++;
                               continue;
                           }

                           if(k<j.getKey())
                           {

                              flag=1;
                              break;
                           }
                       }
//                       System.out.println();
                       if(flag==0&&c!=j.getValue().size()&&j.getValue().size()!=0)
                           map1.put(j.getKey(),true);
                   }
                   Set<Map.Entry<Integer,Boolean>> s=map1.entrySet();
//                   for(Map.Entry<Integer,Boolean> g:s)
//                       System.out.print(g.getKey()+" ");
                   System.out.println(n-map1.size());
                   map1.clear();

               }








        }
        
    }

}
