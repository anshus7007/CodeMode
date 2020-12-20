package com.example;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            LinkedList ll = new LinkedList();

            for(int i = 1; i<=n; i++)
            {
                int a = sc.nextInt();
                ll.addNode(a);
            }

          ll.quickSort();
        }
    }
    public  static void sort(int[] a, int lo, int hi)
    {
        if(lo>=hi)
        {
            return ;
        }
        int mid=(lo+hi)/2;
        int pivot=a[mid];
        int left=lo,right=hi;

        while(left<=right)
        {
            // int ll=getNodeAt(h,left).data;
            // int rr=getNodeAt(h,right).data;
            while(a[left]<pivot)
            {
                left++;
                // ll=getNodeAt(h,left).data;
            }
            while(a[right]>pivot)
            {
                right--;
                // rr=getNodeAt(h,right).data;
            }
            if(left<=right)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        sort(a,lo,right);
        sort(a,left,hi);
    }


}