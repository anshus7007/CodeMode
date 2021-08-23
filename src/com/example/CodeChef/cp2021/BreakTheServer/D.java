package com.example.CodeChef.cp2021.BreakTheServer;

import com.example.CodeChef.cp2020.nov_lunchtime.Gasoline;

import java.util.*;

class D {
    static class Pair
    {
        long f;
        long c;
        Pair(long f,long c)
        {
            this.f=f;
            this.c=c;
        }

        public Pair() {

        }
    }
    static class MyComparator implements Comparator<Pair> {
        public int compare(D.Pair a, D.Pair b) {
            return (int)a.f - (int)b.f;
        }
    }
    static class MyComparator2 implements Comparator<Pair> {
        public int compare(D.Pair a, D.Pair b) {
            return (int)a.c - (int)b.c;
        }
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int[] a = new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }
           int[] iq =new int[n];
           for(int i=0;i<n;i++)
           {
               iq[i]=sc.nextInt();
           }
            ArrayList<D.Pair> arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr.add(new D.Pair());
            }
            for(int i=0;i<n;i++)
            {
                arr.get(i).f=a[i];
            }
            for(int i=0;i<n;i++)
            {
                arr.get(i).c=iq[i];
            }
//            for(Pair i:arr)
//            {
//                System.out.println(i.f+" "+i.c);
//            }
            ArrayList<D.Pair> arr1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr1.add(new D.Pair());
            }
            for(int i=0;i<n;i++)
            {
                arr1.get(i).f=a[i];
            }
            for(int i=0;i<n;i++)
            {
                arr1.get(i).c=iq[i];
            }
            Stack<Pair> stack= new Stack<>();
            for(int i=0;i<arr.size();i++)
            {

                    if(stack.isEmpty())
                        stack.add(new Pair(arr.get(i).f,arr.get(i).c));
                    if(stack.peek().f<arr.get(i).f&&stack.peek().c>arr.get(i).c)
                        stack.add(new Pair(arr.get(i).f,arr.get(i).c));


            }


//            Stack<Pair> stack1= new Stack<>();
//            for(int i=0;i<arr1.size();i++)
//            {
//
//                    if(stack1.isEmpty())
//                        stack1.add(new Pair(arr1.get(i).f,arr1.get(i).c));
//                    if(stack1.peek().f<arr1.get(i).f&&stack1.peek().c>arr1.get(i).c)
//                        stack1.add(new Pair(arr1.get(i).f,arr1.get(i).c));
//
//
//            }
            System.out.println(stack.size());


        }
    }
}
