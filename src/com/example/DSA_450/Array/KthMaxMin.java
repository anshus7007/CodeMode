package com.example.DSA_450.Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class KthMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k=sc.nextInt();
        int min = Integer.MAX_VALUE;
        int p=0;
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
                p=i;
            }
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(min);
        for (int i = 0; i < n; i++) {
            if(p==i)
                continue;
            if (a[i] >= stack.peek()) {
                    stack.push(a[i]);

            }

            else
            {
                int r = stack.pop();
                while(a[i]<r) {
                    stack.push(a[i]);
                    stack.push(r);

                }
            }
        }
//        for(int i=0;i<stack.size();i++)
//            System.out.print(stack.get(i)+" ");
        while (stack.size()!=k)
        {
            stack.pop();
            if (stack.size()==k)
                break;
        }
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty())
        {
            max=Math.max(max,stack.pop());
        }
        System.out.println(max);


    }


}
