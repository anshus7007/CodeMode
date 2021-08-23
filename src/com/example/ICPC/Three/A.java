//package com.example.ICPC.Three;
//
//import com.example.CodeChef.cp2020.nov_lunchtime.Gasoline;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//class A {
//    static class Pair
//    {
//        long f;
//        long c;
//        Pair(long f,long c)
//        {
//            this.f=f;
//            this.c=c;
//        }
//
//        public Pair() {
//
//        }
//    }
//    static class MyComparator implements Comparator<Pair> {
//        public int compare(A.Pair a, A.Pair b) {
//            return (int)a.c - (int)b.c;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.println(Math.min(1,1));
//        int t=sc.nextInt();
//        while(t-->0) {
//            int n=sc.nextInt();
////
////            ArrayList<A.Pair> arr=new ArrayList<>();
////            for(int i=0;i<n;i++)
////            {
////                arr.add(new A.Pair());
////            }
//            int a[]=new int [n];
//            HashMap<Integer,Integer> map=new HashMap<>();
//            int b[]=new int[n];
//            for(int i=0;i<n;i++)
//            {
//                a[i]=sc.nextInt();
//                b[i]=a[i];
////                map.put(i,a[i]);
//            }
//            Arrays.sort(b);
//            ArrayList<Integer> p=new ArrayList<>();
//            ArrayList<Integer> q=new ArrayList<>();
//            int min=Integer.MAX_VALUE;
//            for(int i=1;i<n;i++)
//            {
//                min=Math.min(Math.abs(b[i]-b[i-1]),min);
//                if(Math.abs(b[i]-b[i-1])<min)
//                {
//                    min=Math.abs(b[i]-b[i-1]);
//                    p=i;
//                    q=i+1;
//                }
//            }
//
////            int index[]=new int[n];
////            int b[]=new int[n];
////            for(int i=0;i<n;i++)
////            {
////                arr.get(i).f=i;
////
////            }
////            for(int i=0;i<n;i++)
////            {
////                arr.get(i).c=a[i];
////            }
////            for(int i=0;i<n;i++)
////            {
////                map.put( (int) arr.get(i).f,i);
////            }
////            Collections.sort(arr, new A.MyComparator());
////            for(int i=0;i<n;i++)
////            {
////                arr.get(i)
////            }
//
//
//
//
//
//        }
//    }
//}
