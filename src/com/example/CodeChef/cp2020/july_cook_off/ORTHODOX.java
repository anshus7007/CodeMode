package com.example.CodeChef.cp2020.july_cook_off;

import java.util.HashMap;
import java.util.Scanner;

public class ORTHODOX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            long[] a =new long[n];
            HashMap<Long,Integer> map= new HashMap<>();
            int even=0;int odd=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                if(map.containsKey(a[i]))
                {
                    map.put(a[i],map.get(a[i])+1);
                }
                else
                {
                    map.put(a[i],1);
                }

            }
            int flag=0;
                for (int i = 0; i < n - 1; i++) {
                    long sum = a[i];
                    for (int j = i + 1; j < n; j++) {
                        sum = sum | a[j];
                        if (map.containsKey(sum)) {
                            flag = 1;
                            break;
                        }
                        else
                            map.put(sum,1);
                    }
                }
                if (flag == 1)
                    System.out.println("NO");
                else
                    System.out.println("YES");


        }
    }
}
