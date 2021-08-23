package com.example.CodeChef.cp2021.July_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<4;i++)
            {
                int x=sc.nextInt();
                if(map.containsKey(x))
                    map.put(x,map.get(x)+1);
                else
                    map.put(x,1);
            }
            if(map.size()==1)
                System.out.println("0");
            else if(map.size()==2)
                System.out.println("1");
            else if(map.size()==3)
                System.out.println("2");
            else
                System.out.println("2");
            map.clear();

        }
    }


    }

